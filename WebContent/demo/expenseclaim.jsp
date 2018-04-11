<%@page import="com.zlt.system.vo.ApplyreimVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="./frame/layui/css/layui.css">
    <link rel="stylesheet" href="./css/style.css">
    <link rel="icon" href="image/code.png">
    <script src="./layer/jquery.min.js"></script>
    <script src="./layer/layer.js"></script>
</head> 
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>报销申请审批</legend>
</fieldset>

<div class="my-btn-box">
   <form action="./ApplyreimServlet" method="get">
    <span class="fr">
        <span class="layui-form-label"style="height: 30px;width: 150px;">       </span>
        <div class="layui-input-inline">
        
        <input type="hidden" name="type" value="findbyid"/>
            <input type="text" placeholder="请输入单号" name="app_abb" class="layui-input">
        </div>       
       
    </span>
     <span class="fr">
      
   <div class="layui-input-inline">
        
        <input type="hidden" name="type" value="findbyname"/>
            <input type="text" placeholder="请输入报销人" name="emp_name" class="layui-input">
        </div>       
      
       <div class="layui-input-inline">
        
        <input type="hidden" name="type" value="findbytype"/>
            <input type="text" placeholder="请输入报销住宿类型" name="reim_type" class="layui-input">
        </div>       
        <button type="submit" class="layui-btn mgl-20">查询</button>
    </span>
    <button class="layui-btn mgl-20"><a href="./ApplyreimServlet?type=findall">刷新</a></button>
    </form>
</div>

<table id="dateTable" class="layui-table">
    <thead>
    
    <tr>
        <th><input type="checkbox" class="my-checkbox" /></th>
        <th>报销单号</th>
        <th>报销人</th>
        <th>报销类型</th>
        <th>总金额</th>
        <th>部门</th>
        <th>操作</th>
    </tr>
    </thead>
    <%
    List<ApplyreimVo> list=(List<ApplyreimVo>)request.getAttribute("list");
     for(ApplyreimVo app:list){
    
    %>
    <tbody>
    <tr>
   	
        <td><input type="checkbox" class="my-checkbox" /></td>
        <td><%=app.getApp_abb() %></td>
        <td><%=app.getEmp_name() %></td>
        <td><%=app.getReim_type() %></td>
      	 <td><%=app.getMoney() %></td>
        <td><%=app.getDepartment_name() %></td>
        <td>
            <button class="layui-btn layui-btn-small layui-btn-radius" onclick="iframeFunc3(this.value)"value="<%=app.getApp_abb() %>">查看详情</button>
            
        </td>
    </tr>
    <%} %>
    
    
    </tbody>
</table>

<script type="text/javascript" src="./frame/layui/layui.js"></script>
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

        // 表格选中
        $('#dateTable tbody').on( 'click', 'tr input[type="checkbox"]', function () {
            var obj = $(this).parent().parent();
            if(this.checked){
                obj.addClass('selected');
            }else{
                obj.removeClass('selected');
            }
        });

        // 全选和反选
        $('#dateTable thead').on( 'click', 'tr input[type="checkbox"]', function () {
            var obj = $("#dateTable tbody input[type='checkbox']:checkbox");
            if(this.checked){
                obj.prop("checked", true);
            }else{
                obj.prop("checked", false);
            }
        });
    });
</script>
<script type="text/javascript">
    function iframeFunc3(val) {
            layer.open({
                type:2,
                title:'查看详情',
                shadeClose:true,
                shade:0.5,
                area:['85%','95%'],
                content:['./ApplyreimServlet?type=findtype&app_abb='+val,'no']
            })
        }
    </script>
</body>
</html>