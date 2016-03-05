package com.manalo.entity;

import lombok.Data;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.ZonedDateTime;

@Data
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class AbstractAuditEntity {

    @CreatedBy
    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "date_created")
    @CreatedDate
    private ZonedDateTime dateCreated = ZonedDateTime.now();

    @Audited
    @Column(name = "modified_by")
    @LastModifiedBy
    private String modifiedBy;

    @Audited
    @Column(name = "date_modified")
    @LastModifiedDate
    private ZonedDateTime dateModified = ZonedDateTime.now();
}
