package com.task.model;

import java.util.List;

public class SprintModel {
    public String sprintName;
    public List<TaskModel> tasks;

    public SprintModel(String sprintName, List<TaskModel> tasks) {
        this.sprintName = sprintName;
        this.tasks = tasks;
    } 
}
