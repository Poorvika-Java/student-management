public class Student {

    int id;
    String name;
    String course = "Spring Boot";
    String email;
    String phone;

    public Student(int id, String name, String course, String phone) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.phone = phone;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Phone: " + phone);
    }
}