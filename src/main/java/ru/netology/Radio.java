package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int currentVolumeLevel;
    private int numberOfRadioStation;
    private int maxRadioStation;
    private int minRadioStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int nextRadioStation;
    private int prevRadioStation;
    private int nextVolumeStation;
    private int prevVolumeStation;

    public Radio(
            int numberOfRadioStation,
            int currentRadioStation,
            int currentVolumeLevel
    ) {
        if (numberOfRadioStation > 0) {
            this.numberOfRadioStation = numberOfRadioStation;
        } else {
            this.numberOfRadioStation = 10;
        }
        maxRadioStation = this.numberOfRadioStation - 1;

        if (currentRadioStation < maxRadioStation) {
            this.nextRadioStation = currentRadioStation + 1;
        } else {
            this.nextRadioStation = minRadioStation;
        }

        if (currentRadioStation > 0) {
            prevRadioStation = currentRadioStation - 1;
        } else {
            prevRadioStation = maxRadioStation;
        }

        this.currentRadioStation = currentRadioStation - 1;

        if (currentVolumeLevel < 100) {
            nextVolumeStation = currentVolumeLevel + 1;
        } else {
            nextVolumeStation = maxVolume;
        }

        if (currentVolumeLevel > 0) {
            prevVolumeStation = currentVolumeLevel - 1;
        } else {
            prevVolumeStation = minVolume;
        }
        this.currentVolumeLevel = currentVolumeLevel;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getNextVolumeStation() {
        return nextVolumeStation;
    }

    public int getCurrentVolumeLevel() {
        return this.currentVolumeLevel;
    }

    public int getNumberOfRadioStation() {
        return numberOfRadioStation;
    }

    public int getPrevVolumeStation() {
        return prevVolumeStation;
    }

    public int getNextRadioStation() {
        return nextRadioStation;
    }

    public int getPrevRadioStation() {
        return prevRadioStation;
    }
}
