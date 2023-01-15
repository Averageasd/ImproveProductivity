package model;

public class TaskDescription {

    private TaskPriority taskPriority;
    private TaskDescription taskDescription;
    private String shortDesc;

    public TaskDescription(TaskPriority taskPriority, TaskDescription taskDescription, String shortDesc) {
        this.taskPriority = taskPriority;
        this.taskDescription = taskDescription;
        this.shortDesc = shortDesc;
    }

    public TaskPriority getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(TaskPriority taskPriority) {
        this.taskPriority = taskPriority;
    }

    public TaskDescription getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(TaskDescription taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }
}
