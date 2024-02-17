package hw3_2;

public class Main {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();

        Student student1 = studentBuilder
                .setFirstName("Джонатан")
                .setLastName("Джостар")
                .setGroup("1А")
                .setAverageMark(5.0)
                .buildStudent();

        Aspirant aspirant1 = studentBuilder
                .setFirstName("Гарри")
                .setLastName("Поттер")
                .setGroup("2Б")
                .setAverageMark(4.5)
                .setScientificWork("Spider-man exist")
                .buildAspirant();

        Student[] students = {student1, aspirant1};

        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " стипендия: " + student.getScholarship());
        }
    }
}