package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Radio {
    private int currentStation = 0;
    private int currentVolume = 0;
    private int countStation = 9;
    private int maxVolume = 100;

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            this.currentStation = countStation;
            return;
        }
        if (currentStation > countStation) {
            this.currentStation = 0;
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
