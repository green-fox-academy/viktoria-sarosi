import java.util.ArrayList;
import java.util.List;

public class Todo implements Printable{
    String task;
    String priority;
    boolean Done;

    public Todo(String task, String priority, boolean Done) {
        this.task = task;
        this.priority = priority;
        this.Done = Done;
    }

    public void setPriority(String priority) {
        List<String> validpriorityInputs = new ArrayList<>();
        validpriorityInputs.add("High");
        validpriorityInputs.add("Medium");
        validpriorityInputs.add("High");
        if (!validpriorityInputs.contains(priority)) {
            System.out.println("Please enter Low or Medium or High!");
        } else {
            this.priority = priority;
        }
    }

    @Override
    public void printAllFields() {
        System.out.println("Task: " + task + " | " + "Priority: " + priority + " | " + " Done: " + Done);
    }
}
