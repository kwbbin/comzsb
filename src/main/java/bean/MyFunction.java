package bean;

/**
 * 权限管理的实例
 */
public class MyFunction {
    int fid;
    String fName;
    String tname;
    String fUrl;

    public MyFunction(int fid, String fName, String tname) {
        this.fid = fid;
        this.fName = fName;
        this.tname = tname;
    }

    public MyFunction() {
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getfUrl() {
        return fUrl;
    }

    public void setfUrl(String fUrl) {
        this.fUrl = fUrl;
    }

    @Override
    public String toString() {
        return "MyFunction{" +
                "fid=" + fid +
                ", fName='" + fName + '\'' +
                ", tname='" + tname + '\'' +
                ", fUrl='" + fUrl + '\'' +
                '}';
    }
}
