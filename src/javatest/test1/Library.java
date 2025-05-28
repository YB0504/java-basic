package javatest.test1;

import java.time.LocalDateTime;

public class Library {

    private boolean status;
    private LocalDateTime rentalTime;
    private LocalDateTime returnTime;

    public boolean isStatus() {
        return status;
    }

    public LocalDateTime getRentalTime() {
        return rentalTime;
    }

    public LocalDateTime getReturnTime() {
        return returnTime;
    }
}

