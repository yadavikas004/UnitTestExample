package com.softshop.test.services;

import org.junit.*;

import java.util.Date;

public class CalculatorServiceTest {

    int counter = 0;

    @BeforeClass //before all test cases
    public static void init(){
        System.out.println("Before all test cases:");
        System.out.println("Started test: "+new Date());

        //connection open|file open
    }

    @Before // executes the method before each test case
    public void beforeEach(){
        System.out.println("Before each test case");
        counter = 0;
    }

    //test method of addTwoNumbers

    @Test(timeout = 2000)
    public void addTwoNumbersTest() throws InterruptedException {
        for (int i = 1;i<=20;i++){
            counter+=i;
        }
        //Thread.sleep(3000); // Here Thread will sleep for 3milliseconds and timeout is given for 2milliseconds
        System.out.println("Test for addTwoNumbersTest");
        int result = CalculatorService.addTwoNumbers(12,45);
        int expected = 57;
        System.out.println("Counter int first test case :"+counter);
        Assert.assertEquals(expected,result);
        // actual result

        //expected result
    }

    @Test
    public void sumAnyNumbersTest(){
        for (int i = 1;i<=100;i++){
            counter+=i;
        }
        System.out.println("Test for sumAnyNumbersTest");
        int result = CalculatorService.sumAnyNumbers(2,7,8,9);
        int expectedResult = 26;
        System.out.println("Counter int second test case :"+counter);
        Assert.assertEquals(expectedResult,result);
    }

    @AfterClass //after all test cases
    public static void cleanup(){
        System.out.println("After all test cases");
        System.out.println("End Test cases : "+new Date());
    }

    //Test
    //BeforeClass
    //AfterClass
    //Before
    //After

    @Test
    public void sum(){
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=i;
            System.out.println(sum+"  "+i);
        }
        System.out.println("Total sum"+sum);
    }
}
