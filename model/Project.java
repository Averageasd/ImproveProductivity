package model;

import java.util.List;

public class Project {

    private int id;
    private String projectName;
    private List<Task> tasks;

    public Project(int id, String projectName, List<Task>tasks) {
        this.id = id;
        this.projectName = projectName;
        this.tasks = tasks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
