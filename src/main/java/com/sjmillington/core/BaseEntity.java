package com.sjmillington.core;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    //Creates an E-Tag in the header.
    //Can then use If-Match, version number in the header so it'll only update or get or whatever if matches
    @Version
    private Long version;


    protected BaseEntity() {
        this.id = null;
    }

    public Long getId() {
        return id;
    }
}
