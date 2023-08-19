package com.simurgh.taskmanagementsystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "system_log")
public class SystemLogEntity extends AbstractBaseEntity {

    @Id
    @Column(name = "system_log_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "systemLogIdSequence")
    @SequenceGenerator(name = "systemLogIdSequence", sequenceName = "system_log_id_seq", allocationSize = 1)
    private Long systemLogId;

    @Column(name = "operationName")
    private String operationName;

    @Column(name = "request")
    private String request;

    @Column(name = "response")
    private String response;

    @Column(name = "row_id")
    private String row_id;

    @Column(name = "row_tp_id")
    private Long row_tp_id;

    public Long getSystemLogId() {
        return systemLogId;
    }

    public void setSystemLogId(Long systemLogId) {
        this.systemLogId = systemLogId;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getRow_id() {
        return row_id;
    }

    public void setRow_id(String row_id) {
        this.row_id = row_id;
    }

    public Long getRow_tp_id() {
        return row_tp_id;
    }

    public void setRow_tp_id(Long row_tp_id) {
        this.row_tp_id = row_tp_id;
    }
}
