package com.epam.hanna_sukhotska.lesson2.task2.house_appliances.appliances;

import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.Room;

/**
 * Created by sanna on 09.08.2017.
 */
public interface ElectronicAppliance {
    int getPower();
    String getName();
    boolean isPluggedIn();
    void plugIn(boolean flag);
    Room getRoom();
    void doWork();
}
