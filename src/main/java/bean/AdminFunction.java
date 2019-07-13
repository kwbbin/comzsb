package bean;

public class AdminFunction {
    int adminId;
    int fid;

    public AdminFunction() {
    }

    public AdminFunction(int adminId, int fid) {
        this.adminId = adminId;
        this.fid = fid;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    @Override
    public String toString() {
        return "AdminFunction{" +
                "adminId=" + adminId +
                ", fid=" + fid +
                '}';
    }
}
