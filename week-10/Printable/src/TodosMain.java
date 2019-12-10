import java.util.ArrayList;
import java.util.List;

public class TodosMain {
    public static void main(String[] args) {
        List<Todo> todosList = new ArrayList<>();
        todosList.add(new Todo("Buy milk", "High", true));
        todosList.add(new Todo("Cook lunch", "High", false));
        todosList.add(new Todo("Iron shirts", "Medium", false));

        for (Todo t : todosList) {
            t.printAllFields();
        }
    }
}
