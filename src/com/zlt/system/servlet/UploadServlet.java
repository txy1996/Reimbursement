package com.zlt.system.servlet;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.alibaba.fastjson.JSONObject;
import com.zlt.system.entity.Bills;
import com.zlt.system.service.NewAppcationService;
import com.zlt.system.service.impl.NewApplicationServiceImpl;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//判断上传表单是否为multipart/form-data类型
    	if(ServletFileUpload.isMultipartContent(request))
        {
            NewAppcationService news = new NewApplicationServiceImpl();
            try {
            	 //1. 创建DiskFileItemFactory对象，设置缓冲区大小和临时文件目录
                DiskFileItemFactory factory = new DiskFileItemFactory();
                //System.out.println(System.getProperty("java.io.tmpdir"));//默认临时文件夹
                
                //2. 创建ServletFileUpload对象，并设置上传文件的大小限制。
                ServletFileUpload  sfu = new ServletFileUpload(factory);
                sfu.setSizeMax(10*1024*1024);//以byte为单位    不能超过10M  1024byte = 1kb  1024kb=1M 1024M = 1G
                sfu.setHeaderEncoding("utf-8");
                
                //3. 调用ServletFileUpload.parseRequest方法解析request对象，得到一个保存了所有上传内容的List对象。
                List<FileItem> fileItemList = sfu.parseRequest(request);
                Iterator<FileItem> fileItems = fileItemList.iterator();
                Bills bill = new Bills();
                //4. 遍历list，每迭代一个FileItem对象，调用其isFormField方法判断是否是上传文件
                while(fileItems.hasNext())
                {	
                	FileItem fileItem = fileItems.next();
                    //普通表单元素
                    if(fileItem.isFormField())
                    {
                        String name = fileItem.getFieldName();//name属性值
                        //String value = fileItem.getString("utf-8");//name对应的value值
                        bill.setApp_id(Integer.parseInt(fileItem.getString("utf-8")));
                        System.out.println(name + " = "+bill.getApp_id());
                    }
                    //<input type="file">的上传文件的元素
                    else
                    {
                        String fileName = fileItem.getName();//文件名称
                        System.out.println("原文件名：" + fileName);//Koala.jpg
                        
                        String suffix = fileName.substring(fileName.lastIndexOf('.'));
                        System.out.println("扩展名：" + suffix);//.jpg
                        
                        //新文件名（唯一）
                        String newFileName = new Date().getTime() + suffix;
                        System.out.println("新文件名：" + newFileName);//image\1478509873038.jpg
                        bill.setBills_img("image/"+newFileName); 
                        //5. 调用FileItem的write()方法，写入文件     "\\应用\\ecplise\\zlt\\WebContent\\image\\"
                        //"C:\\Users\\米邓勇\\Desktop\\ReimbursementSystem\\WebContent\\image\\"
                        File file = new File("C:\\Users\\米邓勇\\Desktop\\ReimbursementSystem\\WebContent\\image\\"+newFileName);
                        System.out.println(file.getAbsolutePath());
                        fileItem.write(file);
                        
                        //6. 调用FileItem的delete()方法，删除临时文件
                        fileItem.delete();
                        
                        /*
                         * 存储到数据库时注意
                         *     1.保存源文件名称   Koala.jpg
                         *  2.保存相对路径      image/1478509873038.jpg
                         * 
                         */ 
                        
                    }
                }
                //向数据库中的单价表插入数据
                boolean flag = news.addImg(bill);
                
                JSONObject json = new JSONObject();
                json.put("status",flag);
                PrintWriter out = response.getWriter();
        		out.println(json.toJSONString());
        		System.out.println(json.toJSONString());
            } catch (FileUploadException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}