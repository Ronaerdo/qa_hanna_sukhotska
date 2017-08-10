package com.epam.hanna_sukhotska.lesson2.task2.house_appliances.appliances.flat_appliances;

import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.Room;
import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.appliances.BaseAppliance;

/**
 * Created by sanna on 10.08.2017.
 */
public class Microwave extends BaseAppliance{
    public Microwave(){
        this.name = "Microwave Saturn";
        this.power = 1700;
        this.room = Room.Kitchen;
    }

    @Override
    public void doWork(){
        System.out.println(this.name + " heats products with power " + this.power);
    }
}
