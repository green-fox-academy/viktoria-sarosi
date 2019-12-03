import java.util.ArrayList;

public class Cohort {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Mentor> mentors;

    public Cohort(String name){
        this.name = name;
        this.students = new ArrayList<Student>();
        this.mentors = new ArrayList<Mentor>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void addMentor(Mentor mentor){
        mentors.add(mentor);
    }

    public void info(){
        System.out.printf("The %s cohort has %d students and %s mentors.\n", name, students.size(), mentors.size() );
    }
}
