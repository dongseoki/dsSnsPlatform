package com.dssns.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class BaseEntity extends BaseTimeEntity implements BaseCreatedByGetter {

    @CreatedBy
    @Column(updatable = false)
    private Long createdBy;

    @LastModifiedBy
    private Long lastModifiedBy;

    @Column(name = "del_yn")
    @ColumnDefault("'N'")
    @Enumerated(EnumType.STRING)
    private YesOrNo delYn;

    @Override
    public Long getCreatedBy() {
        return createdBy;
    }

    public Long getLastModifiedBy() {
        return lastModifiedBy;
    }

    public YesOrNo getDelYn() {
        return delYn;
    }

    public void setDelYn(YesOrNo delYn) {
        this.delYn = delYn;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }
}

