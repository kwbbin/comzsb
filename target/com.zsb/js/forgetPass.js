axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded';
Vue.prototype.$axios = axios;

var app=new Vue({
    el:"#app",
    data:{
        id:'',
        questionOne:"",
        questionTwo:"",
        myAnswer1:"",
        myAnswer2:""
    },methods: {
        getData:function () {
            axios.post("getQuestionByUserId.do",Qs.stringify({
                    phone:this.id
                }),

                {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}

                ).then((response)=>{
                    if(response.data.length==2){
                        this.questionOne = response.data[0].question;
                        this.questionTwo = response.data[1].question;
                    }else if(response.data.length==1){
                        this.questionOne = response.data[0].question;
                        this.questionTwo = response.data[0].question;
                    }else{
                        alert("用户名不存在");
                    }
                })
                .catch(function (error) { // 请求失败处理
                    console.log(error);
                });
            },
        submitData:function () {
            axios.post("equilQuestion.do",Qs.stringify({
                    phone:this.id,
                    myAnswer1:this.myAnswer1,
                    myAnswer2:this.myAnswer2
                }),
                {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}
                ).then((response)=>{
                if(response.data==true){
                    alert("密保正确，您的密码已重置为身份证后六位！！！")
                }else{
                    alert("密保错误！");
                }
            }) .catch(function (error) { // 请求失败处理
                    console.log(error);
                });
        }

    }
});
