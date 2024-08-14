package org.learning.book_my_show.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "users") // For changing the name of the table
public class User extends BaseModel{
    private String name;
    private String email;
    private String password;

    @OneToMany
    private List<Booking> bookings;
}
