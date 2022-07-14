package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    Radio radio = new Radio();

    @ParameterizedTest
    @CsvFileSource(resources = {"/data_station_next.csv"})

    public void nextStation(int currentStation, int expected) {
        radio.setCurrentStation(currentStation);
        radio.nextStation(currentStation);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(resources = {"/data_volume_dec.csv"})

    public void decVolume(int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume(currentVolume);
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @CsvFileSource(resources = {"/data_volume_inc.csv"})
    @ParameterizedTest

    public void incVolume(int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume(currentVolume);
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data_station_prev.csv"})

    public void prevStation(int currentStation, int expected) {
        radio.setCurrentStation(currentStation);
        radio.prevStation(currentStation);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
