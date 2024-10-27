package com.task.model;

import java.util.Date;

public class FeatureModel extends TaskModel {
    public String featureSummary;
    public ImpactType impact;

    public FeatureModel(String taskName, String createdBy, String assignedTo, StatusType status,Date DueDate, String featureSummary, ImpactType impact) {
        super(taskName, createdBy, assignedTo, TaskType.FEATURE, status, null);
        this.featureSummary = featureSummary;
        this.impact = impact;
    }

    public enum ImpactType {
        LOW,
        MEDIUM,
        HIGH
    }
}