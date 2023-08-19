package com.simurgh.taskmanagementsystem.entity;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class AbstractBaseEntity implements Serializable {

    @CreatedDate
    @Column(name = "cdate")
    private Date cdate;

    @LastModifiedDate
    @Column(name = "udate")
    private Date udate;

    @CreatedBy
    @Column(name = "cuser")
    private String cuser;

    @LastModifiedBy
    @Column(name = "uuser")
    private String uuser;

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public Date getUdate() {
        return udate;
    }

    public void setUdate(Date udate) {
        this.udate = udate;
    }

    public String getCuser() {
        return cuser;
    }

    public void setCuser(String cuser) {
        this.cuser = cuser;
    }

    public String getUuser() {
        return uuser;
    }

    public void setUuser(String uuser) {
        this.uuser = uuser;
    }

}
