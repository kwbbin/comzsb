package bean;

public class College {
    int CollegeId;
    String CollegeName;

    public College(int collegeId, String collegeName) {
        CollegeId = collegeId;
        CollegeName = collegeName;
    }

    public College(String collegeName) {
        CollegeName = collegeName;
    }



    public College() {
    }

    public int getCollegeId() {
        return CollegeId;
    }

    public void setCollegeId(int collegeId) {
        CollegeId = collegeId;
    }

    public String getCollegeName() {
        return CollegeName;
    }

    public void setCollegeName(String collegeName) {
        CollegeName = collegeName;
    }

    @Override
    public String toString() {
        return "College{" +
                "CollegeId=" + CollegeId +
                ", CollegeName='" + CollegeName + '\'' +
                '}';
    }
}
