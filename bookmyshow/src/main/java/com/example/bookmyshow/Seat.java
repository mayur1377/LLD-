package com.example.bookmyshow;

import com.example.bookmyshow.Enums.SeatCategory;

public class Seat {
    public int seatId;
    int row;
    SeatCategory seatCategory;

    public Seat(int seatId, int row, SeatCategory seatCategory) {
        this.seatId = seatId;
        this.row = row;
        this.seatCategory = seatCategory;
    }

    public int getSeatId() {
        return seatId;
    }

    public int getRow() {
        return row;
    }

    public SeatCategory getSeatCategory() {
        return seatCategory;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setSeatCategory(SeatCategory seatCategory) {
        this.seatCategory = seatCategory;
    }

}
