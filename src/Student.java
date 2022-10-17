public class Student {

    public static boolean IS_HUMAN;
    private String fname, lname, gender;
    private int age;


    Student(String fname, String lname, String gender, int age){
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.age = age;
    }

    public void introduceYourself(){
        System.out.println("I am " + fname + lname + "and i am " + age + "years old.I am a " + gender);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFname() {
        return fname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLname() {
        return lname;
    }
}
