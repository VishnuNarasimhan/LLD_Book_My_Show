package org.learning.book_my_show.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String name;
    private Date releaseDate;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection // Used because List<Feature> is a collection of enum not a single enum.
    // Creates List of IDs like 1,2,3,4
    private List<Feature> features;
}
