package com.manalo.entity;

import lombok.Data;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.ZonedDateTime;

@Data
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class AbstractAuditEntity {

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private ZonedDateTime dateCreated = ZonedDateTime.now();

    @Audited
    @LastModifiedBy
    private String modifiedBy;

    @Audited
    @LastModifiedDate
    private ZonedDateTime modifiedDate = ZonedDateTime.now();
}
