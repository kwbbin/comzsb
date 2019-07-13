function init() {

    var nav=document.getElementById("nav");
    var oLi=nav.getElementsByTagName("li");
    for(var i=0;i<oLi.length;i++){
        oLi[i].setAttribute("i",i);
        oLi[i].onclick=function(){
            for(var i=0;i<oLi.length;i++){
                var name="form"+i;

                var oForm1=document.getElementById(name);
                oForm1.style.setProperty('display','none');
                oLi[i].classList.remove("active");

            }
            this.classList.add("active");

            var name="form"+this.getAttribute("i");
            var oForm=document.getElementById(name);
            oForm.style.setProperty('display','block');
        };
    }

    // 科目弹出框1
    $("#btn_add_project").click(function(){
        $("#mubu").fadeIn("slow");
        $("#box_suject_add").fadeIn("slow");
    });
    // 科目弹出框关闭1
    $("#colse_suject_add").click(function () {
        $("#mubu").fadeOut("slow");
        $("#box_suject_add").fadeOut("slow");
    });



    // 专业弹出框1
    $("#btn_add_profession").click(function(){
        getProfession();
        $("#mubu").fadeIn("slow");
        $("#box_profession_add").fadeIn("slow");
    });
    // 专业弹出框关闭1
    $("#colse_profession_add").click(function () {
        $("#mubu").fadeOut("slow");
        $("#box_profession_add").fadeOut("slow");
    });

    // 学校弹出框1
    $("#btn_add_school").click(function(){
        $("#mubu").fadeIn("slow");
        $("#box_college_add").fadeIn("slow");
    });
    // 学校弹出框关闭1
    $("#colse_college_add").click(function () {
        $("#mubu").fadeOut("slow");
        $("#box_college_add").fadeOut("slow");
    });




}

function updateSubject(obj) {
    $("#mubu").fadeIn("slow");
    $("#box_suject_update").fadeIn("slow");
    $("#colse_suject_update").bind("click",function () {
        $("#box_suject_update").fadeOut("slow");
        $("#mubu").fadeOut("slow");
    })

    $.ajax({
        url :  "getSubjectById.do?id="+obj.getAttribute("id"),//访问路径
        type : "post",
        async : false,
        success : function(subject){
            $("#subjectId_update").val(obj.getAttribute("id"));
            $("#subjectNum_update").val(subject.subjectNum);
            $("#subjectName_update").val(subject.subjectName);
        }
    });
}

function updateSubject_submit() {
    $.ajax({
        type: "POST",//方法类型
        url: "updateSubject.do",//url
        data: "id="+$("#subjectId_update").val()+"&subjectNum="+$("#subjectNum_update").val()+"&subjectName="+$("#subjectName_update").val(),
        success: function (messages) {
            if(messages=="true"){
                $("#box_suject_update").fadeOut("slow");
                $("#mubu").fadeOut("slow");
                alert("修改成功");
                $("#formForeTable")[0].innerHTML="<tr><th>科目编号</th><th>科目名称</th><th></th><th></th></tr>";
                getFormFiveAjax();
            }else{
                alert("异常");
            }
        }
    })
}

function updateProfession(obj) {
    $("#mubu").fadeIn("slow");
    $("#box_profession_update").fadeIn("slow");
    $("#colse_profession_update").bind("click",function () {
        $("#box_profession_update").fadeOut("slow");
        $("#mubu").fadeOut("slow");
    });

    $.ajax({
        url :  "getAllSubject.do",//访问路径
        type : "post",
        async : false,
        success :
            function(messages){
                $("#subjectOne_update")[0].innerHTML="<option style=\"color:#999;\">请选择</option>";
                $("#subjectTwo_update")[0].innerHTML="<option style=\"color:#999;\">请选择</option>";
                $("#subjectThree_update")[0].innerHTML="<option style=\"color:#999;\">请选择</option>";
                $("#subjectfour_update")[0].innerHTML="<option style=\"color:#999;\">请选择</option>";
                for(var i=0;i<messages.length;i++){
                    var option=$("<option value='"+messages[i].id+"'>"+messages[i].subjectName+"</option>");
                    $("#subjectOne_update").append(option);

                }
                for(var i=0;i<messages.length;i++){
                    var option=$("<option value='"+messages[i].id+"'>"+messages[i].subjectName+"</option>");
                    $("#subjectTwo_update").append(option);

                }for(var i=0;i<messages.length;i++){
                    var option=$("<option value='"+messages[i].id+"'>"+messages[i].subjectName+"</option>");
                    $("#subjectThree_update").append(option);

                }for(var i=0;i<messages.length;i++){
                    var option=$("<option value='"+messages[i].id+"'>"+messages[i].subjectName+"</option>");
                    $("#subjectfour_update").append(option);

                }
            }//查询成功处理函数
    });

    $.ajax({
        url :  "getProfessionById.do?id="+obj.getAttribute("id"),//访问路径
        type : "post",
        async : false,
        success : function(message){
            $("#professionId_update").val(obj.getAttribute("id"));
            $("#professionCode_update").val(message.proOrder);
            $("#professionName_update").val(message.proName);
            $("#xz_update").val(message.xz);
            $("#subjectOne_update").val(message.subjectone);
            $("#subjectTwo_update").val(message.subjecttwo);
            $("#subjectThree_update").val(message.subjectthree);
            $("#subjectfour_update").val(message.subjectfore);


        }
    });
}


