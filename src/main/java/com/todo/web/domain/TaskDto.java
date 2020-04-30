package com.todo.web.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskDto {
    private Long taskId;
    private String description;
    private Boolean done;
    private LocalDateTime lastUpdate;
}
