package com.task.model;

import java.sql.Date;
public class BugModel extends TaskModel {
    public SeverityType severity;

    public BugModel(String taskName, String createdBy, String assignedTo, StatusType status,Date DueDate, SeverityType severity) {
        super(taskName, createdBy, assignedTo, TaskType.BUG, status, DueDate);
        this.severity = severity;
    }

    public enum SeverityType {
        LOW,
        MEDIUM,
        HIGH
    }

}