function updateProfession_submit(){
    $.ajax({
        type: "POST",//方法类型
        url: "updateProfession.do",//url
        data: "proNum="+$("#professionId_update").val()+"&proOrder="+$("#professionCode_update").val()+"&xz="+$("#xz_update").val()+"&proName="+$("#professionName_update").val()+"&subjectone="+$("#subjectOne_update").val()+"&subjecttwo="+$("#subjectTwo_update").val()+"&subjectthree="+$("#subjectThree_update").val()+"&subjectfore="+$("#subjectfour_update").val(),
        success: function (messages) {
            if(messages=="true"){
                $("#box_profession_update").fadeOut("slow");
                $("#mubu").fadeOut("slow");
                alert("修改成功");
                $("#formFiveTable")[0].innerHTML="<tr><th>专业代码</th><th>专业名称</th><th>考试（专业）排序</th><th>学制</th><th>考试科目一</th><th>考试科目二</th><th>考试科目三</th><th>考试科目四</th><th></th></tr>";
                getFormSixAjax();
            }else{
                alert("异常");
            }
        }
    })
}

function updateCollege(obj) {
    $("#mubu").fadeIn("slow");
    $("#box_college_update").fadeIn("slow");
    $("#colse_college_update").bind("click",function () {
        $("#box_college_update").fadeOut("slow");
        $("#mubu").fadeOut("slow");
    })

    $.ajax({
        url :  "getCollegeById.do?id="+obj.getAttribute("id"),//访问路径
        type : "post",
        async : false,
        success : function(message){
            $("#collegeId_update").val(obj.getAttribute("id"));
            $("#collegeName_update").val(message.collegeName);
        }
    });
}


function updateCollege_submit() {
    $.ajax({
        type: "POST",//方法类型
        url: "updateCollege.do",//url
        data: "collegeId="+$("#collegeId_update").val()+"&collegeName="+$("#collegeName_update").val(),
        success: function (messages) {
            if(messages=="true"){
                $("#box_college_update").fadeOut("slow");
                $("#mubu").fadeOut("slow");
                alert("修改成功");
                $("#CollgeManage")[0].innerHTML="<tr><th colspan=\"4\">高校名称</th></tr>";
                getFormsevenAjax();
            }else{
                alert("异常");
            }
        }
    })
}

function addSubject(){
        if($("#subjectNum").val()==""||$("#subjectName").val()==""){
            alert("请填写科目编号和名称！");
        }else{
            $.ajax({
                url :  "addSubject.do",//访问路径
                type : "post",
                data:"subjectNum="+$("#subjectNum").val()+"&subjectName="+$("#subjectName").val(),
                success :
                    function(messages){
                        if(messages!=null&&messages!=""){
                            var tr=$("<tr><td>"+messages.subjectNum+"</td><td>"+messages.subjectName+"</td></tr>");

                            tr.append($("<td> <a  href=\"javascript:void(0);\" id='"+messages.id+"' onclick='updateSubject(this);'>修改</a> </td>"));//updateSubject.do?id="+messages[i].id+"
                            tr.append($("<td> <a class='subject' id='"+messages.id+"' href=\"javascript:void(0);\">删除</a> </td>"));//deleteSubject.do?id="+messages[i].id+"
                            $("#formForeTable").append(tr);
                        }
                    }//查询成功处理函数
            });
        }
}

