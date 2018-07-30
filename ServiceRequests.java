/*
Kurt Kaiser
CTIM-168
7/23/2018

Customer Call Log
Chapter 9 - Project 10
 */

import java.util.*;

public class ServiceRequests {

    ArrayList<String> namesList = new ArrayList<String>();

    public ServiceRequests() {
    }

    public void addName(String name) throws BackUpException
    {
        try {
            namesList.add(name);
        } catch(BackUpException e){
            System.out.println("Not enough space");
        }

    }

    public void removeName(String name) throws RequestException
    {
        if (namesList.contains(name)) {
            namesList.remove(name);
        } else {
            throw new RequestException("Name is not in the list.");
        }
    }

    public String getName(int i){
        return namesList.get(i);
    }

    public int getNumber(){
        return namesList.size();
    }

    @Override
    public String toString() {
        return "namesList= " + namesList + '}';
    }
}
