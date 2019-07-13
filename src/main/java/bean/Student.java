package bean;

import java.util.Date;

public class Student {
    int id;
    String name;
    String password;
    String sex;
    String nation;
    String policy;
    Date borthday;
    String identityCard;
    String zunkaozheng;
    int collegeid;
    int professionid;
    int toCollegeid;
    int toprofessionid;
    String award;
    String merit;
    String homeAdress;
    String phone;
    String nowAdress;
    String email;
    String wbh;
    Date jointime;
    String checked;
    int isnojoin;
    int questionOne;
    String ansQuestionOne;
    int questionTwo;
    String ansQuestionTwo;
    int state;
    String image;
    String postcode;


    public Student() {
    }

    public Student(String name, String password, String identityCard, String phone, String email, int questionOne, String ansQuestionOne, int questionTwo, String ansQuestionTwo) {
        this.name = name;
        this.password = password;
        this.identityCard = identityCard;
        this.phone = phone;
        this.email = email;
        this.questionOne = questionOne;
        this.ansQuestionOne = ansQuestionOne;
        this.questionTwo = questionTwo;
        this.ansQuestionTwo = ansQuestionTwo;
    }

    public Student(String phone, String password) {
        this.password = password;
        this.phone = phone;
    }

    public Student(String name, String password, String identityCard, String phone, String email, String wbh, int questionOne, String ansQuestionOne, int questionTwo, String ansQuestionTwo) {
        this.name = name;
        this.password = password;
        this.identityCard = identityCard;
        this.phone = phone;
        this.email = email;
        this.wbh = wbh;
        this.questionOne = questionOne;
        this.ansQuestionOne = ansQuestionOne;
        this.questionTwo = questionTwo;
        this.ansQuestionTwo = ansQuestionTwo;
    }

