package bean;

public class DeskDate {
    int subjectNum;//考试科目个数
    int joinSubjectNum;//招生专业个数
    int registerNum;//注册用户人数
    int hadjoinNum;//完成报名人数
    int check0;//待审核人数
    int check4;//审核通过人数
    int hadSuccess;//全校录取人数
    int examSpace;//公共考场人数
    int examSpace2;//专用考场个数

    public DeskDate(int subjectNum, int joinSubjectNum, int registerNum, int hadjoinNum, int check0, int check4, int hadSuccess, int examSpace, int examSpace2) {
        this.subjectNum = subjectNum;
        this.joinSubjectNum = joinSubjectNum;
        this.registerNum = registerNum;
        this.hadjoinNum = hadjoinNum;
        this.check0 = check0;
        this.check4 = check4;
        this.hadSuccess = hadSuccess;
        this.examSpace = examSpace;
        this.examSpace2 = examSpace2;
    }

    public DeskDate() {
    }

    @Override
    public String toString() {
        return "DeskDate{" +
                "subjectNum=" + subjectNum +
                ", joinSubjectNum=" + joinSubjectNum +
                ", registerNum=" + registerNum +
                ", hadjoinNum=" + hadjoinNum +
                ", check0=" + check0 +
                ", check4=" + check4 +
                ", hadSuccess=" + hadSuccess +
                ", examSpace=" + examSpace +
                ", examSpace2=" + examSpace2 +
                '}';
    }

    public int getSubjectNum() {
        return subjectNum;
    }

    public void setSubjectNum(int subjectNum) {
        this.subjectNum = subjectNum;
    }

    public int getJoinSubjectNum() {
        return joinSubjectNum;
    }

    public void setJoinSubjectNum(int joinSubjectNum) {
        this.joinSubjectNum = joinSubjectNum;
    }

    public int getRegisterNum() {
        return registerNum;
    }

    public void setRegisterNum(int registerNum) {
        this.registerNum = registerNum;
    }

    public int getHadjoinNum() {
        return hadjoinNum;
    }

    public void setHadjoinNum(int hadjoinNum) {
        this.hadjoinNum = hadjoinNum;
    }

    public int getCheck0() {
        return check0;
    }

    public void setCheck0(int check0) {
        this.check0 = check0;
    }

    public int getCheck4() {
        return check4;
    }

    public void setCheck4(int check4) {
        this.check4 = check4;
    }

    public int getHadSuccess() {
        return hadSuccess;
    }

    public void setHadSuccess(int hadSuccess) {
        this.hadSuccess = hadSuccess;
    }

    public int getExamSpace() {
        return examSpace;
    }

    public void setExamSpace(int examSpace) {
        this.examSpace = examSpace;
    }

    public int getExamSpace2() {
        return examSpace2;
    }

    public void setExamSpace2(int examSpace2) {
        this.examSpace2 = examSpace2;
    }
}
