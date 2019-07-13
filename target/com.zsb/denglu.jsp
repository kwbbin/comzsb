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
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>登录</title>
      <script src="js/jquery/jquery.js"></script>
    <style>
      body {
        background: url("img/timg.png") no-repeat;
        background-size: 100%;
        padding-top: 40px;
      }

      #box{
          width:70%;
          min-height:500px;
            background: rgba(255, 255, 255, 0.7);
            border-radius: 5px;
            margin: 0 auto;
      }

      #box1{
          padding-bottom: 60px;
      }

      .clearfix:after { 
content: "." ; 
display: block ;
height: 0 ;
clear: both ;
visibility: hidden ;
}
      #box #xiaohui{
          /* border: 1px solid red; */
          padding-top: 20px;
          padding-left: 200px;
      }
      #box .xiaohui_box {
        width: 100px;
        height: 100px;
        overflow: hidden;
        float: left;
        border-radius: 50%;
        position: relative;
      }
      #box .xiaohui_box img {
        position: relative;
        left: -19px;
        height: 100px;
        float: left;
      }
      #box .logo {
        height: 70px;
        width: 400px;
        padding-left: 50px;
      }

      #box_content{
          width:650px;
          min-height: 300px;
          background: rgba(255, 255, 255, 0.6);
          margin: 0 auto;
          border-radius: 5px;
            box-shadow: 5px 5px 5px rgba(127,127,127,0.34902);
      }

      #box_content .title{
          color:#567a86;
          padding: 10px 0;
          font-size: 35px;
          text-align: center;
      }

      a{
          text-decoration: none;
      }

      #box_content div{
          padding-left: 200px;
        padding-bottom: 10px;
      }

      #box_content label{
          color: #567a86;
          display: inline-block;
          width:80px;
          text-align: right;
      }



      #box_content a.forget{
          display: inline-block;
          font-size: 13px;
          margin-left: 10px;
          vertical-align: bottom;
          color: #6475e9;
      }
      input[type="text"]{
        widows: 205px;
        height:18px;
        padding: 3px 2px 3px 2px;
        font-size: 13px;
        border: 1px solid rgba(159, 187, 195, 1);
        outline: none;
        padding-left: 5px;
      }

      input.login_btn{
          border-radius: 5px;
          text-align: center;
          line-height: 35px;
          display: inline-block;
          margin-left: 40px;
          width:80px;
          outline: none;
          border: none;
        height:35px;
        background: rgba(22, 155, 213, 1);
        color:#fff;

      }

      a.zhuce{
          border-radius: 5px;
          text-align: center;
          line-height: 35px;
          display: inline-block;
        width:80px;
        height:35px;
        background: rgba(22, 155, 213, 1);
        color:#fff;
        margin-left: 20px;
      }
      #refresh{
          display: inline-block;
          position: relative;
          left:22px;
          top:5px;
          width:25px;
          height:25px;
          vertical-align: middle;
          cursor: pointer;
      }
        #yzm_img{
            display: inline-block;
            position: relative;
            top: 15px;
            left:10px;
        }

    </style>
      <script>
          window.onload=function (ev) {
              alterYzm();
          }
          
          function alterYzm() {
              $('#yzm_img').attr("src", "verificationCode.do?timestamp=" + (new Date()).valueOf());
          }
      </script>
  </head>
  <body>
    <div id="box">
      <div id="box1">
          <div id="xiaohui" class="clearfix">
                <div class="xiaohui_box">
                    <img class="xiaohui" src="img/xiaohui.png" alt="湖北理工学院" />
                </div>
                      <p><img class="logo" src="img/logo.png" alt="" /></p>
            
          </div>
          <div id="box_content">
              <p class="title">“专升本”信息管理系统</p>
              <form action="Login.do" method="post">
                  <div>
                      <label for="">用户名：</label><input id="phone" name="phone" placeholder="手机号码" type="text">
                  </div>
                  <div>
                      <label for="">密码：</label><input id="password" name="password" type="text">
                  </div>
                  <div style="position: relative;">
                      <label for="">验证码：</label><input id="yzm" name="yzm" type="text"><img id="yzm_img" src="verificationCode.do" alt=""><img onclick="alterYzm()" id="refresh" src="img/refresh.png" alt="">
                  </div>
                  <div style="padding-top: 10px;">
                      <input type="submit" class="login_btn" value="登录"><a href="zhuce.jsp" class="zhuce">注册</a><a class="forget" href="forgetPass.html">忘记密码？</a>
                  </div>
              </form>
          </div>
      </div>
    </div>
  </body>
</html>
