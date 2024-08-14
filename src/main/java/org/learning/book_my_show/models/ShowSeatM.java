package org.learning.book_my_show.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// M - MappingClass
@Entity
public class ShowSeatM extends BaseModel{
    @ManyToOne
    private Show show;

    @ManyToOne
    private Seat seat;
    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;
}

/*
    1             1
ShowSeat ------ Show => M:1
    M             1

Take ShowSeat:
Show - X,Y,Z
Seat - A1,A2,A3
ShowSeat - XA1,XA2,XA3,YA1,ZA1..

    1             1
ShowSeat ------ Seat =>
    M             1
 */
