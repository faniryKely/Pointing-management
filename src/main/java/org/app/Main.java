package org.app;

import org.app.Application.Calendar;

import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        System.out.println(calendar.getOpenDayOnTheMonth(Month.JUNE));;

    }
}