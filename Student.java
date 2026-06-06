public class Student {
    private String studentId;
    private String name;
    private double marks;

    // Constructor
    public Student(String studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    // Getters
    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public double getMarks() { return marks; }

    @Override
    public String toString() {
        return "ID: " + studentId + " | Name: " + name + " | Marks: " + marks;
    }
}
