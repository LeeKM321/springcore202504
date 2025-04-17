package com.study.springcore;

import com.study.springcore.chap01.Hotel;
import org.junit.jupiter.api.Test;

public class HotelTest {

    @Test
    void hotelTest() {
        Hotel hotel = new Hotel();
        hotel.inform();
    }

}
