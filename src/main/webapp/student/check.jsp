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
    <title>报名申请表</title>
    <style>
        body{
            background: #fff;
        }
        table{
            /*border-left: 1px solid #000;*/
            /*border-top: 1px solid #000;*/
            border-left: 1px solid #666;
            border-top: 1px solid #666;
        }
        table td{
            padding: 0 5px;
            min-width: 40px;;
            height: 40px;
            text-align: center;
            /*border-right: 1px solid #000;*/
            /*border-bottom: 1px solid #000;*/
            border-right: 1px solid #666;
            border-bottom: 1px solid #666;
        }
        table #image{
            display: inline-block;
            width:100px;
        }

        .btn{
            display: inline-block;
            width:70px;
            height:30px;
            line-height: 30px;
            text-align: center;
            border: 1px solid #999;
            background: #f3f3f3;
            border-radius: 3px;
            margin-right: 10px;
            cursor: pointer;
        }

        #position p{
            padding-top: 5px;
            font-size: 13px;
            text-align: left;
        }

        #position p .span1{
            font-size: 13px;
            color: #81D3F8;
        }

        #position p .span2{
            font-size: 13px;
            color: #AAAAAA;
        }

        #position p .span3{
            font-size: 13px;
            color: #D9001B;
        }
    </style>
</head>
<body style="text-align: center;">
<div id="position"><p> <span class="span1">桌面  </span> <span class="span2">>> </span><span class="span3"> 审核状态查询  </span></p></div>
<c:choose>
    <c:when test="${student2.checked== '0'}">
        <div style="border-bottom: 1px solid #999;border-top: 1px solid #999;height:45px;line-height: 45px;font-size: 30px;padding:10px 0;margin:20px 0;">等待院校审核！</div>
    </c:when>
    <c:when test="${student2.checked== '1'}">
        <div style="border-bottom: 1px solid #999;border-top: 1px solid #999;height:45px;line-height: 45px;font-size: 30px;padding:10px 0;margin:20px 0;">审核预通过！</div>
    </c:when>
    <c:when test="${student2.checked== '2'}">
        <div style="border-bottom: 1px solid #999;border-top: 1px solid #999;height:45px;line-height: 45px;font-size: 30px;padding:10px 0;margin:20px 0;">恭喜您审核通过！</div>
    </c:when>
    <c:when test="${student2.checked== '3'}">
        <div style="border-bottom: 1px solid #999;border-top: 1px solid #999;height:45px;line-height: 45px;font-size: 30px;padding:10px 0;margin:20px 0;">审核未通过！</div>
    </c:when>
</c:choose>

<%--<div style="border-bottom: 1px solid #999;border-top: 1px solid #999;height:45px;line-height: 45px;font-size: 30px;padding:10px 0;margin:20px 0;">审核通过</div>--%>
<div id="table">
    <p style="text-align: center;color: #666;margin-top: 50px;font-weight: bold;">个人信息</p>
    <table cellspacing="0" style="font-size: 15px;margin:0 auto;">
        <tr>
            <td><span id="name">姓名</span></td>
            <td><span id="name1">${student2.name}</span></td>
            <td ><span id="sex">性别</span></td>
            <td><span id="sex1">${student2.sex}</span></td>
            <td><span id="nation">民族</span></td>
            <td><span id="nation1">${student2.nation}</span></td>
            <td rowspan="4" ><span id="image" style="display:inline-block;height:100%;width:110px;"><img style="width:100%;height:98%;" src="../${student2.image}" alt=""></span></td>
        </tr>
        <tr>
            <td><span id="birthday">出生日期</span></td>
            <td><span id="birthday1"><fmt:formatDate value='${student2.borthday}' pattern='yyyy-MM-dd'/></span></td>
            <td  colspan="2"><span id="policy">政治面貌</span></td>
            <td colspan="2"><span id="policy1">${student2.policy}</span></td>
        </tr>
        <tr>
            <td><span id="identityCard">身份证号</span></td>
            <td  colspan="5"><span id="identityCard1">${student2.identityCard}</span></td>
        </tr>
        <tr>
            <td><span id="zunkaozheng">高考报名号</span></td>
            <td colspan="5"><span id="zunkaozheng1">${student2.zunkaozheng}</span></td>
        </tr>
        <tr>
            <td><span id="collegeid">所在院校</span></td>
            <td  colspan="2"><span id="collegeid1">${student2.collegeName}</span></td>
            <td colspan="2"><span id="professionid">毕业专业</span></td>
            <td colspan="2"><span id="professionid1">${student2.professionName}</span></td>
        </tr>
        <tr>
            <td><span id="tocollege">报考高校</span></td>
            <td colspan="6"><span id="tocollege1">${student2.toCollegeName}</span></td>
        </tr>
        <tr>
            <td><span id="toprofession">报考专业</span></td>
            <td  colspan="2"><span id="toprofession1">${student2.toProfessionName}</span></td>
            <td colspan="2"><span id="toprofessionCode">报考专业代码</span></td>
            <td colspan="2"><span id="toprofessionCode1">${student2.toProfessionName}</span></td>
        </tr>
        <tr>
            <td><span id="college">在校期间受过何种奖励</span></td>
            <td  colspan="4"><span >${student2.award}</span></td>
            <td ><span>有何特长</span></td>
            <td ><span>${student2.merit}</span></td>
        </tr>
        <tr>
            <td><span >家庭住址</span></td>
            <td  colspan="4"><span id="">${student2.homeAdress}</span></td>
            <td ><span id="">联系电话</span></td>
            <td><span id="">${student2.phone}</span></td>
        </tr>
    </table>

</div>
</body>
</html>
