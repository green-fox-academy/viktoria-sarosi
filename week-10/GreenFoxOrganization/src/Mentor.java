public class Mentor extends Person {
    private String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        super();
        this.level = "intermediate";
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi I am %s a %d year old %s %s level mentor\n", getName(), getAge(), getGender(), level);
    }
}
