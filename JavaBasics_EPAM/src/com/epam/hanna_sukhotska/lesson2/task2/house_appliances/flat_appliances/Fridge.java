package com.epam.hanna_sukhotska.lesson2.task2.house_appliances.flat_appliances;

import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.BaseAppliance;
import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.Room;

/**
 * Created by sanna on 09.08.2017.
 */
public class Fridge extends BaseAppliance{
    public Fridge(){
        this.name = "Fridge Nord";
        this.power = 2500;
        this.room = Room.Kitchen;
    }

    @Override
    public void doWork(){
        System.out.println(this.name + " freezzes products with power " + this.power);
    }
}
