package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    //Station test

    @Test
    void currentRadioStationLessThanZero() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void currentRadioStationMoreThanNine() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(11);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void currentRadioStationFallsIntoTheNumberingOfStations() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void addStationIfTheCurrentIsOne() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(1);
        radioStation.increaseStation();

        int expected = 2;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void addStationIfTheCurrentIsNine() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(9);
        radioStation.increaseStation();

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void takeAwayStationIfTheCurrentIsOne() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(1);
        radioStation.decreaseStation();

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void takeAwayStationIfTheCurrentIsZero() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(0);
        radioStation.decreaseStation();

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    //Volume test

    @Test
    void currentVolumeLevelLessThanZero() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolumeLevel(-1);

        int expected = 0;
        int actual = radioVolume.getCurrentVolumeLevel();

        assertEquals(expected, actual);
    }

    @Test
    void currentVolumeLevelMoreThanTen() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolumeLevel(11);

        int expected = 0;
        int actual = radioVolume.getCurrentVolumeLevel();

        assertEquals(expected, actual);
    }

    @Test
    void currentVolumeLevelFallsIntoTheNumberingOfStations() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolumeLevel(5);

        int expected = 5;
        int actual = radioVolume.getCurrentVolumeLevel();

        assertEquals(expected, actual);
    }

    @Test
    void addVolumeLevelIfTheCurrentIsOne() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolumeLevel(1);
        radioVolume.increaseVolume();

        int expected = 2;
        int actual = radioVolume.getCurrentVolumeLevel();

        assertEquals(expected, actual);
    }

    @Test
    void addVolumeLevelIfTheCurrentIsTen() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolumeLevel(10);
        radioVolume.increaseVolume();

        int expected = 10;
        int actual = radioVolume.getCurrentVolumeLevel();

        assertEquals(expected, actual);
    }

    @Test
    void takeAwayVolumeLevelIfTheCurrentIsOne() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolumeLevel(1);
        radioVolume.decreaseVolume();

        int expected = 0;
        int actual = radioVolume.getCurrentVolumeLevel();

        assertEquals(expected, actual);
    }

    @Test
    void takeAwayVolumeLeveIfTheCurrentIsZero() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolumeLevel(0);
        radioVolume.decreaseVolume();

        int expected = 0;
        int actual = radioVolume.getCurrentVolumeLevel();

        assertEquals(expected, actual);
    }



}