public class Student extends Person {
    private String previousOrganization;
    private int skippedDays;

    //methods:
    //getGoal(): prints out "Be a junior software developer."
    //introduce(): "Hi, I'm name, a age year old gender from previousOrganization who skipped skippedDays days from the course already."
    //skipDays(numberOfDays): increases skippedDays by numberOfDays
    //The Student class has the following constructors:
    //
    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        super();
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, I'm %s, a %d year old %s from %s who skipped %d days from the course already. \n", getName(), getAge(), getGender(), previousOrganization, skippedDays);
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }
}
