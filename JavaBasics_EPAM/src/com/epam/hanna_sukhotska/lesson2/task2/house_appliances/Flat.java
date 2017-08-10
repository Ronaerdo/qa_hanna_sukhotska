package com.epam.hanna_sukhotska.lesson2.task2.house_appliances;

import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.appliances.ElectronicAppliance;
import com.sun.istack.internal.Nullable;

/**
 * Created by sanna on 09.08.2017.
 */
public class Flat {

    private static final int NUM_OF_APPLIANCES = 5;

    private ElectronicAppliance[] appliances;
    private int countAppliances;

    public Flat(){
        countAppliances = 0;
        appliances = new ElectronicAppliance[NUM_OF_APPLIANCES];
    }

    public void print(){
        for (int i = 0; i < countAppliances ; i++) {
            System.out.println(appliances[i]);
        }
    }
    public int getNumOfAppliances(){
        return countAppliances;
    }

    public void addAppliance(ElectronicAppliance e){
        if (countAppliances >= appliances.length)
        {
            ElectronicAppliance [] tempArray = appliances;
            appliances = new ElectronicAppliance[appliances.length + NUM_OF_APPLIANCES];
            System.arraycopy(tempArray, 0, appliances, 0, tempArray.length);
        }
        appliances[countAppliances] = e;
        countAppliances++;
    }

    public void removeAppliance(int number){
        System.arraycopy(appliances, number + 1, appliances, number, countAppliances - number);
        countAppliances--;
    }

    public void sort(){
        for (int i = 0; i < countAppliances; i++) {
            for (int j = 1; j < (countAppliances - i); j++) {
                ElectronicAppliance temp;
                if (appliances[j - 1].getPower() > appliances[j].getPower()) {
                    temp = appliances[j - 1];
                    appliances[j - 1] = appliances[j];
                    appliances[j] = temp;
                }
            }
        }
    }

    public ElectronicAppliance search(Room room, String name, Integer power, Boolean isPluggedIn){
        for (int i = 0; i < countAppliances; i++) {
            if ((name == null || appliances[i].getName().equals(name))
                    && (appliances[i].getRoom() == room || room == Room.Undefined)
                    && (power == null || appliances[i].getPower() == power)
                    && (isPluggedIn == null || appliances[i].isPluggedIn() == isPluggedIn)) {
                return appliances[i];
            }
        }
        return null;
    }

    public ElectronicAppliance[] pluggedInAppliances (){
        Flat temp = new Flat();
        for (int i = 0; i < countAppliances; i++) {
            if (appliances[i].isPluggedIn()) {
                temp.addAppliance(appliances[i]);
            }
        }
        return temp.toArray();
    }

    public ElectronicAppliance[] toArray(){
        ElectronicAppliance[] temp = new ElectronicAppliance[countAppliances];
        System.arraycopy(appliances, 0, temp, 0, countAppliances);
        return temp;
    }
}
