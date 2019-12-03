public class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }
    public void hire(){
        this.hiredStudents++;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I represent " + company + " and hired " + hiredStudents + " students.");
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }
}
