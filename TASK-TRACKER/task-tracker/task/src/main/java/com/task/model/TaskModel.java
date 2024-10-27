package com.task.model;

import java.sql.Date;
import java.util.Arrays;

public class TaskModel {
    public String TaskName;
    public String CreatedBy;
    public String AssignedTo;
    public TaskType Type;
    public StatusType Status;
    public static Date DueDate;

    public TaskModel(String taskName, String createdBy, String assignedTo, TaskType type, StatusType status , Date dueDate) {
        this.TaskName = taskName;
        this.CreatedBy = createdBy;
        this.AssignedTo = assignedTo;
        this.Type = type;
        this.Status = status;
        this.DueDate = dueDate;
    }

    public void setAssignedTo(String assignedTo) {
        this.AssignedTo = assignedTo;
    }

    public void setStatus(StatusType status) {
        StatusType[] allowedStatus = new StatusType[]{};
        if (this.Type == TaskType.BUG) {
            allowedStatus = new StatusType[]{StatusType.OPEN, StatusType.IN_PROGRESS, StatusType.FIXED};
        } else if (this.Type == TaskType.FEATURE) {
            allowedStatus = new StatusType[]{StatusType.OPEN, StatusType.IN_PROGRESS, StatusType.TESTING, StatusType.DEPLOYED};
        } else if (this.Type == TaskType.STORY) {   
            allowedStatus = new StatusType[]{StatusType.OPEN, StatusType.IN_PROGRESS, StatusType.FIXED}; 
        }
    
        if (Arrays.asList(allowedStatus).contains(status)) {
            StatusType currentStatus = this.Status;
            int currentStatusIndex = Arrays.asList(allowedStatus).indexOf(currentStatus);
            int newStatusIndex = Arrays.asList(allowedStatus).indexOf(status);
            if(currentStatusIndex + 1 != newStatusIndex) {
                throw new IllegalArgumentException("Invalid status transition");
            }
            else
            {
                this.Status = status;
            }
        } else {
            throw new IllegalArgumentException("Invalid status for task type");
        }
    }
}
