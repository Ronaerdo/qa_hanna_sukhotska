package com.epam.hanna_sukhotska.lesson2.task2.house_appliances.flat_appliances;

import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.BaseAppliance;
import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.Room;

/**
 * Created by sanna on 09.08.2017.
 */
public class Heater extends BaseAppliance {
    public Heater(){
        this.name = "Heater UFO";
        this.power = 1550;
        this.room = Room.Bedroom;
    }

    @Override
    public void doWork(){
        System.out.println(this.name + " heates room with power " + this.power);
    }
}
