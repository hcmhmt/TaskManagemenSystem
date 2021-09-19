package com.simurgh.taskmanagementsystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity extends AbstractEntity{

    @Id
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "password")
    private String password;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "user_type_id")
    private Long userTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "user_type_id",
            referencedColumnName = "type_id",
            insertable = false,
            updatable = false
    )
    private TypeEntity typeEntity;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Long userTypeId) {
        this.userTypeId = userTypeId;
    }

    public TypeEntity getTypeEntity() {
        return typeEntity;
    }

    public void setTypeEntity(TypeEntity userTypeEntity) {
        this.typeEntity = userTypeEntity;
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
}
