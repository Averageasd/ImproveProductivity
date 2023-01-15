package model;

import java.util.Date;

public class Task {

    private int id;
    private String taskName;
    private Date createDate;

    private TaskDescription taskDescription;
    private int duration;

    public Task(int id, String taskName, Date createDate, TaskDescription taskDescription, int duration) {
        this.id = id;
        this.taskName = taskName;
        this.createDate = createDate;
        this.taskDescription = taskDescription;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public TaskDescription getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(TaskDescription taskDescription) {
        this.taskDescription = taskDescription;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
