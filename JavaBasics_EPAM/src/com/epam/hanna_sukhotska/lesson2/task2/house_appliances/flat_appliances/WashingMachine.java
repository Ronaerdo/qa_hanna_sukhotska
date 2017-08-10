package com.epam.hanna_sukhotska.lesson2.task2.house_appliances.flat_appliances;

import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.BaseAppliance;
import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.Room;

/**
 * Created by sanna on 09.08.2017.
 */
public class WashingMachine extends BaseAppliance{
    public WashingMachine(){
        this.name = "Washing Machine Elenberg";
        this.power = 2650;
        this.room = Room.Bathroom;
    }

    @Override
    public void doWork(){
        System.out.println(this.name + " washes clothes with power " + this.power);
    }
}
