package com.tapplication.ddd_prj.domain;

public enum TaskStatus {
    CREATED("作成済"),
    ASSIGNED("アサイン済"),
    PROCESSING("着手中"),
    PENDING("停止中"),
    FINISHED("完了済み");

    public String label;
    TaskStatus(String value) {
        this.label = value;
    }
}
