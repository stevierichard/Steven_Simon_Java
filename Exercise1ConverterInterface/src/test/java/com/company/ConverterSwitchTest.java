package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {

    ConverterSwitch converterSwitch;

    @Before
    public void setUp() { converterSwitch = new ConverterSwitch();
    }

    @Test
    public void shouldReturnMonth(){
        assertEquals("December", converterSwitch.convertMonth(12));
        assertEquals("August", converterSwitch.convertMonth(8));
        assertEquals("January", converterSwitch.convertMonth(1));

    }
    @Test
    public void shouldReturnDay(){
        assertEquals("Sunday", converterSwitch.convertDay(1));
        assertEquals("Wednesday", converterSwitch.convertDay(4));
        assertEquals("Saturday", converterSwitch.convertDay(7));
    }

    @Test
    public void  shouldReturnErrorMessage(){
        assertEquals("Invalid Day Number", converterSwitch.convertDay(8));
        assertEquals("Invalid Month Number", converterSwitch.convertMonth(15));
    }

}