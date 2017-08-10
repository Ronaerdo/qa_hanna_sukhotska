package com.epam.hanna_sukhotska.lesson2.task2.house_appliances;

import java.util.Collections;

/**
 * Created by sanna on 09.08.2017.
 */
public class Flat {

    private static final int NUM_OF_APPLIANCES = 10;

    private ElectronicAppliance[] appliances;
    private int countAppliances;

    public Flat(){
        countAppliances = 0;
        appliances = new ElectronicAppliance[NUM_OF_APPLIANCES];
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
        for(int i = 1; i < appliances.length; i++) {
            int temp=0;
            if(x[i-1] > x[i]) {
                temp = x[i-1];
                x[i-1] = x[i];
                x[i] = temp;
            }
        }
    }
}
