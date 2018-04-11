<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>详情填写</title>
    <link rel="stylesheet" href="./frame/layui/css/layui.css">
    <link rel="stylesheet" href="./frame/static/css/style.css">
    <link rel="icon" href="./frame/static/image/code.png">
</head>
<body class="body">


    
    <div class="layui-form-item">
        <label class="layui-form-label">出差地</label>
        
                <div class="layui-input-block">
                    <type="text" name="title" lay-verify="required" class="layui-input">
                        ${TravelInfoVo.travel_address }
                </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">开始时间</label>
        <div class="layui-input-inline">
            <type="text" name="username" lay-verify="required" class="layui-input">
            ${TravelInfoVo.travel_start }
        </div>
        <label class="layui-form-label">结束时间</label>
        <div class="layui-input-inline">
            <type="text" name="username" lay-verify="required" class="layui-input">
                ${TravelInfoVo.travel_end }
        </div>
        <label class="layui-form-label">合计天数</label>      
                <div class="layui-input-inline">
                    <type="text" name="username" lay-verify="required" class="layui-input">
                        ${TravelInfoVo.travel_date }
                </div>
                
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">工作目标</label>
        
                <div class="layui-input-block">
                    <type="text" name="title" lay-verify="required" class="layui-input">
                    ${TravelInfoVo.travel_target }
                </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">工作结果</label>
        
                <div class="layui-input-block">
                    <type="text" name="title" lay-verify="required" class="layui-input">
                    ${TravelInfoVo.travel_result }
                </div>
    </div>
   
    <div class="layui-form-item">
        <label class="layui-form-label">备注</label>
        
                <div class="layui-input-block">
                    <type="text" name="title" lay-verify="required" class="layui-input">
                        ${TravelInfoVo.travel_remark }
                </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">部门意见</label>
        
                <div class="layui-input-block">
                    <type="text" name="title" lay-verify="required" class="layui-input">
                        ${TravelInfoVo.status1_opinion }
                </div>
    </div>
    <form class="layui-form layui-form-pane" action="./FinancialApprovalServlet" method="get">
    <div class="layui-form-item">
        <label class="layui-form-label">财务意见</label>
        
                <div class="layui-input-block">
                    <input type="text" name="opinion" lay-verify="required" class="layui-input">
                </div>
    </div>
    
    <div class="layui-form-item">
        <button class="layui-btn layui-btn-small layui-btn-normal layui-btn-radius" name="type" value="agree" onclick="CloseWind()">通过</button>
        <button class="layui-btn layui-btn-small layui-btn-danger layui-btn-radius" name="type" value="refuse" onclick="CloseWind()">驳回</button>
    </div>
</form>

<script src="./frame/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript">
    layui.use(['form', 'layedit', 'laydate', 'element'], function () {
        var form = layui.form
                , layer = layui.layer
                , layedit = layui.layedit
                , laydate = layui.laydate
                , element = layui.element;

        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        //自定义验证规则
        form.verify({
            title: function (value) {
                if (value.length < 5) {
                    return '标题至少得5个字符啊';
                }
            }
            , pass: [/(.+){6,12}$/, '密码必须6到12位']
            , content: function (value) {
                layedit.sync(editIndex);
            }
        });

        //监听提交
        form.on('submit(sub)', function (data) {
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            });
            return false;
        });

        // you code ...
        

    });
</script>
<script src="frame/layui/layui.js" charset="utf-8"></script>
<script language="javascript" type="text/javascript" >
    	function CloseWind(){
    		var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
	        parent.layer.close(index);//关闭窗口
	}
</script>
</body>
</html>