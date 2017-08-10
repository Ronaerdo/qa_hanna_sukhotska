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

    /**
     * Method prints array of appliances
     */
    public void print(){
        for (int i = 0; i < countAppliances ; i++) {
            System.out.println(appliances[i]);
        }
    }
    public int getNumOfAppliances(){
        return countAppliances;
    }

    /**
     * Method adds new appliance to flat
     * @param e electronic appliance to add to array
     */
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

    /**
     * Method removes element from array of appliances
     * @param name the name of appliance you want to delete
     */
    public void removeAppliance(String name){
        for (int i = 0; i < countAppliances; i++) {
            if (appliances[i].getName().equals(name)){
                System.arraycopy(appliances, i + 1, appliances, i, countAppliances - i);
                countAppliances--;
                return;
            }
        }
    }

    /**
     * Method sorts the array of appliances in the flat
     */
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

    /**
     * Method search the appliance with given parameters in the flat
     * @param room
     * @param name
     * @param power
     * @param isPluggedIn
     * @return electronic appliance with given value of parameters
     */
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

    /**
     *
      * @return list of plugged in appliances
     */
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
