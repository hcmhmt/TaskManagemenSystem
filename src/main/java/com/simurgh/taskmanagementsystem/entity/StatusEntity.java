package com.simurgh.taskmanagementsystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "status")
public class StatusEntity extends AbstractEntity{

    @Id
    @Column(name = "status_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "statusSeq")
    @SequenceGenerator(name = "statusSeq", sequenceName = "status_seq", allocationSize = 1)
    private Long statusId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "status_code")
    private String statusCode;

    @Column(name = "short_code")
    private String shortCode;

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
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

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }
}
