package org.learning.book_my_show.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id // PK attribute for all the child classes of BaseModel.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO INCREMENT
    private Long id;
    private Date createdAt;
    private Date lastModifiedAt;
}
// We don't need the table for BaseModel Class
// But we want all the attributes of BaseModel class to be present in the model tables.

// @MappedSuperclass indicates that a class is a superclass and
// is not associated with a specific database table,
// but its fields (or properties) can be inherited by child entity classes that are associated with tables.