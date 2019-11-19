package TeacherStudent;

public class Student {
    String name;

    public Student(){

    }

    public void learn(){
        System.out.println(this.name + " is learning something new.");
    }
    public void question(Teacher teacher){
        teacher.answer();
    }
}
