package hw3_2;

public class Main {
    public static void main(String[] args) {
        Student[] students = {new Student("Александр", "Невский", "А", 4.8),
                new Aspirant("Олег", "Тиньков", "Б", 5.0, "Spider-man exists")};
        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName + " стипендия: " + student.getScholarship() + " грн");
        }
    }
}