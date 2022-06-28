package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTestDecreaseVolume {
    @ParameterizedTest
    @CsvFileSource(resources = {"/data_volume_dec.csv"})

    public void decVolume (int currentVolume, int expected){
        Radio radio=new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume(currentVolume);
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
