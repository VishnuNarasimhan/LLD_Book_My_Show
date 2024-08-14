package org.learning.book_my_show.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
public class Region extends BaseModel{
    private String name;
    //private List<Theater> theaters; Since theater class has region in it.
}
