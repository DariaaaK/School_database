package sample.DAO;

public class Student {
    private String id;

    private int numSchool;
    private String lastName;
    private String firstName;
    private String adress;
    private String tel;
    private Marks marks;
    private String classOfStudent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getClassOfStudent() {
        return classOfStudent;
    }

    public void setClassOfStudent(String classOfStudent) {
        this.classOfStudent = classOfStudent;
    }

    public int getNumSchool() {
        return numSchool;
    }

    public void setNumSchool(int numSchool) {
        this.numSchool = numSchool;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }
    @Override
    public String toString() {
        return  id +"."+ " |  " + lastName+" | " + firstName +  " | класс " + classOfStudent+" | тел " + tel+"\n";
    }
}
