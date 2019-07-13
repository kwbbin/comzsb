function myFunManage() {
     var frame=document.getElementById("index_content");
     $.ajax({
         url :  "myFunManage.do",//访问路径
         type : "post",
         success :
             function(messages){
                 for(var i=0;i<messages.length;i++){
                     var oLi=$("<li>"+messages[i].fName+"</li>");
                     oLi[0].setAttribute("myurl",messages[i].fUrl);
                     oLi.bind('click', function(event) {
                         var str=this.getAttribute("myurl")+".html";
                         frame.src=str;
                     });
                     $("#middle_ul").append(oLi);

                 }

             }//查询成功处理函数
     });
 }