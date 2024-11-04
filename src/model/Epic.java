package model;
import java.util.ArrayList;
import java.util.List;

public class Epic extends Task {
    private List<Integer> subTaskIds = new ArrayList<>();

    public Epic(String title, String description) {
        super(title, description, Status.NEW);
    }

    public void addSubTask(int subTaskId) {
        subTaskIds.add(subTaskId);
    }

    public void removeSubTask(int subTaskId) {
        subTaskIds.remove(Integer.valueOf(subTaskId));
    }

    public void clearSubTasks() {
        subTaskIds.clear();
    }

    public List<Integer> getSubTaskIds() {
        return new ArrayList<>(subTaskIds);
    }

    @Override
    public String toString() {
        return "Epic{id=" + getId() + ", title='" + getTitle() + "', description='" + getDescription() + "', status=" + getStatus() + "}";
    }
}