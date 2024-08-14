package org.learning.book_my_show.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// M - MappingClass
@Entity
public class ShowSeatTypeM extends BaseModel{
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;
    private int prize;
}


/*
Show - X,Y,Z
SeatType - GOLD, SILVER, PLATINUM
ShowSeatType - XGOLD, XSILVER, XPLATINUM

    1                 1
ShowSeatType ------ Show => M:1
    M                 1
 */