package com.epam.hanna_sukhotska.lesson2.task2.house_appliances;

/**
 * Created by sanna on 09.08.2017.
 */
public abstract class BaseAppliance implements ElectronicAppliance {
    protected int power;
    protected String name;
    protected boolean pluggedInState;
    protected Room room;

    public void plugIn(boolean flag){
        pluggedInState = flag;
    }
    public int getPower(){
        return power;
    }
    public String getName(){
        return name;
    }
    public boolean isPluggedIn(){
        return pluggedInState;
    }

    public Room getRoom(){
        return room;
    }

    public abstract void doWork();

}
