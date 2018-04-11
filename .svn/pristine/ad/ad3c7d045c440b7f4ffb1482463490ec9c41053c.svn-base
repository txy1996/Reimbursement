package com.zlt.system.util;


import java.util.ArrayList;
import java.util.List;

import com.zlt.system.entity.Finance;
/**
 * 分页工具类
 * @author fy
 *
 */
public class DataUtil {
	
	/**
	 * 建立一个新的集合，先判断每页显示多少，再返回集合
	 * @param list
	 * @param num
	 * @param page
	 * @return list
	 */
	public List<Finance> pagingData(List<Finance> list,int num,int page){
		List<Finance> newlist=new ArrayList<>();
		for(int i=(page-1)*num;i<page*num &&i<list.size();i++){
			newlist.add(list.get(i));
		}
		
		return newlist;
	}
	
	/*
	 * 导航栏，上一页，下一页,可变字符串stringbuffer
	 * 参数：找到现在是第几页page，
	 * 写一个查询的方法，FinanceServlet method，可变的
	 */
	public StringBuffer creatrBar(List<Finance> list,int num,int page,String method){
		StringBuffer bar=new StringBuffer();
		int pages=(list.size()-1)/num+1;
		if(page>1){
		bar.append("<a href='"+method+"?page="+(page-1)+"&&type="+("findall")+"'>上一页</a>");
		}
		
		for(int i=1;i<=pages;i++){
			if(i==page){
				bar.append("["+i+"]");
			}else{
				bar.append("<a href='"+method+"?page="+i+"&&type="+("findall")+"'>"+i+"</a>");
			}
			bar.append("      ");
		}
		if(page<pages){
		bar.append("<a href='"+method+"?page="+(page+1)+"&&type="+("findall")+"'>下一页</a>");	
		}
		//判断上一页，下一页显示问题，当显示第一页时，就每页上一页，显示最后一页时，没有下一页
		return bar;
		
	}
	
	/**
	 * 处理数据异常
	 * 当请求异常时，就把显示页置为默认的第一页
	 */
	
	public int CorverInt(String sdata,int n){
		int data=n;
		try {
			data=Integer.parseInt(sdata);
			if(data<=0){
				throw new Exception();
			}
		} catch (Exception e) {
			// TODO: handle exception
			data=n;
		}
		return data;
	}
}
