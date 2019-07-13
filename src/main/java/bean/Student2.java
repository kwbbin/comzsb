package bean;

import java.util.Date;

public class Student2 extends Student{
    String collegeName;
    String toCollegeName;
    String professionName;
    String toProfessionName;
    String toProfessionCode;

    public Student2() {
    }

    public Student2(String collegeName, String toCollegeName, String professionName, String toProfessionName) {
        this.collegeName = collegeName;
        this.toCollegeName = toCollegeName;
        this.professionName = professionName;
        this.toProfessionName = toProfessionName;
    }

    public Student2(int id, String name, String password, String sex, String nation, String policy, Date borthday, String identityCard, String zunkaozheng, int collegeid, int professionid, int toCollegeid, int toprofessionid, String award, String merit, String homeAdress, String phone, String nowAdress, String email, String wbh, Date jointime, String checked, int isnojoin, int questionOne, String ansQuestionOne, int questionTwo, String ansQuestionTwo, int state, String image, String postcode) {
        super(id, name, password, sex, nation, policy, borthday, identityCard, zunkaozheng, collegeid, professionid, toCollegeid, toprofessionid, award, merit, homeAdress, phone, nowAdress, email, wbh, jointime, checked, isnojoin, questionOne, ansQuestionOne, questionTwo, ansQuestionTwo, state, image, postcode);
    }

    public Student2(int id, String name, String password, String sex, String nation, String policy, Date borthday, String identityCard, String zunkaozheng, int collegeid, int professionid, int toCollegeid, int toprofessionid, String award, String merit, String homeAdress, String phone, String nowAdress, String email, String wbh, Date jointime, String checked, int isnojoin, int questionOne, String ansQuestionOne, int questionTwo, String ansQuestionTwo, int state) {
        super(id, name, password, sex, nation, policy, borthday, identityCard, zunkaozheng, collegeid, professionid, toCollegeid, toprofessionid, award, merit, homeAdress, phone, nowAdress, email, wbh, jointime, checked, isnojoin, questionOne, ansQuestionOne, questionTwo, ansQuestionTwo, state);
    }

    public Student2(String name, String password, String identityCard, String phone, String email, int questionOne, String ansQuestionOne, int questionTwo, String ansQuestionTwo, String collegeName, String toCollegeName, String professionName, String toProfessionName) {
        super(name, password, identityCard, phone, email, questionOne, ansQuestionOne, questionTwo, ansQuestionTwo);
        this.collegeName = collegeName;
        this.toCollegeName = toCollegeName;
        this.professionName = professionName;
        this.toProfessionName = toProfessionName;
    }

    public Student2(String phone, String password, String collegeName, String toCollegeName, String professionName, String toProfessionName) {
        super(phone, password);
        this.collegeName = collegeName;
        this.toCollegeName = toCollegeName;
        this.professionName = professionName;
        this.toProfessionName = toProfessionName;
    }

    public Student2(String name, String password, String identityCard, String phone, String email, String wbh, int questionOne, String ansQuestionOne, int questionTwo, String ansQuestionTwo, String collegeName, String toCollegeName, String professionName, String toProfessionName) {
        super(name, password, identityCard, phone, email, wbh, questionOne, ansQuestionOne, questionTwo, ansQuestionTwo);
        this.collegeName = collegeName;
        this.toCollegeName = toCollegeName;
        this.professionName = professionName;
        this.toProfessionName = toProfessionName;
    }

    public Student2(int id, String name, String password, String sex, String nation, String policy, Date borthday, String identityCard, String zunkaozheng, int collegeid, int professionid, int toCollegeid, int toprofessionid, String award, String merit, String homeAdress, String phone, String nowAdress, String email, String wbh, Date jointime, String checked, int isnojoin, int questionOne, String ansQuestionOne, int questionTwo, String ansQuestionTwo, int state, String collegeName, String toCollegeName, String professionName, String toProfessionName) {
        super(id, name, password, sex, nation, policy, borthday, identityCard, zunkaozheng, collegeid, professionid, toCollegeid, toprofessionid, award, merit, homeAdress, phone, nowAdress, email, wbh, jointime, checked, isnojoin, questionOne, ansQuestionOne, questionTwo, ansQuestionTwo, state);
        this.collegeName = collegeName;
        this.toCollegeName = toCollegeName;
        this.professionName = professionName;
        this.toProfessionName = toProfessionName;
    }

    public Student2(String name, String sex, String nation, String policy, Date borthday, String zunkaozheng, int collegeid, int professionid, int toCollegeid, int toprofessionid, String award, String merit, String homeAdress, String nowAdress, Date jointime, int state, String postcode, String collegeName, String toCollegeName, String professionName, String toProfessionName) {
        super(name, sex, nation, policy, borthday, zunkaozheng, collegeid, professionid, toCollegeid, toprofessionid, award, merit, homeAdress, nowAdress, jointime, state, postcode);
        this.collegeName = collegeName;
        this.toCollegeName = toCollegeName;
        this.professionName = professionName;
        this.toProfessionName = toProfessionName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getToProfessionCode() {
        return toProfessionCode;
    }

    public void setToProfessionCode(String toProfessionCode) {
        this.toProfessionCode = toProfessionCode;
    }

    public String getToCollegeName() {
        return toCollegeName;
    }

    public void setToCollegeName(String toCollegeName) {
        this.toCollegeName = toCollegeName;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    public String getToProfessionName() {
        return toProfessionName;
    }

    public void setToProfessionName(String toProfessionName) {
        this.toProfessionName = toProfessionName;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "collegeName='" + collegeName + '\'' +
                ", toCollegeName='" + toCollegeName + '\'' +
                ", professionName='" + professionName + '\'' +
                ", toProfessionName='" + toProfessionName + '\'' +
                ", id=" + id +
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
                ", image='" + image + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
