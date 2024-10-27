package com.task.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.task.model.*;

@Service 
public class SprintService {

    List<SprintModel> sprints = new ArrayList<>();

    public void createSprint(String sprintName) {
        SprintModel sprint = new SprintModel(sprintName, new ArrayList<>());
        sprints.add(sprint);
        System.out.println("Sprint created: " + sprintName);
    }

    public void deleteSprint(String sprintName) {
        sprints.removeIf(sprint -> sprint.sprintName.equals(sprintName));
        System.out.println("Sprint deleted: " + sprintName);
    }

    public void addTasksinSprint(String sprintName, List<TaskModel> tasks) {
        SprintModel sprint = sprints.stream().filter(s -> s.sprintName.equals(sprintName)).findFirst().orElse(null);
        if (sprint != null) {
            sprint.tasks.addAll(tasks);
            System.out.println("Tasks added to sprint: " + sprintName);
        } else {
            System.out.println("Sprint not found: " + sprintName);
        }
    }

    public void displaySprint(String sprintName) {
        SprintModel sprint = sprints.stream().filter(s -> s.sprintName.equals(sprintName)).findFirst().orElse(null);
        if (sprint != null) {
            System.out.println();
            System.out.println("Sprint name: " + sprint.sprintName);
            System.out.println("Tasks: ");
            String format = "%-20s %-10s %-10s %-15s %-15s%n";
            System.out.printf(format, "Task Name", "Type", "Status", "Created By", "Assigned To" , "Due Date");
            System.out.println("--------------------------------------------------------------------------");
            sprint.tasks.forEach(task -> {
                System.out.printf(format, task.TaskName, task.Type, task.Status, task.CreatedBy, task.AssignedTo , task.DueDate);
            });
        } else {
            System.out.println("Sprint not found: " + sprintName);
        }
    }



}
