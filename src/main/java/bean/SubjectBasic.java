package bean;

public class SubjectBasic {
    int id;
    String subjectNum;
    String subjectName;

    public SubjectBasic() {
    }

    public SubjectBasic(String subjectNum, String subjectName) {
        this.subjectNum = subjectNum;
        this.subjectName = subjectName;
    }

    public SubjectBasic(int id, String subjectNum, String subjectName) {
        this.id = id;
        this.subjectNum = subjectNum;
        this.subjectName = subjectName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubjectNum() {
        return subjectNum;
    }

    public void setSubjectNum(String subjectNum) {
        this.subjectNum = subjectNum;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "SubjectBasic{" +
                "id=" + id +
                ", subjectNum='" + subjectNum + '\'' +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
