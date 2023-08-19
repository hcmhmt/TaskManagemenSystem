package com.simurgh.taskmanagementsystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_detail")
public class UserDetailEntity extends AbstractBaseEntity {

    @Id
    @Column(name = "user_detail_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userDetailIdSequence")
    @SequenceGenerator(name = "userDetailIdSequence", sequenceName = "user_detail_id_seq", allocationSize = 1)
    private Long userDetailId;

    @Column(name = "user_id")
    private Long user_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "application_user_id",
            insertable = false,
            updatable = false
    )
    private ApplicationUserEntity applicationUserEntity;

    @Column(name = "name")
    private String name;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "active")
    private Long active;

    public Long getUserDetailId() {
        return userDetailId;
    }

    public void setUserDetailId(Long userDetailId) {
        this.userDetailId = userDetailId;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public ApplicationUserEntity getApplicationUserEntity() {
        return applicationUserEntity;
    }

    public void setApplicationUserEntity(ApplicationUserEntity applicationUserEntity) {
        this.applicationUserEntity = applicationUserEntity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getActive() {
        return active;
    }

    public void setActive(Long active) {
        this.active = active;
    }
}
