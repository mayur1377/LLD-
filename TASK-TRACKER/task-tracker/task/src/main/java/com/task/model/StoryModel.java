package com.task.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class StoryModel extends TaskModel {
    private String storySummary;
    private List<SubTask> subTasks;

    public StoryModel(String taskName, String createdBy, String assignedTo, StatusType status, String storySummary,Date dueDate, List<SubTask> subTasks) {
        super(taskName, createdBy, assignedTo, TaskType.STORY, status, DueDate);
    }

    // Getter and setter methods for storySummary and subTasks
    public String getStorySummary() {
        return storySummary;
    }

    public void setStorySummary(String storySummary) {
        this.storySummary = storySummary;
    }

    public List<SubTask> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(List<SubTask> subTasks) {
        this.subTasks = (subTasks != null) ? subTasks : new ArrayList<>();
    }

    // Inner class for SubTask
    public static class SubTask {
        private String subTaskName;
        private boolean isCompleted;

        public SubTask(String subTaskName, boolean isCompleted) {
            this.subTaskName = subTaskName;
            this.isCompleted = isCompleted;
        }

        // Getter and setter methods for subTaskName and isCompleted
        public String getSubTaskName() {
            return subTaskName;
        }

        public void setSubTaskName(String subTaskName) {
            this.subTaskName = subTaskName;
        }

        public boolean isCompleted() {
            return isCompleted;
        }

        public void setCompleted(boolean isCompleted) {
            this.isCompleted = isCompleted;
        }
    }
}

// to do , need to add tasks like title and subtasks along with completion status