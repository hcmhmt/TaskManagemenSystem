package com.simurgh.taskmanagementsystem.entity;

import org.springframework.format.datetime.joda.DateTimeParser;

import javax.persistence.*;

@Entity
@Table(name = "authentication_log")
public class AuthenticationLogEntity extends AbstractBaseEntity {

    @Id
    @Column(name = "authentication_log_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authenticationLogIdSequence")
    @SequenceGenerator(name = "authenticationLogIdSequence", sequenceName = "authentication_log_id_seq", allocationSize = 1)
    private Long authenticationLogId;

    @Column(name = "user_id")
    private Long userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "application_user_id",
            insertable = false,
            updatable = false
    )
    private ApplicationUserEntity applicationUserEntity;

    @Column(name = "auth_token")
    private String authToken;

    @Column(name = "valid_date_time")
    private String validDateTime;

    @Column(name = "active")
    private Long active;

    public Long getAuthenticationLogId() {
        return authenticationLogId;
    }

    public void setAuthenticationLogId(Long authenticationLogId) {
        this.authenticationLogId = authenticationLogId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public ApplicationUserEntity getApplicationUserEntity() {
        return applicationUserEntity;
    }

    public void setApplicationUserEntity(ApplicationUserEntity applicationUserEntity) {
        this.applicationUserEntity = applicationUserEntity;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getValidDateTime() {
        return validDateTime;
    }

    public void setValidDateTime(String validDateTime) {
        this.validDateTime = validDateTime;
    }

    public Long getActive() {
        return active;
    }

    public void setActive(Long active) {
        this.active = active;
    }
}
