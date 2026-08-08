public class StudentManagement {

    public static void main(String[] args) {

        Student student1 = new Student(101, "Rahul", "Java");
        Student student2 = new Student(102, "Anu", "Computer Science");

        student1.displayStudent();
        student2.displayStudent();
    }
}