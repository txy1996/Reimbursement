<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <meta charset="utf-8">
  <title>layui</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <!-- <link rel="stylesheet" href="../frame/layui/css/layui.css"> -->
  <link rel="stylesheet" href="./frame/layui/css/layui.css">
  <script src="./layer/jquery.min.js"></script>
  <script src="./layer/layer.js"></script> 
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>  
<div style="margin-bottom: 5px;">          
 
<!-- 示例-970 -->
<!-- <ins class="adsbygoogle" style="display:inline-block;width:970px;height:90px" data-ad-client="ca-pub-6111334333458862" data-ad-slot="3820120620"></ins> -->
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;" >
    <legend>财务管理</legend>
</fieldset>
</div>
<form class="layui-form layui-form-pane" action="./FinanceServlet" method="get">
		<input type="hidden" name="type" value="a"/>
		
        <div class="layui-form-item">
            <label class="layui-form-label">报销ID</label>
            <div class="layui-input-inline">
            
                
              <input type="text" name="name" id="name" class="layui-form-label" / >
              <button type="submit" style="height: 37px;width: 70px;">查询</button>
            </div>
        </div>
        
      </form>
  <!-- <input type="hidden" name="type" value="selectbyid"/>  -->

 <table class="layui-table">
 
    <thead>
        <tr>
          <th lay-data="{field:'financeid',width:'100'}">财务ID</th>
          <th lay-data="{field:'reiid',width:'100'}">报销ID</th>
          <th lay-data="{field:'attn',  sort: true,width:'100'}" >经办人</th>
          <th lay-data="{field:'reiid',width:'100'}">时间
          
          </th>
          <th lay-data="{field:'reiid',width:'100'}">金额</th>
          <th lay-data="{field:'attn',  sort: true,width:'100'}" >报销方式</th>
          <th lay-data="{field:'attn',width:'100'}">报销状态</th>
          <th lay-data="{toolbar: '#barDemo',width:'100'}">操作</th>
        </tr>
      </thead>
      <c:forEach items="${list }" var="Finance">  
      <tr>
      	<th lay-data="{field:'financeid',width:'100'}">${Finance.finance_id }</th>
      	<th lay-data="{field:'reiid',width:'100'}">${Finance.app_abb }</th>
      	<th lay-data="{field:'attn',  sort: true,width:'100'}" >${Finance.finance_attn }</th>
      	<th lay-data="{field:'attn',  sort: true,width:'100'}" >${Finance.finance_date }</th>
      	<th lay-data="{field:'reiid',width:'100'}">${Finance.finance_money }</th>
      	<th lay-data="{field:'attn',  sort: true,width:'100'}" >${Finance.finance_payment}</th>
      	<th lay-data="{field:'attn',width:'100'}">${Finance.finance_status }</th>
      	<th lay-data="{toolbar: '#barDemo',width:'100'}"><a href="./FinanceServlet?type=delete&delete=${Finance.finance_id }">通过并支付</a></th>
      </tr>
      </c:forEach>
      
</table> 

 <center>
 	${bar }
 </center>


<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-xs" onclick="iframeFunc3()" >查看</a>
</script>
               
          
<script type="text/javascript" src="./frame/layui/layui.js"></script>
<script>
   
layui.use('table', function(){
});
</script>

</body>
</html>