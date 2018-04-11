<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ "/" + request.getContextPath() + "/";
%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>历史记录查询</title>
<style type="text/css">
a: {
	text-decoration: none underline;
}

table.hovertable {
	font-family: verdana, arial, sans-serif;
	font-size: 11px;
	margin-top: 10px;
	color: #333333;
	border-width: 1px;
	border-color: #999999;
	border-collapse: collapse;
}

table.hovertable th {
	background-color: #c3dde0;
	border-width: 1px;
	font-size: 16px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}

table.hovertable tr {
	background-color: #d4e3e5;
}

table.hovertable td {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}

.layui-form-item {
	margin-left: 20px;
	right: 350px;
	top: 10px;
}

.layui-input {
	margin-left: 15px;
}
</style>
</head>

<body>
	<div class="demoTable">
		<div class="demoTable">
			<form action="HistoryRecordServlet?type=findLike" method="post"
				display:inline-block;>
				<div class="layui-form-item">
					<div class="layui-input-block">
						<select name="thismonth" lay-filter="aihao">
							<option value="1">当月</option>
							<option value="3" selected="">三月内</option>
							<option value="6">半年</option>
							<option value="12">当年</option>
							<option value="99">更久</option>
						</select> <input class="layui-input" type="text" name="value"
							id="demoReload" placeholder="输入模糊字段"  value="">
						<input type="submit" name="" id="" value="搜索" />
					</div>
				</div>
			</form>
		</div>
	</div>
	<!--单行选择框 -->
	<table class="hovertable">
		<tr>
			<th width="60">创建人</th>
			<th width="90">创建日期 <a href="HistoryRecordServlet?type=replace">▼</a>
			</th>
			<th width="90">报销单号</th>
			<th width="90">报销类型</th>
			<th width="90">所属部门</th>
			<th width="90">所属项目</th>
			<th width="90">报账总额</th>
			<th width="150">事由</th>
			<th width="200">备注</th>
		</tr>
		<c:forEach items="${list}" var="History">
			<tr onmouseover="this.style.backgroundColor='#ffff66';"
				onmouseout="this.style.backgroundColor='#d4e3e5';">
				<td>${History.emp_name }</td>
				<td>${History.other_time }</td>
				<td>${History.app_abb }</td>
				<td>${History.reimbursementtype_type }</td>
				<td>${History.department_name }</td>
				<td>${History.other_title }</td>
				<td>${History.other_money }</td>
				<td>${History.other_reason }</td>
				<td>${History.remarks }</td>
			</tr>
		</c:forEach>
	</table>
</body>

</html>






