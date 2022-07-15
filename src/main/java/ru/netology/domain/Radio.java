package ru.netology.domain;

import java.lang.reflect.Constructor;

public class Radio {
    private int currentStation = 0;
    private int currentVolume = 0;
    private int minStation = 0;
    private int countStation = 10;
    private int maxStation = countStation - 1;

    private int maxVolume = 100;


    public Radio(int countStation, int maxVolume) {
        this.countStation = countStation;
        this.maxVolume = maxVolume;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation > maxStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation(int currentStation) {//следующая станция
        currentStation = currentStation + 1;
        setCurrentStation(currentStation);
    }

    public void prevStation(int currentStation) {//предыдущая станция
        currentStation = currentStation - 1;
        setCurrentStation(currentStation);
    }

    public void increaseVolume(int currentVolume) {//увеличение громкости
        currentVolume = currentVolume + 1;
        setCurrentVolume(currentVolume);
    }


    public void decreaseVolume(int currentVolume) {//уменьшение громкости
        currentVolume = currentVolume - 1;
        setCurrentVolume(currentVolume);
    }
}
