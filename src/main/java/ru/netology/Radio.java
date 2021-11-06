package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int currentVolumeLevel;


    public void setCurrentRadioStation(int currentRadioStation) {
        int minRadioStation = 0;
        int maxRadioStation = 9;
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation=currentRadioStation;

    }

    public void increaseStation() {
        int minRadioStation = 0;
        int counter = currentRadioStation;
        if (currentRadioStation < 9) {
            currentRadioStation = counter+1;
        }
        else currentRadioStation = minRadioStation;
    }

    public void decreaseStation() {
        int maxRadioStation = 9;
        int counter = currentRadioStation;
        if (currentRadioStation > 0) {
            currentRadioStation = counter-1;
        }
        else currentRadioStation = maxRadioStation;
    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        int minVolume = 0;
        int maxVolume = 10;
        if (currentVolumeLevel < minVolume) {
            return;
        }
        if (currentVolumeLevel > maxVolume) {
            return;
        }
        this.currentVolumeLevel=currentVolumeLevel;

    }

    public void increaseVolume() {
        int maxVolume = 10;
        int counter = currentVolumeLevel;
        if (currentVolumeLevel < 10) {
            currentVolumeLevel = counter+1;
        }
        else currentVolumeLevel = maxVolume;
    }

    public void decreaseVolume() {
        int minVolume = 0;
        int counter = currentVolumeLevel;
        if (currentVolumeLevel > 0) {
            currentVolumeLevel = counter-1;
        }
        else currentVolumeLevel = minVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }


}
