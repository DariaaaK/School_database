package sample.DAO;

public class Teacher extends Person{
    private String id ;



    private int numSchool;
    private String last_name;
    private String firs_name;
    private String adress;
    private String tel;
    private String yearStag;
    private int numKab;
    private String subject;

    @Override
    public String getLogin() {
        return super.getLogin();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public int getNumSchool() {
        return numSchool;
    }

    public void setNumSchool(int numSchool) {
        this.numSchool = numSchool;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirs_name() {
        return firs_name;
    }

    public void setFirs_name(String firs_name) {
        this.firs_name = firs_name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getYearStag() {
        return yearStag;
    }

    public void setYearStag(String yearStag) {
        this.yearStag = yearStag;
    }

    public int getNumKab() {
        return numKab;
    }

    public void setNumKab(int numKab) {
        this.numKab = numKab;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public String toString() {
        return  id +"."+ " |  " + last_name+" | " + firs_name +  " | предмет " + subject+" | стаж " + yearStag+"\n";
    }
}
