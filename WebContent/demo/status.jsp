<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/"+request.getContextPath()+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<base href="<%=basePath %>">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>审批状态查询</title>
    <link rel="stylesheet" href="frame/layui/css/layui.css">
    <!--<link rel="stylesheet" href="http://cdn.datatables.net/1.10.13/css/jquery.dataTables.min.css">-->
    <link rel="stylesheet" href="css/style.css">
    <link rel="icon" href="image/code.png">
    <script src="layer/jquery.min.js"></script>
    <script src="layer/layer.js"></script>
</head>
<body>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>审批状态查询</legend>
</fieldset>

<div class="my-btn-box">
    <span class="fr">
        <span class="layui-form-label">       </span>
        <form action="StatusServlet?type=selectLike" method="post">
        <div class="layui-input-inline">
            <input name="likeString" type="text" autocomplete="off" placeholder="请输入模糊查询字段" class="layui-input">
        </div>
        <button class="layui-btn mgl-20">查询</button>
        </form>
    </span>
</div>

<table id="dateTable" class="layui-table">
    <thead>
    <tr>
        <th>报销单号</th>
        <th>报销人</th>
        <th>申报日期</th>
        <th>报销类型</th>
        <th>报销金额</th>
        <th>审批结果</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${statusList }" var="statusVO" >
    <tr>
        <td>${statusVO.app_abb }</td>
        <td>${statusVO.emp_name }</td>
        <td>${statusVO.travel_time }</td>
        <td>${statusVO.reim_type }</td>
        <td>${statusVO.travel_money }</td>
        <td>${statusVO.status_result }</td>  
        <td>    
            <button class="layui-btn layui-btn-small layui-btn-radius" onclick="iframeFunc3(this.value)" value="${statusVO.app_abb }">查看详情</button>
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>

<script type="text/javascript" src="frame/layui/layui.js"></script>
<!-- jQuery -->
<script type="text/javascript" charset="utf8" src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="http://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
<script type="text/javascript">
    layui.use(['element'], function(){
        var $ = layui.jquery;

        // 初始化表格
        $('#dateTable').DataTable({
            "dom": '<"top">rt<"bottom"flp><"clear">',
            "autoWidth": false,                     // 自适应宽度
            "stateSave": true,                      // 刷新后保存页数
            "order": [[ 0, "desc" ]],               // 排序
            "searching": false,                     // 本地搜索
            "info": true,                           // 控制是否显示表格左下角的信息
            "stripeClasses": ["odd", "even"],       // 为奇偶行加上样式，兼容不支持CSS伪类的场合
            "aoColumnDefs": [{                      // 指定列不参与排序
                "orderable": false,
                "aTargets": [0,6]                   // 对应你的表格的列数
            }],
            "pagingType": "simple_numbers",         // 分页样式 simple,simple_numbers,full,full_numbers
            "language": {                           // 国际化
                "url":'language.json'
            }
        });
    }
</script>
<script type="text/javascript">
    function iframeFunc3(val) {
    	layer.open({
            	type:2,
                title:'查看详情',
                shadeClose:true,
                shade:0.5,
                area:['90%','95%'],
                content:['StatusServlet?type=selectDetails&app_abb='+val,'no']
            });
        }
    </script>
</body>
</html>