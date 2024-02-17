package hw3_2;

class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(StudentBuilder builder) {
        super(builder);
        this.scientificWork = builder.scientificWork;
    }

    @Override
    public int getScholarship() {
        return getAverageMark() == 5 ? 2500 : 2200;
    }
}