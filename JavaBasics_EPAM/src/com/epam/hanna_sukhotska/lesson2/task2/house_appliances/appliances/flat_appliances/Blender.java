package com.epam.hanna_sukhotska.lesson2.task2.house_appliances.appliances.flat_appliances;

import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.appliances.BaseAppliance;
import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.Room;

/**
 * Created by sanna on 09.08.2017.
 */
public class Blender extends BaseAppliance {

    public Blender(){
        this.name = "Blender Bosch";
        this.power = 850;
        this.room = Room.Kitchen;
    }

    @Override
    public void doWork(){
        System.out.println(this.name + " grindes products with power " + this.power);
    }
}
