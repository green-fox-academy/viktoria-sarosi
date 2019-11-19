package TeacherStudent;

public class Teacher {
    String name;

    public Teacher(){

    }
    public void teach(Student student){
        student.learn();
    }
    public void answer(){
        System.out.println(this.name + " is answering a question.");
    }
}
