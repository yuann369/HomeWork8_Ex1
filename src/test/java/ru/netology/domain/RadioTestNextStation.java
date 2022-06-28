package ru.netology.domain;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTestNextStation {

    @ParameterizedTest
    @CsvFileSource(resources = {"/data_station_next.csv"})

    public void nextStation (int currentStation, int expected){
        Radio radio=new Radio();
        radio.setCurrentStation(currentStation);
        radio.next(currentStation);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
