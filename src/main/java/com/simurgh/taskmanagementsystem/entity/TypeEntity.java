package com.simurgh.taskmanagementsystem.entity;


import javax.persistence.*;

@Entity
@Table(name = "type")
public class TypeEntity extends AbstractEntity {

    @Id
    @Column(name = "type_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "typeSeq")
    @SequenceGenerator(name = "typeSeq", sequenceName = "type_seq", allocationSize = 1)
    private Long typeId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "short_code")
    private String shortCode;

    @Column(name = "type_code")
    private String typeCode;

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

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
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

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String entityCodeName) {
        this.typeCode = entityCodeName;
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
