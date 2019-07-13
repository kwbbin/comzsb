function init(){
    $.ajax({
        url :  "getAllQuestion.do",//访问路径
        type : "post",
        success :
            function(messages){
                for(var i=0;i<messages.length;i++){
                    var option=$("<option value='"+(i+1)+"'>"+messages[i].question+"</option>");
                    $("#question1").append(option);

                }
                for(var i=0;i<messages.length;i++){
                    var option=$("<option value='"+(i+1)+"'>"+messages[i].question+"</option>");
                    $("#question2").append(option);
                }

            }//查询成功处理函数
    });
}
