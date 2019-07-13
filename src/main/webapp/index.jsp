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
    <link href="js/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery/jquery.js"></script>
    <script src="js/bootstrap/js/bootstrap.min.js"></script>
    <script src="js/index.js"></script>
    <script>
        window.onload=function(){
            // init();
            myFunManage();
            $("#nowDate").text(timestampToTime(new Date()));

            // 转换时间格式
            function timestampToTime(timestamp) {
                var date = new Date(timestamp);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
                Y = date.getFullYear() + '-';
                M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
                D = date.getDate() + ' ';
                h = date.getHours() + ':';
                m = date.getMinutes() + ':';
                s = date.getSeconds();
                return Y+M+D;
            }
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
            <div id="nowDate">2019-02-23</div>
        </div>
    </div>
    <div id="middle">
        <div id="main_left">
            <div class="main_left_nav" style="background: #fff;">
                <ul id="middle_ul">
<%--                    <li>桌面</li>--%>
<%--                    <li>基础信息管理</li>--%>
<%--                    <li>注册管理</li>--%>
<%--                    <li>报名信息管理</li>--%>
<%--                    <li>审核管理</li>--%>
<%--                    <li>考场安排管理</li>--%>
<%--                    <li>成绩管理</li>--%>
<%--                    <li>录取管理</li>--%>
<%--                    <li>管理员信息管理</li>--%>
                </ul>
            </div>
            
        </div>
        <iframe id="index_content" src="desk.html" frameborder="0">

        </iframe>
    </div>
    <div id="footer">
        <p style="margin-bottom: 4px;"><a href="">Copyright 2016-2018湖北理工学院版权所有邮编435003 技术支持计算机学院</a></p>
        <p><a href="">地址:湖北省黄石市桂林北路16号业务咨询电话: 0714-6358327(杨老师) 技术服务电话:15072052118 (张老师)</a></p>
    </div>
</body>
</html>