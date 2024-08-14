package org.learning.book_my_show.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private int rowNo;
    private int colNo;
    private String seatNo;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;
}
