package com.simurgh.taskmanagementsystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "application_user")
public class ApplicationUserEntity extends AbstractBaseEntity {

    @Id
    @Column(name = "application_user_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appUserSeq")
    @SequenceGenerator(name = "appUserSeq", sequenceName = "app_user_seq", allocationSize = 1)
    private Long applicationUserId;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

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

    public Long getApplicationUserId() {
        return applicationUserId;
    }

    public void setApplicationUserId(Long applicationUserId) {
        this.applicationUserId = applicationUserId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
