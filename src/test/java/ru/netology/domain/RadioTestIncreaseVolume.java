package ru.netology.domain;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTestIncreaseVolume {

    @ParameterizedTest
    @CsvFileSource(resources = {"/data_volume_inc.csv"})

    public void incVolume (int currentVolume, int expected){
        Radio radio=new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume(currentVolume);
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
