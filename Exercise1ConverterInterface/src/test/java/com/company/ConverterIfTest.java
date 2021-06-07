package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {

    ConverterIf converterIf;

    @Before
    public void setUp() {
        converterIf = new ConverterIf();
    }
        @Test
                public void shouldReturnMonth(){
                    assertEquals("December", converterIf.convertMonth(12));
                    assertEquals("August", converterIf.convertMonth(8));
                    assertEquals("January", converterIf.convertMonth(1));

    }
        @Test
                public void shouldReturnDay(){
                    assertEquals("Sunday", converterIf.convertDay(1));
                    assertEquals("Wednesday", converterIf.convertDay(4));
                    assertEquals("Saturday", converterIf.convertDay(7));
        }

        @Test
                public void  shouldReturnErrorMessage(){
                    assertEquals("Invalid Day Number", converterIf.convertDay(8));
                    assertEquals("Invalid Month Number", converterIf.convertMonth(15));
        }
}