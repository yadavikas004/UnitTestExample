package com.softshop.test.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssertExample {

    //Assertion - validating actual result with expected result
    //Assertions class

    @Test
    public void test1(){
        System.out.println("Testing some assertions methods");
        int actual =12;
        Integer expected = 12;
        //Overloaded
        Assertions.assertEquals(expected,actual);

        int[] actualIntArray={1,2,3,4,5};
        int[] expectedIntArray={1,2,3,4,5};
        Assertions.assertArrayEquals(expectedIntArray,actualIntArray);

        String actualName = new String("rahul");
        String expectedName = new String("rahul");
        Assertions.assertEquals(expectedName,actualName);  //assertSame

        // Assertions.assertNull();
        // Assertions.assertNotNull();
        //boolean value = false;
        //Assertions.assertTrue(value);

        List<Integer> list1 = Arrays.asList(1,2,3,4,5); // If list of data will increase then it will be assertIterableEquals
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);

        Assertions.assertIterableEquals(list2,list1);
//        Assertions.assertThrows(RuntimeException.class,()->{
//            System.out.println("this is testing executable");
//            throw new RuntimeException("This is testing exception");
//        });
    }
}
