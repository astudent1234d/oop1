package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void NumberOfRadioStationNotZeroAndIncreaseStationAndDecreaseStation() {
        Radio numbRadioStation = new Radio(
                15,
                15,
                100
        );
        assertEquals(15, numbRadioStation.getNumberOfRadioStation());
        assertEquals(14, numbRadioStation.getCurrentRadioStation());
        assertEquals(14, numbRadioStation.getPrevRadioStation());
        assertEquals(0, numbRadioStation.getNextRadioStation());
        assertEquals(100, numbRadioStation.getNextVolumeStation());
        }

    @Test
    public void NumberOfRadioStationZeroCurrentRadioStationZeroAndVolumeInLimit() {
        Radio numbRadioStation = new Radio(
                0,
                0,
                0
        );
        assertEquals(10, numbRadioStation.getNumberOfRadioStation());
        assertEquals(1, numbRadioStation.getNextRadioStation());
        assertEquals(9, numbRadioStation.getPrevRadioStation());
        assertEquals(0, numbRadioStation.getCurrentVolumeLevel());
        assertEquals(0, numbRadioStation.getPrevVolumeStation());
    }
}


