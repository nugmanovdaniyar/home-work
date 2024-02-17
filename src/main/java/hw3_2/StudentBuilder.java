package hw3_2;

class StudentBuilder {
    String firstName;
    String lastName;
    String group;
    double averageMark;
    String scientificWork;

    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder setGroup(String group) {
        this.group = group;
        return this;
    }

    public StudentBuilder setAverageMark(double averageMark) {
        this.averageMark = averageMark;
        return this;
    }

    public StudentBuilder setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
        return this;
    }

    public Student buildStudent() {
        return new Student(this);
    }

    public Aspirant buildAspirant() {
        return new Aspirant(this);
    }
}