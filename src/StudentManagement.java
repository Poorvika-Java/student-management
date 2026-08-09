public class StudentManagement {

    public static void main(String[] args) {

        Student student1 = new Student(
                101,
                "Rahul",
                "Java",
                "rahul@gmail.com",
                "9876543210"
        );

        Student student2 = new Student(
                102,
                "Anu",
                "Computer Science",
                "anu@gmail.com",
                "9123456780"
        );

        student1.displayStudent();
        student2.displayStudent();
    }
}