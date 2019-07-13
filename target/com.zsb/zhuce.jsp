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
    <title>注册</title>
      <script src="js/zhuce.js"></script>
      <script src="js/jquery/jquery.js"></script>
      <script src="js/jquery/jquery.validate.min.js"></script>
      <script src="js/jquery/biaodanyanzen.js"></script>
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
          padding-bottom: 0px;
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
          font-size: 30px;
          text-align: center;
          margin-bottom: 10px;
          margin-top: 15px;
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
          width:100px;
          text-align: right;
      }

      #box_content label.error{
          color: #d9001b;
          display: inline-block;
          width:200px;
      }

      #box_content span.yzm{
          display: inline-block;
          width:60px;
          line-height: 25px;
          text-align: center;
          margin-left: 20px;
          padding: 2px 5px;
          height:25px;
          background: rgba(215, 215, 215, 1);
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

      span.login_btn{
          border-radius: 5px;
          text-align: center;
          line-height: 35px;
          display: inline-block;
          margin-left: 40px;
          width:80px;
          outline: none;
          border: none;
          font-size: 14px;
        height:35px;
        background: rgba(22, 155, 213, 1);
        color:#fff;

      }

    

      input[type="submit"]{
          background: rgba(22, 155, 213, 1);
          cursor: pointer;
          z-index: 99;
      }



      #login_box{
          font-size: 14px;
          display: inline-block;
          width:80px;
          border-radius: 5px;
          height:35px;
          background: #999;
          border:5px;
          text-align: center;
          line-height: 35px;
          color:#fff;
          margin-left: -84px;
          font-size: 13px;
          z-index: 44;
          /* display: none; */
          
      }

    </style>
      <script>

          $().ready(function() {
// 在键盘按下并释放及提交后验证提交表单
              $("#zhuceForm").validate({
                  rules: {
                      phone: {
                          required: true,
                          isMobile: true,
                          remote: {          //远程ajax验证
                              url: "getStudentByPhone.do", //检查是否存在账号，存在则返回true
                              type: "post",
                              dataType: "json",
                              data: {
                                  phone: function () {
                                      return $("#phone").val(); //这个是取要验证的用户名
                                  }
                              },
                              dataFilter: function (data) {  //判断控制器返回的内容
                                          var notice = eval("(" + data + ")");
                                          if (notice) {
                                              return false;
                                          } else {
                                              return true;
                                          }
                              }
                              }
                      },
                      password: {
                              required: true,
                              minlength: 6,
                              maxlength: 16
                      },
                      password_: {
                              required: true,
                              minlength: 6,
                              maxlength: 16,
                              equalTo: "#password"
                      },
                      email: {
                              required: true,
                              email: true
                      },
                      name: {
                              required: true,
                              maxlength: 10
                      },
                      identityCard: {
                              required: true,
                              isIdCardNo: true
                      }
                  },
                  messages: {
                          phone: {
                              required: "请填写手机号码",
                              isMobile: "请输入正确的手机号码",
                              remote: "用户名已存在！"
                          },
                          name: {
                              required: "请输入用户名",
                              minlength: "用户名必需由两个字母组成"
                          },
                          password: {
                              required: "请输入密码",
                              minlength: "密码长度不能小于 6 个字母",
                              maxlength: "密码长度不能大于 16 个字母"
                          },
                          password_: {
                              required: "请输入密码",
                              minlength: "密码长度不能小于 6 个字母",
                              maxlength: "密码长度不能大于 16 个字母",
                              equalTo: "两次密码输入不一致"
                          },
                          email: "请输入一个正确的邮箱",
                          identityCard: "请正确填写身份证号码"
                  }
              })
          });
      </script>
    <script>
window.onload=function(){
    init();

    var logoin=document.getElementById("logoin");;
    
}
        function myChecked(){
            var login_box=document.getElementById("login_box");

            if(checked.checked==false){
                login_box.setAttribute("display","inline-block");
                login_box.setAttribute("style","height:35px;margin-left:-84px;;");
            }else if(checked.checked==true){
                login_box.setAttribute("display","none");
                login_box.setAttribute("style","height:0;margin-left:0;overflow: hidden;");
            };

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
              <form action="register.do" id="zhuceForm">
                  <div>
                      <label for="">手机号：</label><input id="phone" name="phone" type="text">
                  </div>
                  <div>
                      <label for="">密码：</label><input id="password" name="password" type="password">
                  </div>
                  <div>
                      <label for="">确认密码：</label><input name="password_" id="password_" type="password">
                  </div>
                  <div>
                      <label for="">姓名：</label><input id="name" name="name" type="text">
                  </div>
                  <div>
                      <label for="">身份证号：</label><input id="identityCard" name="identityCard" type="text">
                  </div>
                  <div>
                      <label for="">安全邮箱：</label><input id="email" name="email" type="text">
                  </div>
                  <div>
                      <label for="">密保问题1：</label>
                      <select class="" name="question1" id="question1" style="width:172px;height:28px;">
                      </select>
                  </div>
                  <div>
                      <label for="">问题1答案：</label><input name="ansQuestionOne" type="text">
                  </div>
                  <div>
                      <label for="">密保问题2：</label>
                      <select id="question2" name="question2" class="" style="width:172px;height:28px;">
                      </select>
                  </div>
                  <div>
                      <label for="">问题2答案：</label><input name="ansQuestionTwo" type="text">
                  </div>
                  <div style="font-size: 12px;">
                      <input onclick="myChecked(this)" id="checked" type="checkbox" value="">我已同意<a style="color: #d9001b;" href="">服务条款</a>
                  </div>
                  <div style="padding-top: 10px;">
                      <span id="logoin" onclick="isnoLogin(this)"  class="login_btn" >注册</span>
                      <span id="login_box">注册</span>
                  </div>
              </form>
          </div>
      </div>
    </div>
  <script>
      function isnoLogin(event){
          var registerBegin;
          var registerEnd;
          var now=new Date().getTime();
          $.ajax({
              url :  "getBaseinformation.do",//访问路径
              type : "post",
              async:false,
              success :
                  function(messages){
                      if(messages!=""){
                          registerBegin=messages.registerBegin;
                          registerEnd=messages.registerEnd;
                      }
                  }//查询成功处理函数
          });

          if(now>registerBegin&&now<registerEnd){
              $("#zhuceForm").submit();
          }else{
              alert("当前没到注册时间");
          }
      }
  </script>
  </body>
</html>
