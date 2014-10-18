package com.practice.programs.exception;

/**
 *
 * @author choudhuryb
 */
public class MyExceptionTest {

    public static void main(String[] args) {
        try {
            throw new MyException("This is my Exception");
        } catch (MyException e) {
            System.out.println("Exception Message : " + e.getMessage());

        }

    }
}