    public Student(int id, String name, String password, String sex, String nation, String policy, Date borthday, String identityCard, String zunkaozheng, int collegeid, int professionid, int toCollegeid, int toprofessionid, String award, String merit, String homeAdress, String phone, String nowAdress, String email, String wbh, Date jointime, String checked, int isnojoin, int questionOne, String ansQuestionOne, int questionTwo, String ansQuestionTwo, int state, String image, String postcode) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.nation = nation;
        this.policy = policy;
        this.borthday = borthday;
        this.identityCard = identityCard;
        this.zunkaozheng = zunkaozheng;
        this.collegeid = collegeid;
        this.professionid = professionid;
        this.toCollegeid = toCollegeid;
        this.toprofessionid = toprofessionid;
        this.award = award;
        this.merit = merit;
        this.homeAdress = homeAdress;
        this.phone = phone;
        this.nowAdress = nowAdress;
        this.email = email;
        this.wbh = wbh;
        this.jointime = jointime;
        this.checked = checked;
        this.isnojoin = isnojoin;
        this.questionOne = questionOne;
        this.ansQuestionOne = ansQuestionOne;
        this.questionTwo = questionTwo;
        this.ansQuestionTwo = ansQuestionTwo;
        this.state = state;
        this.image = image;
        this.postcode = postcode;
    }

    public Student(int id, String name, String password, String sex, String nation, String policy, Date borthday, String identityCard, String zunkaozheng, int collegeid, int professionid, int toCollegeid, int toprofessionid, String award, String merit, String homeAdress, String phone, String nowAdress, String email, String wbh, Date jointime, String checked, int isnojoin, int questionOne, String ansQuestionOne, int questionTwo, String ansQuestionTwo, int state) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.nation = nation;
        this.policy = policy;
        this.borthday = borthday;
        this.identityCard = identityCard;
        this.zunkaozheng = zunkaozheng;
        this.collegeid = collegeid;
        this.professionid = professionid;
        this.toCollegeid = toCollegeid;
        this.toprofessionid = toprofessionid;
        this.award = award;
        this.merit = merit;
        this.homeAdress = homeAdress;
        this.phone = phone;
        this.nowAdress = nowAdress;
        this.email = email;
        this.wbh = wbh;
        this.jointime = jointime;
        this.checked = checked;
        this.isnojoin = isnojoin;
        this.questionOne = questionOne;
        this.ansQuestionOne = ansQuestionOne;
        this.questionTwo = questionTwo;
        this.ansQuestionTwo = ansQuestionTwo;
        this.state = state;
    }

    public Student(String name, String sex, String nation, String policy, Date borthday, String zunkaozheng, int collegeid, int professionid, int toCollegeid, int toprofessionid, String award, String merit, String homeAdress, String nowAdress, Date jointime, int state,String postcode) {
        this.name = name;
        this.sex = sex;
        this.nation = nation;
        this.policy = policy;
        this.borthday = borthday;
        this.zunkaozheng = zunkaozheng;
        this.collegeid = collegeid;
        this.professionid = professionid;
        this.toCollegeid = toCollegeid;
        this.toprofessionid = toprofessionid;
        this.award = award;
        this.merit = merit;
        this.homeAdress = homeAdress;
        this.nowAdress = nowAdress;
        this.jointime = jointime;
        this.state = state;
        this.postcode=postcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public Date getBorthday() {
        return borthday;
    }

    public void setBorthday(Date borthday) {
        this.borthday = borthday;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getZunkaozheng() {
        return zunkaozheng;
    }

    public void setZunkaozheng(String zunkaozheng) {
        this.zunkaozheng = zunkaozheng;
    }

    public int getCollegeid() {
        return collegeid;
    }

    public void setCollegeid(int collegeid) {
        this.collegeid = collegeid;
    }

    public int getProfessionid() {
        return professionid;
    }

    public void setProfessionid(int professionid) {
        this.professionid = professionid;
    }

    public int getToCollegeid() {
        return toCollegeid;
    }

    public void setToCollegeid(int toCollegeid) {
        this.toCollegeid = toCollegeid;
    }

    public int getToprofessionid() {
        return toprofessionid;
    }

    public void setToprofessionid(int toprofessionid) {
        this.toprofessionid = toprofessionid;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public String getMerit() {
        return merit;
    }

    public void setMerit(String merit) {
        this.merit = merit;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNowAdress() {
        return nowAdress;
    }

    public void setNowAdress(String nowAdress) {
        this.nowAdress = nowAdress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWbh() {
        return wbh;
    }

    public void setWbh(String wbh) {
        this.wbh = wbh;
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public int getIsnojoin() {
        return isnojoin;
    }

    public void setIsnojoin(int isnojoin) {
        this.isnojoin = isnojoin;
    }

    public int getQuestionOne() {
        return questionOne;
    }

    public void setQuestionOne(int questionOne) {
        this.questionOne = questionOne;
    }

    public String getAnsQuestionOne() {
        return ansQuestionOne;
    }

    public void setAnsQuestionOne(String ansQuestionOne) {
        this.ansQuestionOne = ansQuestionOne;
    }

    public int getQuestionTwo() {
        return questionTwo;
    }

    public void setQuestionTwo(int questionTwo) {
        this.questionTwo = questionTwo;
    }

    public String getAnsQuestionTwo() {
        return ansQuestionTwo;
    }

    public void setAnsQuestionTwo(String ansQuestionTwo) {
        this.ansQuestionTwo = ansQuestionTwo;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", nation='" + nation + '\'' +
                ", policy='" + policy + '\'' +
                ", borthday=" + borthday +
                ", identityCard='" + identityCard + '\'' +
                ", zunkaozheng='" + zunkaozheng + '\'' +
                ", collegeid=" + collegeid +
                ", professionid=" + professionid +
                ", toCollegeid=" + toCollegeid +
                ", toprofessionid=" + toprofessionid +
                ", award='" + award + '\'' +
                ", merit='" + merit + '\'' +
                ", homeAdress='" + homeAdress + '\'' +
                ", phone='" + phone + '\'' +
                ", nowAdress='" + nowAdress + '\'' +
                ", email='" + email + '\'' +
                ", wbh='" + wbh + '\'' +
                ", jointime=" + jointime +
                ", checked='" + checked + '\'' +
                ", isnojoin=" + isnojoin +
                ", questionOne=" + questionOne +
                ", ansQuestionOne='" + ansQuestionOne + '\'' +
                ", questionTwo=" + questionTwo +
                ", ansQuestionTwo='" + ansQuestionTwo + '\'' +
                ", state=" + state +
                '}';
    }
}
