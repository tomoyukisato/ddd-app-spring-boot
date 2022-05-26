package com.tapplication.ddd_prj.domain;

import org.springframework.lang.NonNull;

import java.time.LocalDateTime;
import java.util.Date;

public class DueDate {
    @NonNull
    private LocalDateTime value;

    public DueDate(@NonNull LocalDateTime value) {
        this.value = value;
    }

    public DueDate plusDays(Integer date){
        return new DueDate(this.value.plusDays(date));
    }
}
