function init() { 
    var nav=document.getElementById("nav");
    var oLi=nav.getElementsByTagName("li");
        for(var i=0;i<oLi.length;i++){
                oLi[i].setAttribute("i",i);
            oLi[i].onclick=function(){
                $("#studentSearchTable")[0].innerHTML="";
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

        // 弹出框
        $("#btn_add_project").click(function(){
            var formStr='<div class="form-group"><label for="firstname" class="col-sm-4 control-label">'
            +'学校名称</label><div class="col-sm-10"><input type="text" class="form-control" id="firstname" '
            +'placeholder="学校名称"> </div></div><br><input type="submit" style="position: absolute;bottom:20px;" class="btn btn-default"></input>';
            $("#box_for_form4").css("display","block");
            $(".box_form4_content_form").append(formStr);
        });

        // 弹出框
        $("#btn_add_profession").click(function(){
            var formStr='<div class="form-group"><label for="firstname" class="col-sm-4 control-label">'
            +'学校名称</label><div class="col-sm-10"><input type="text" class="form-control" id="firstname" '
            +'placeholder="学校名称"> </div></div><br><input type="submit" style="position: absolute;bottom:20px;" class="btn btn-default"></input>';
            $("#box_for_form4").css("display","block");
            $(".box_form4_content_form").append(formStr);
        });

        // 弹出框
        $("#btn_add_school").click(function(){
            var formStr='<div class="form-group"><label for="firstname" class="col-sm-4 control-label">'
            +'学校名称</label><div class="col-sm-10"><input type="text" class="form-control" id="firstname" '
            +'placeholder="学校名称"> </div></div><br><input type="submit" style="position: absolute;bottom:20px;" class="btn btn-default"></input>';
            $("#box_for_form4").css("display","block");
            $(".box_form4_content_form").append(formStr);
        });
        
        $("#box_for_form4_img").click(function(){
            $("#box_for_form4").css("display","none");
        });
 }
