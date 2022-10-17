public class Main {
    public static void main(String[] args){
        Student student1 = new Student("Shayne", "Kandagor", "Female", 16);
        Student student2 = new Student("Nelly", "Muoka", "Female", 25);
        Student student3 = new Student("Laurent", "Ouma", "Male", 101);

        student1.setAge(45);
        System.out.println(student1.getAge());
        System.out.println(student2.getAge());
        System.out.println(student3.getAge());

        System.out.println(student1.getFname());
        System.out.println(student2.getFname());
        System.out.println(student3.getFname());

        System.out.println(Student.IS_HUMAN);

    }
}