function getProfession() {
    // 添加科目
    $.ajax({
        url :  "getAllSubject.do",//访问路径
        type : "post",
        async : false,
        success :
            function(messages){
                for(var i=0;i<messages.length;i++){
                    var option=$("<option value='"+messages[i].id+"'>"+messages[i].subjectName+"</option>");
                    $("#subjectOne").append(option);

                }
                for(var i=0;i<messages.length;i++){
                    var option=$("<option value='"+messages[i].id+"'>"+messages[i].subjectName+"</option>");
                    $("#subjectTwo").append(option);

                }for(var i=0;i<messages.length;i++){
                    var option=$("<option value='"+messages[i].id+"'>"+messages[i].subjectName+"</option>");
                    $("#subjectThree").append(option);

                }for(var i=0;i<messages.length;i++){
                    var option=$("<option value='"+messages[i].id+"'>"+messages[i].subjectName+"</option>");
                    $("#subjectfour").append(option);

                }
            }//查询成功处理函数
    });
    // $("#profession_profession_add")
}



function addProfession() {
    if($("#professionCode").val()!=""&&$("#professionName").val()!=""&&$("#professionNowNum").val()!=""&&$("#xz").val()!=""&&$("#subjectOne")[0].selectedIndex!=0&&$("#subjectTwo")[0].selectedIndex!=0&&$("#subjectThree")[0].selectedIndex!=0&&$("#subjectfour")[0].selectedIndex!=0){
        $.ajax({
            type: "POST",//方法类型
            dataType: "json",//预期服务器返回的数据类型
            url: "addProfession.do" ,//url
            data: $('#form_add_pfofession').serialize(),
            success: function (messages) {
                if(messages!=null&&messages!=""){
                    var subjectOne;
                    var subjectTwo;
                    var subjectThree;
                    var subjectFour;
                    $.ajax({
                        url :  "getSubjectById.do?id="+messages.subjectone,//访问路径
                        type : "post",
                        async : false,
                        success : function(subject){
                            subjectOne=subject.subjectName;
                        }
                    });
                    $.ajax({
                        url :  "getSubjectById.do?id="+messages.subjecttwo,//访问路径
                        type : "post",
                        async : false,
                        success : function(subject){
                            subjectTwo=subject.subjectName;
                        }
                    });
                    $.ajax({
                        url :  "getSubjectById.do?id="+messages.subjectthree,//访问路径
                        type : "post",
                        async : false,
                        success : function(subject){
                            subjectThree=subject.subjectName;
                        }
                    });
                    $.ajax({
                        url :  "getSubjectById.do?id="+messages.subjectfore,//访问路径
                        type : "post",
                        async : false,
                        success : function(subject){
                            subjectFour=subject.subjectName;
                        }
                    });
                    var tr=$("<tr><td>"+messages.proOrder+"</td><td>"+messages.proName+"</td><td>0</td><td>"+messages.xz+"</td><td>"+subjectOne+"</td><td>"+subjectTwo+"</td><td>"+subjectThree+"</td><td>"+subjectFour+"</td></tr>");


                    tr.append($("<td> <a  href=\"javascript:void(0);\"id='"+messages.proNum+"' onclick='updateProfession(this)'>修改</a></td>"));
                    $("#formFiveTable").append(tr);
                }
            },
            error : function() {
                alert("异常！");
            }
        });
    }else{
        alert("请完整填写信息");
    }
}

function addCollege(){
    if($("#collegeName").val()==""){
        alert("请填写学校名称！");
    }else{
        $.ajax({
            url :  "addCollege.do",//访问路径
            type : "post",
            data:"collegeName="+$("#collegeName").val(),
            success :
                function(messages){
                    if(messages!=null&&messages!=""){
                        var tr=$("<tr><td>"+messages.collegeId+"</td><td>"+messages.collegeName+"</td></tr>");

                        tr.append($("<td> <a   href=\"javascript:void(0);\" id='"+messages.collegeId+"' onclick='updateCollege(this);'>修改</a> </td>"));//updateSubject.do?id="+messages[i].id+"
                        tr.append($("<td> <a class='collegeA' id='"+messages.collegeId+"' href=\"javascript:void(0);\">删除</a> </td>"));//deleteSubject.do?id="+messages[i].id+"
                        $("#CollgeManage").append(tr);
                    }
                }//查询成功处理函数
        });
    }
}




function getFormOneAjax(){
    var id;
    $.ajax({
        url :  "getBaseinformation.do",//访问路径
        type : "post",
        async : false,
        success :
            function(messages){
                if(messages.collegeId!=null){
                    id=messages.collegeId;
                }

            }//查询成功处理函数
    });
    $.ajax({
        url :  "getAllCollege.do",//访问路径
        type : "post",
        success :
            function(messages){
                if(id==null||id==""){
                    for(var i=0;i<messages.length;i++){
                        var option=$("<option value='"+messages[i].collegeId+"'>"+messages[i].collegeName+"</option>");
                        $("#myCollege").append(option);
                    }
                }else{
                    for(var i=0;i<messages.length;i++){
                        if(id==messages[i].collegeId){
                            var option=$("<option selected value='"+messages[i].collegeId+"'>"+messages[i].collegeName+"</option>");
                            $("#myCollege").append(option);
                        }else{
                            var option=$("<option value='"+messages[i].collegeId+"'>"+messages[i].collegeName+"</option>");
                            $("#myCollege").append(option);
                        }

                    }
                }

            }//查询成功处理函数
    });
}

