package org.learning.book_my_show.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel { // Ticket Class
    private String bookingNumber;

    @ManyToOne
    private User user;

    @ManyToOne
    private Show show;

    @ManyToMany
    private List<ShowSeatM> showSeat;
    private int amount;

    @OneToMany
    private List<Payment> payments;

    @Enumerated(EnumType.ORDINAL) // It will store whole string i.e CONFIRMED or PENDING instead,
    // it will store id for particular enum such as,
    // CONFIRMED - 0, PENDING - 1
    private BookingStatus bookingStatus; // ENUM
}


/*
    1              M
 Booking ----- ShowSeat => M:M
    M              1
 */
