<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="<%=basePath%>">    
<meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="frame/layui/css/layui.css"  media="all">
</head>
<body>
<!-- <img alt="a.png" src="image/1516769935967.png"> -->
 <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
  <legend>上传票据</legend>
</fieldset>
 
<div class="layui-upload">
	<% String id =request.getParameter("id");
	%>
  <button  class="layui-btn" id="test2">添加票据</button>
  <button  type="button" class="layui-btn" id="btn" value="上传">上传</button>
  <blockquote class="layui-elem-quote layui-quote-nm" style="margin-top: 10px;">
    预览图：
    <div class="layui-upload-list" id="demo2"></div>
 </blockquote>
 
</div> 

<script src="frame/layui/layui.js" charset="utf-8"></script>

<script>
layui.use('upload', function(){
  var $ = layui.jquery
  ,upload = layui.upload;
  var id =<%=id%>
  upload.render({
    elem: '#test2'
    ,url: 'UploadServlet'
    ,multiple: true //允许多文件上传
    ,auto:false //选择文件后不自动上传
    ,exts: 'gif|jpg|jpeg|png|bmp|png' //只允许上传图片文件
    ,bindAction:"#btn" //上传触发
    ,data: {"id":id}
    ,choose: function(obj){
    //将每次选择的文件追加到文件队列
    var files = obj.pushFile();
      obj.preview(function(index, file, result){
    	 // alert("file.name:"+index);
    	$('#demo2').append('<div style="display:inline;position:relative"  class=" '+index+' "></div>');
        $('.'+index).append('<img src="'+ result +'" style="width:130px;height:130px"  alt="'+ file.name +'"  ></img>');
        $('.'+index).append('<button type="button" class="layui-btn layui-btn-small layui-btn-normal" style="position:absolute;top:74px;left:30px" id="'+index+'"><i class="layui-icon">&#xe640;</i> 删除</button>');
        $("#"+index).click(function(){
        	delete files[index];
        	$('.'+index).remove();
        })
      });
    }
    ,done: function(res){
    	layer.msg(JSON.stringify(res));
    	if(res.status == true){
    		  var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
    	        parent.layer.close(index);//关闭窗口
    	}
    } 
  });
  
 
  
});
</script>

</body>
</html>