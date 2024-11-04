package test;
import model.Status;
import model.SubTask;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubTaskTest {

    @Test
    void testSubTaskEquality() {
        SubTask subTask1 = new SubTask("SubTask 1", "Description", 1, Status.NEW);
        subTask1.setId(1);
        SubTask subTask2 = new SubTask("SubTask 1", "Description", 1, Status.NEW);
        subTask2.setId(1);

        assertEquals(subTask1, subTask2, "Подзадачи должны быть равны по содержимому");
    }
}