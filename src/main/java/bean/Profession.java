package bean;

public class Profession {
    int proNum;//排序
    String proName;
    String proOrder;//编号
    int xz;
    int nowNum;
    int subjectone;
    int subjecttwo;
    int subjectthree;
    int subjectfore;

    public Profession(int proNum, String proName, String proOrder, int xz, int nowNum, int subjectone, int subjecttwo, int subjectthree, int subjectfore) {
        this.proNum = proNum;
        this.proName = proName;
        this.proOrder = proOrder;
        this.xz = xz;
        this.nowNum = nowNum;
        this.subjectone = subjectone;
        this.subjecttwo = subjecttwo;
        this.subjectthree = subjectthree;
        this.subjectfore = subjectfore;
    }

    public Profession() {
    }

    public Profession(String proName, String proOrder, int xz, int subjectone, int subjecttwo, int subjectthree, int subjectfore) {
        this.proName = proName;
        this.proOrder = proOrder;
        this.xz = xz;
        this.subjectone = subjectone;
        this.subjecttwo = subjecttwo;
        this.subjectthree = subjectthree;
        this.subjectfore = subjectfore;
    }

    public Profession(int proNum, String proName, String proOrder, int xz, int subjectone, int subjecttwo, int subjectthree, int subjectfore) {
        this.proNum = proNum;
        this.proName = proName;
        this.proOrder = proOrder;
        this.xz = xz;
        this.subjectone = subjectone;
        this.subjecttwo = subjecttwo;
        this.subjectthree = subjectthree;
        this.subjectfore = subjectfore;
    }

    public int getProNum() {
        return proNum;
    }

    public void setProNum(int proNum) {
        this.proNum = proNum;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProOrder() {
        return proOrder;
    }

    public void setProOrder(String proOrder) {
        this.proOrder = proOrder;
    }

    public int getXz() {
        return xz;
    }

    public void setXz(int xz) {
        this.xz = xz;
    }

    public int getNowNum() {
        return nowNum;
    }

    public void setNowNum(int nowNum) {
        this.nowNum = nowNum;
    }

    public int getSubjectone() {
        return subjectone;
    }

    public void setSubjectone(int subjectone) {
        this.subjectone = subjectone;
    }

    public int getSubjecttwo() {
        return subjecttwo;
    }

    public void setSubjecttwo(int subjecttwo) {
        this.subjecttwo = subjecttwo;
    }

    public int getSubjectthree() {
        return subjectthree;
    }

    public void setSubjectthree(int subjectthree) {
        this.subjectthree = subjectthree;
    }

    public int getSubjectfore() {
        return subjectfore;
    }

    public void setSubjectfore(int subjectfore) {
        this.subjectfore = subjectfore;
    }

    @Override
    public String toString() {
        return "Profession{" +
                "proNum=" + proNum +
                ", proName=" + proName +
                ", proOrder='" + proOrder + '\'' +
                ", xz=" + xz +
                ", nowNum=" + nowNum +
                ", subjectone=" + subjectone +
                ", subjecttwo=" + subjecttwo +
                ", subjectthree=" + subjectthree +
                ", subjectfore=" + subjectfore +
                '}';
    }
}
