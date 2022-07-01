package ru.netology.domain;

public class Radio {
    private int currentStation = 0;
    private int currentVolume = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            this.currentStation = 9;
            return;
        }
        if (currentStation > 9) {
            this.currentStation = 0;
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
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
