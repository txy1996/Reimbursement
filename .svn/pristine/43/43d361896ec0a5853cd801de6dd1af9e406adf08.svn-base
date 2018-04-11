<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
    <title>其他报销详情</title>
    <link rel="stylesheet" href="frame/layui/css/layui.css">
    <link rel="stylesheet" href="frame/static/css/style.css">
    <link rel="icon" href="frame/static/image/code.png">
</head>
<body class="body">

<form class="layui-form layui-form-pane" action="">
    
     <div class="layui-form-item">
        <label class="layui-form-label">报销编号</label>    
                <div class="layui-input-block">
                   <input disabled="disabled" type="text" name="title" class="layui-input" value="${statusDetailVO.app_abb }"/>
                </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">报销人</label>
        <div class="layui-input-inline">
            <input disabled="disabled" type="text" name="title" class="layui-input" value="${statusDetailVO.emp_name }"/>
        </div>
        <label class="layui-form-label">报销类型</label>
        <div class="layui-input-inline">
            <input disabled="disabled" type="text" name="title" class="layui-input" value="${statusDetailVO.reim_type }"/>
        </div>
        <label class="layui-form-label">项目名称</label>      
                <div class="layui-input-inline">
                   <input disabled="disabled" type="text" name="title" class="layui-input" value="${statusDetailVO.other_titel }"/>
                </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">报销原因</label>    
                <div class="layui-input-block">
                   <input disabled="disabled" type="text" name="title" class="layui-input" value="${statusDetailVO.other_reason }"/>
                </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">合计总额</label>
        <div class="layui-input-inline">
            <input disabled="disabled" type="text" name="title" class="layui-input" value="${statusDetailVO.other_money }"/>
        </div>
        <label class="layui-form-label">提交时间</label>      
                <div class="layui-input-inline">
                   <input disabled="disabled" type="text" name="title" class="layui-input" value="${statusDetailVO.other_time }"/>
                </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">备注</label>
        
                <div class="layui-input-block">
                    <input disabled="disabled" type="text" name="title" class="layui-input" value="${statusDetailVO.other_remarks }"/>
                </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">主管意见</label>
        <div class="layui-input-inline">
            <input disabled="disabled" type="text" name="title" class="layui-input" value="${statusDetailVO.status1 }"/>
        </div>
        <label class="layui-form-label">审批时间</label>
        <div class="layui-input-inline">
            <input disabled="disabled" type="text" name="title" class="layui-input" value="${statusDetailVO.status1_time }"/>
        </div>
        <label class="layui-form-label">主管备注</label>      
                <div class="layui-input-inline">
                   <input disabled="disabled" type="text" name="title" class="layui-input" value="${statusDetailVO.status1_opinion }"/>
                </div>
    </div>
   <div class="layui-form-item">
        <label class="layui-form-label">财务意见</label>
        <div class="layui-input-inline">
            <input disabled="disabled" type="text" name="title" class="layui-input" value="${statusDetailVO.status2 }"/>
        </div>
        <label class="layui-form-label">审批时间</label>
        <div class="layui-input-inline">
            <input disabled="disabled" type="text" name="title" class="layui-input" value="${statusDetailVO.status2_time }"/>
        </div>
        <label class="layui-form-label">财务备注</label>      
                <div class="layui-input-inline">
                   <input disabled="disabled" type="text" name="title" class="layui-input" value="${statusDetailVO.status2_opinion }"/>
                </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">最终结果</label>    
                <div class="layui-input-block">
                   <input disabled="disabled" type="text" name="title" class="layui-input" value="${statusDetailVO.status_result }"/>
                </div>
    </div>
</form>

<script src="frame/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript">
function custom_close(){
	 window.onbeforeunload=null;
	}

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
</body>
</html>