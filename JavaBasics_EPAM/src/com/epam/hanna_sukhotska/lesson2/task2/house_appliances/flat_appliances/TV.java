package com.epam.hanna_sukhotska.lesson2.task2.house_appliances.flat_appliances;

import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.BaseAppliance;
import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.Room;

/**
 * Created by sanna on 09.08.2017.
 */
public class TV extends BaseAppliance {
    public TV(){
        this.name = "TV Samsung";
        this.power = 1500;
        this.room = Room.LivingRoom;
    }

    @Override
    public void doWork(){
        System.out.println(this.name + " shows movies with power " + this.power);
    }
}
