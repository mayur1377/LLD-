package com.task.model;

public class BugModel extends TaskModel {
    public SeverityType severity;

    public BugModel(String taskName, String createdBy, String assignedTo, StatusType status, SeverityType severity) {
        super(taskName, createdBy, assignedTo, TaskType.BUG, status);
        this.severity = severity;
    }

    public enum SeverityType {
        LOW,
        MEDIUM,
        HIGH
    }

}
