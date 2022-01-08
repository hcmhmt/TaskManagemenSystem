package com.simurgh.taskmanagementsystem.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "task")
public class TaskEntity extends AbstractEntity{

    @Id
    @Column(name = "task_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "taskSeq")
    @SequenceGenerator(name = "taskSeq", sequenceName = "task_seq", allocationSize = 1)
    private Long taskId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "st_id")
    private Long stId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "st_id",
            referencedColumnName = "status_id",
            insertable = false,
            updatable = false
    )
    private StatusEntity statusEntity;

    @Column(name = "task_type_id")
    private Long taskTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "task_type_id",
            referencedColumnName = "type_id",
            insertable = false,
            updatable = false
    )
    private TypeEntity typeEntity;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getStId() {
        return stId;
    }

    public void setStId(Long stId) {
        this.stId = stId;
    }

    public StatusEntity getStatusEntity() {
        return statusEntity;
    }

    public void setStatusEntity(StatusEntity statusEntity) {
        this.statusEntity = statusEntity;
    }

    public Long getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(Long taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    public TypeEntity getTypeEntity() {
        return typeEntity;
    }

    public void setTypeEntity(TypeEntity typeEntity) {
        this.typeEntity = typeEntity;
    }
}
