
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TodosTest {
    @Test
    public void shouldAddThreeTasksOfDifferentType() {

        SimpleTask simpleTask = new SimpleTask( id:5, title:"Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(id:55, subtasks);

        Meeting meeting = new Meeting(
                id:555,
                topic:"Выкатка 3й версии приложения",
                project:"Приложение НетоБанка",
                start:"Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}