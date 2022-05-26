package com.tapplication.ddd_prj.domain;

import org.joda.time.DateTime;

public class Task {

    private static Integer MAX_POSTPONE_COUNT;

    private final Integer id;
    private final String name;
    private final Integer assignedUserId;
    private final Integer createdUserId;
    private Integer postponeCount;
    private final TaskStatus status;
    private DueDate dueDate;

    public Task(Integer id, String name, Integer assignedUserId, Integer createdUserId,
                Integer postponeCount, TaskStatus status, DueDate dueDate) {
        this.id = id;
        this.name = name;
        this.assignedUserId = assignedUserId;
        this.createdUserId = createdUserId;
        this.postponeCount = postponeCount;
        this.status = status;
        this.dueDate = dueDate;
    }

    public void postpone() throws Exception{
        try {
            if(this.postponeCount > MAX_POSTPONE_COUNT){
                throw new Exception();
            } else {
                this.dueDate = this.dueDate.plusDays(1);
                this.postponeCount += 1;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
