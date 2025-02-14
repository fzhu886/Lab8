package com.example.lab8;

//import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.Before;
import org.junit.jupiter.api.Test;
//import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    /**
     * we create a CustomList object before running
     */
    private CustomList list;



    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = new CustomList(null, new ArrayList<City>());
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize+1);
    }


    /**
     * Add a city to the CustomList and then check if it exists in the {@link ArrayList}
     */
    @Test
    public void hasCityTest() {
        list = new CustomList(null, new ArrayList<City>());
        City mockCity = new City("Saskatoon", "SK");
        list.addCity(mockCity);
        assertTrue(list.hasCity(mockCity));
    }

    /**
     * Add a city to the CustomList and then delete to see if it exists in the {@link ArrayList} anymore
     */
    @Test
    public void deleteCityTest() {
        list = new CustomList(null, new ArrayList<City>());
        City mockCity = new City("Vancouver", "BC");
        list.addCity(mockCity);
        assertTrue(list.hasCity(mockCity));
        list.deleteCity(mockCity);
        assertEquals(0, list.getCount());
    }


    /**
     * Add a city object to the CustomList and check if the size of the list changes
     */
    @Test
    public void countCitiesTest() {
        list = new CustomList(null, new ArrayList<City>());
        assertEquals(0, list.getCount());
        City mockCity = new City("Missisauga", "ON");
        list.addCity(mockCity);
        assertEquals(1, list.getCount());
        //list.getCount();
    }
}
