package hw3_2;

class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(StudentBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.group = builder.group;
        this.averageMark = builder.averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public int getScholarship() {
        return averageMark == 5 ? 2000 : 1900;
    }

}