package bean;

public class Admin {
    int id;
    String tname;
    String tpassword;
    String tphone;
    String email;

    public Admin(int id, String tname, String tpassword, String tphone, String email) {
        this.id = id;
        this.tname = tname;
        this.tpassword = tpassword;
        this.tphone = tphone;
        this.email = email;
    }

    public Admin(String tname, String tpassword, String tphone, String email) {
        this.tname = tname;
        this.tpassword = tpassword;
        this.tphone = tphone;
        this.email = email;
    }

    public Admin(String tphone, String tpassword) {
        this.tpassword = tpassword;
        this.tphone = tphone;
    }

    public Admin() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTpassword() {
        return tpassword;
    }

    public void setTpassword(String tpassword) {
        this.tpassword = tpassword;
    }

    public String getTphone() {
        return tphone;
    }

    public void setTphone(String tphone) {
        this.tphone = tphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", tname='" + tname + '\'' +
                ", tpassword='" + tpassword + '\'' +
                ", tphone='" + tphone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