function getFormTwoAjax() {
    $.ajax({
        url :  "getBaseinformation.do",//访问路径
        type : "post",
        success :
            function(messages){
                if(messages.year!=null){
                    $("#applyYear")[0].value=messages.year;
                }
            }//查询成功处理函数
    });


}
function getFormThreeAjax() {
    $.ajax({
        url :  "getBaseinformation.do",//访问路径
        type : "post",
        success :
            function(messages){
                if(messages.registerBegin!=null){
                    $("#registerBegin")[0].value=timestampToTime(messages.registerBegin);
                }
                if(messages.registerEnd!=null){
                    $("#registerEnd")[0].value=timestampToTime(messages.registerEnd);
                }
                if(messages.joinBegin!=null){
                    $("#joinBegin")[0].value=timestampToTime(messages.joinBegin);
                }
                if(messages.joinEnd!=null){
                    $("#joinEnd")[0].value=timestampToTime(messages.joinEnd);
                }
                if(messages.checkBegin!=null){
                    $("#checkBegin")[0].value=timestampToTime(messages.checkBegin);
                }
                if(messages.checkEnd!=null){
                    $("#checkEnd")[0].value=timestampToTime(messages.checkEnd);
                }
                if(messages.dowloadBegin!=null){
                    $("#dowloadBegin")[0].value=timestampToTime(messages.dowloadBegin);
                }
                if(messages.dowloadEnd!=null){
                    $("#dowloadEnd")[0].value=timestampToTime(messages.dowloadEnd);
                }
                if(messages.gradeBegin!=null){
                    $("#gradeBegin")[0].value=timestampToTime(messages.gradeBegin);
                }
                if(messages.gradeEnd!=null){
                    $("#gradeEnd")[0].value=timestampToTime(messages.gradeEnd);
                }
                if(messages.projoinBegin!=null){
                    $("#projoinBegin")[0].value=timestampToTime(messages.projoinBegin);
                }
                if(messages.projoinEnd!=null){
                    $("#projoinEnd")[0].value=timestampToTime(messages.projoinEnd);
                }
            }//查询成功处理函数
    });
}
function getFormForeAjax() {
    $.ajax({
        url :  "getSubjectTime.do",//访问路径
        type : "post",
        success :
            function(messages){
                for(var i=0;i<messages.length;i++){
                    if(messages[i].subjectId==1&&messages[i].subjectTime!=null){

                        $("#examone")[0].value=timestampToTime(messages[i].subjectTime);
                    }
                    if(messages[i].subjectId==2&&messages[i].subjectTime!=null){
                        $("#examtwo")[0].value=timestampToTime(messages[i].subjectTime);
                    }
                    if(messages[i].subjectId==3&&messages[i].subjectTime!=null){
                        $("#examthree")[0].value=timestampToTime(messages[i].subjectTime);
                    }
                    if(messages[i].subjectId==4&&messages[i].subjectTime!=null){
                        $("#examfore")[0].value=timestampToTime(messages[i].subjectTime);
                    }
                }

            }//查询成功处理函数
    });
}

function getFormFiveAjax(){
    $.ajax({
        url :  "getAllSubject.do",//访问路径
        type : "post",
        async : false,
        success :
            function(messages){
                for(var i=0;i<messages.length;i++){
                    var tr=$("<tr><td>"+messages[i].subjectNum+"</td><td>"+messages[i].subjectName+"</td></tr>");
                    tr.append($("<td> <a  href=\"javascript:void(0);\" onclick='updateSubject(this)' id='"+messages[i].id+"'>修改</a> </td>"));//updateSubject.do?id="+messages[i].id+"
                    tr.append($("<td> <a class='subject' id='"+messages[i].id+"' href=\"javascript:void(0);\">删除</a> </td>"));//deleteSubject.do?id="+messages[i].id+"

                    $("#formForeTable").append(tr);
                }
            }//查询成功处理函数
    });


    //科目删除
    var subject=document.getElementsByClassName("subject");

        $(document).on("click",".subject",function () {
            This=this;
            // This.getAttribute("id")
            $.ajax({
                url :  "deleteSubject.do",//访问路径
                type : "post",
                data:"id="+This.getAttribute("id"),
                success :
                    function(messages){
                        if(messages=="true"||messages==true){
                            $(This).parent().parent().remove();
                        }else{
                            alert("无法删除，此数据被占用");
                        }
                    }//查询成功处理函数
            });

        });
    }


