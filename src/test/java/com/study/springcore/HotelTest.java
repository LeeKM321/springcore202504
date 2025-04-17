package com.study.springcore;

import com.study.springcore.chap03.Hotel;
import com.study.springcore.chap03.config.AppConfig;
import org.junit.jupiter.api.Test;

public class HotelTest {

    @Test
    void hotelTest() {
        AppConfig config = new AppConfig();
        Hotel hotel = config.hotel();

        hotel.inform();
    }

}
