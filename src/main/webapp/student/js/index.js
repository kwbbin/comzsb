function init() {
    var state;

    var frame=document.getElementById("index_content");
    var left_nav=document.getElementById("main_left");
    var oLi=left_nav.getElementsByTagName("li");
    for(var i=0;i<oLi.length;i++){
        oLi[i].setAttribute("i",i);
        oLi[i].onclick=function(){
            if(this.getAttribute("i")==0){
                frame.src="student/desk.html";
                // alert("待开发");
            }else if(this.getAttribute("i")==1){
                frame.src="student/desk.html";
                alert("您已注册");
            }else if(this.getAttribute("i")==2){
                frame.src="student/apply.html";
            }else if(this.getAttribute("i")==3){
                $.ajax({
                    url :  "student/getStudentState.do",//访问路径
                    type : "post",
                    async:false,
                    success :
                        function(messages){
                            if(messages!=""){
                                state=messages;
                            }
                        }//查询成功处理函数
                });
                if(state<3){
                    alert("请先完成报名！");
                }else{
                    frame.src="student/check.do";
                }

            }else if(this.getAttribute("i")==4){
                // frame.src="joinInfo.html";
                alert("待开发");
            }else if(this.getAttribute("i")==5){
                // frame.src="check.jsp";
                alert("待开发");
            }else if(this.getAttribute("i")==6){
                // frame.src="desk.html";
                alert("待开发");
            }else if(this.getAttribute("i")==7){
                frame.src="student/searchInfo.html";
            }else if(this.getAttribute("i")==8){
                // frame.src="desk.html";
                alert("待开发");
            }
        };
    }
    
 }
 