function getFormSixAjax(){
    $.ajax({
        url :  "getAllProfession.do",//访问路径
        type : "post",
        success :
            function(messages){
                for(var i=0;i<messages.length;i++){
                    var td1=$("<td></td>");
                    var td2=$("<td></td>");
                    var td3=$("<td></td>");
                    var td4=$("<td></td>");
                    $.ajax({
                        url :  "getSubjectById.do?id="+messages[i].subjectone,//访问路径
                        type : "post",
                        async : false,
                        success : function(subject){
                            td1.text(subject.subjectName);
                        }
                    });
                    $.ajax({
                        url :  "getSubjectById.do?id="+messages[i].subjecttwo,//访问路径
                        type : "post",
                        async : false,
                        success : function(subject){
                            td2.text(subject.subjectName);
                        }
                    });
                    $.ajax({
                        url :  "getSubjectById.do?id="+messages[i].subjectthree,//访问路径
                        type : "post",
                        async : false,
                        success : function(subject){
                            td3.text(subject.subjectName);
                        }
                    });
                    $.ajax({
                        url :  "getSubjectById.do?id="+messages[i].subjectfore,//访问路径
                        type : "post",
                        async : false,
                        success : function(subject){
                            td4.text(subject.subjectName);
                        }
                    });
                    // <td>"+select+"</td><td>"+select+"</td><td>"+select+"</td><td>"+select+"</td>"+"<td> <a href=\"\">修改</a> </td>"
                    var tr=$("<tr><td>"+messages[i].proOrder+"</td><td>"+messages[i].proName+"</td><td>"+messages[i].nowNum+"</td><td>"+messages[i].xz+"</td></tr>");
                    tr.append(td1);
                    tr.append(td2);
                    tr.append(td3);
                    tr.append(td4);
                    tr.append($("<td> <a  href=\"javascript:void(0);\" id='"+messages[i].proNum+"' onclick='updateProfession(this)'>修改</a> </td>"));

                    $("#formFiveTable").append(tr);
                }
            }//查询成功处理函数
    });


};


function getFormsevenAjax(){
    $.ajax({
        url :  "getAllCollege.do",//访问路径
        type : "post",
        async : false,
        success :
            function(messages){
                for(var i=0;i<messages.length;i++){
                    var tr=$("<tr><td>"+messages[i].collegeId+"</td><td>"+messages[i].collegeName+"</td></tr>");
                    tr.append($("<td> <a href=\"javascript:void(0);\" id='"+messages[i].collegeId+"' onclick='updateCollege(this)'>修改</a> </td>"));
                    tr.append($("<td> <a class='collegeA' id='"+messages[i].collegeId+"' href=\"javascript:void(0)\">删除</a> </td>"));

                    $("#CollgeManage").append(tr);
                }
            }//查询成功处理函数
    });

    //院校删除
    var collegeA=document.getElementsByClassName("collegeA");
    // for (var i=0;i<collegeA.length;i++) {
        $(document).on("click",".collegeA", function () {
            This = this;
            $.ajax({
                url: "deleteCollege.do",//访问路径
                type: "post",
                data: "id=" + This.getAttribute("id"),
                success:
                    function (messages) {
                        if (messages == "true") {
                            $(This).parent().parent().remove();
                        }else{
                            alert("无法删除，该数据已被占用");
                        }
                    }//查询成功处理函数
            });

        });


}

function checkForm() {
    // form1的检查
    $("#myCollege").bind("change",changeFunction)
    function changeFunction() {
        if($("#myCollege")[0].selectedIndex==0){;
            $("#formOneSubmit").bind("click",clickSubmit);
        }else{
            $('#formOneSubmit').unbind("click",clickSubmit);
        }
    }
    function clickSubmit(event){
        alert("请选择院校");
        event.preventDefault();  //阻止默认行为 ( 表单提交 )

    }


    // form3的检查


}

// 转换时间格式
function timestampToTime(timestamp) {
    var date = new Date(timestamp);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
    Y = date.getFullYear() + '-';
    M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
    D = date.getDate() + ' ';
    h = date.getHours() + ':';
    m = date.getMinutes() + ':';
    s = date.getSeconds();
    return Y+M+D+" "+h+m+s;
}