package com.threesome.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -2225523458149289396L;

    @Transient
    private String operator;
    @Column(name = "created_by", length = 20)
    private String createdBy;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "modified_by", length = 20)
    private String modifiedBy;
    @Column(name = "modified_at")
    private Timestamp modifiedAt;

    @PrePersist
    public void onCreate(){
        this.createdAt = Timestamp.valueOf(LocalDateTime.now());
        if (null == this.createdBy || this.createdBy.length() == 0) {
            this.createdBy = "SYSTEM";
        } else {
            this.createdBy = this.operator;
        }
    }

    @PreUpdate
    public void onUpdate(){
        this.modifiedAt = Timestamp.valueOf(LocalDateTime.now());
        if (null == this.modifiedBy || this.modifiedBy.length() == 0) {
            this.modifiedBy = "SYSTEM";
        } else {
            this.modifiedBy = this.operator;
        }
    }

}
