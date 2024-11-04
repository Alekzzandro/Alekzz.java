package test;
import model.Epic;
import model.Status;
import model.SubTask;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EpicTest {
    @Test
    void testEpicCannotAddSelfAsSubTask() {
        Epic epic = new Epic("Epic 1", "Description 1");
        epic.setId(1);
        SubTask subTask = new SubTask("SubTask 1", "Description", 2, Status.NEW);

        assertNotEquals(epic.getId(), subTask.getEpicId(), "Эпик не должен добавляться в себя как подзадача");
    }
}