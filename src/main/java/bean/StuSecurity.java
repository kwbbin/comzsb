package bean;

public class StuSecurity {
    int id;
    String identityCard;
    String wbh;
    String email;
    int questionOne;
    String ansOne;
    int questionTwo;
    String ansTwo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getWbh() {
        return wbh;
    }

    public void setWbh(String wbh) {
        this.wbh = wbh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQuestionOne() {
        return questionOne;
    }

    public void setQuestionOne(int questionOne) {
        this.questionOne = questionOne;
    }

    public String getAnsOne() {
        return ansOne;
    }

    public void setAnsOne(String ansOne) {
        this.ansOne = ansOne;
    }

    public int getQuestionTwo() {
        return questionTwo;
    }

    public void setQuestionTwo(int questionTwo) {
        this.questionTwo = questionTwo;
    }

    public String getAnsTwo() {
        return ansTwo;
    }

    public void setAnsTwo(String ansTwo) {
        this.ansTwo = ansTwo;
    }

    @Override
    public String toString() {
        return "StuSecurity{" +
                "id=" + id +
                ", identityCard='" + identityCard + '\'' +
                ", wbh='" + wbh + '\'' +
                ", email='" + email + '\'' +
                ", questionOne=" + questionOne +
                ", ansOne='" + ansOne + '\'' +
                ", questionTwo=" + questionTwo +
                ", ansTwo='" + ansTwo + '\'' +
                '}';
    }

    public StuSecurity() {
    }
}
