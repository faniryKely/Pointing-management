package org.app.Application;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Getter
@Setter

public class Calendar {
    private LocalDate startDate;
    private LocalDate endDate;

   public Calendar(LocalDate startDate, LocalDate endDate) {
       this.startDate = startDate;
       this.endDate = endDate;
   }

   public int calculateDayOfWork(int weeks, int days){
       return weeks * days;
   }

   public int calculateNightOfWork(int weeks, int night){
       return weeks * night;
   }

   public int calculateTotalWorkDay(int days, int weeks, int night){
       return (calculateDayOfWork(weeks, days) + calculateNightOfWork(night, days));
   }

   public int calculateTotalWorkPerHour(int hours, int weeks, int night, int days){
       int  totalWorkNightPerHour = ((hours * night) * weeks);
       int  totalWorkDayPerHour = ((hours * days) * weeks);
       return totalWorkNightPerHour + totalWorkDayPerHour;
   }


}
