package com.softshop.test.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJUnit5 {

    //execute the logic before all test cases

    @BeforeAll
    public static void init(){
        System.out.println("This is single time logic");
    }

    @BeforeEach
    public void eachTestCase(){
        System.out.println("Before each");
    }

    @AfterEach
    public void afterTestCase(){
        System.out.println("After each");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("After all test case logic");
    }
    @Test
    @DisplayName("This is custom name")
    public void addTwoNumbersTest(){
        System.out.println("First Test Case");
        int actualResult = CalculatorService.addTwoNumbers(12,12);
        int expectedResult=24;
        Assertions.assertEquals(expectedResult,actualResult,"Test Failed !!");
    }

    @Test
    @Disabled
    public void addAnyNumbersTest(){
        System.out.println("Second Test Case");
        int result = CalculatorService.sumAnyNumbers(12,1,2,3);
        int expectedResult = 18;
        Assertions.assertEquals(expectedResult,result);
    }

//    @Tag()
//    @Nested
//    @TestFactory
}
