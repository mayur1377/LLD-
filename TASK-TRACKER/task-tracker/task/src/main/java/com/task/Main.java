package com.task;

import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

import com.task.model.StatusType;
import com.task.model.TaskModel;
import com.task.model.TaskType;
import com.task.service.*;
public class Main {
    public static void main(String[] args) {
        SprintService sprintService = new SprintService();
        sprintService.createSprint("Sprint 1");


        Date dueDate = Date.valueOf("2021-12-31");
        TaskModel task = new TaskModel("Task 1", "Creator", "Assignee", TaskType.FEATURE, StatusType.OPEN, dueDate);


        List<TaskModel> tasks = new ArrayList<>();
        tasks.add(task);
        sprintService.addTasksinSprint("Sprint 1", tasks);

        sprintService.displaySprint("Sprint 1");
        
        // change status of task

        task.setStatus(StatusType.IN_PROGRESS);

        // add one more task
        Date dueDate2 = Date.valueOf("2021-12-31");
        TaskModel newTask = new TaskModel("Task 2", "Creator", "Assignee", TaskType.BUG, StatusType.OPEN, dueDate2);
        List<TaskModel> newTasks = new ArrayList<>();
        newTasks.add(newTask);
        sprintService.addTasksinSprint("Sprint 1", newTasks);
        sprintService.displaySprint("Sprint 1");


        
        

    }
}