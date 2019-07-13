<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>专升本管理系统</title>
    <link rel="stylesheet" href="css/init.css">
    <link rel="stylesheet" href="css/index.css">
    <script src="student/js/index.js"></script>
    <script src="js/jquery/jquery.js"></script>
    <script src="js/bootstrap/js/bootstrap.min.js"></script>
    <script>
        window.onload=function(){
            init();

            $.ajax({
                    url :  "getStudentName.do",//访问路径
                    type : "post",
                    async:false,
                    success :
                        function(messages){
                            $("#name").text("桌面（"+messages+"）");
                        }//查询成功处理函数
            })
        }
       
    </script>
</head>
<body>
    <div id="head">
        <div class="HLeft">
            <div class="HLeft_box">
                <div class="xiaohui_box"><img class="xiaohui" src="img/xiaohui.png" alt="湖北理工学院"></div>
                
                <p>“专升本”报名管理信息系统</p>
                <p><img class="logo" src="img/logo.png" alt=""></p>
            </div>
        </div>
        <div id="HRight">
            <p><a href="">我的桌面</a><span></span><a href="">修改密码</a><span></span><a href="LoginOut.do">重新登录</a><span></span><a href="">退出系统</a></p>
            <div>2019-02-23</div>
        </div>
    </div>
    <div id="middle">
        <div id="main_left">
            <div class="main_left_nav" style="background: #FFF;">
                <ul>
                    <li id="name">桌面（kwbbin）</li>
                    <li>注册</li>
                    <li>报名</li>
                    <li>审核查询</li>
                    <li>下载准考证</li>
                    <li>成绩查询</li>
                    <li>预录取查询</li>
                    <li>个人信息管理</li>
                    <li>通知公告</li>
                </ul>
            </div>
            
        </div>
        <iframe id="index_content" src="student/desk.html" frameborder="0">

        </iframe>
    </div>
    <div id="footer">
        <p><a href="">Copyright 2016-2018湖北理工学院版权所有邮编435003 技术支持计算机学院</a></p>
        <p><a href="">地址:湖北省黄石市桂林北路16号业务咨询电话: 0714-6358327(杨老师) 技术服务电话:15072052118 (张老师)</a></p>
    </div>
</body>
</html>