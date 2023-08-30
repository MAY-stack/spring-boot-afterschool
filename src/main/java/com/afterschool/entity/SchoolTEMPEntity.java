package com.afterschool.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity(name="school")
@Table(name="tbl_school")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SchoolTEMPEntity {

    @Id
    @Column(name="school_seqno")
    private int schoolSeqno;
    
    @Column(name="school_name", length=100, nullable=true)
    private String schoolName;

    @Column(name="school_addr", length=200, nullable=true)
    private String schoolAddr;
    
}
