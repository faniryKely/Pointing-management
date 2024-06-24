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
    private List<LocalDate> offDay;
    private LocalDate endDate;

   public Calendar(Month month, int year, List<LocalDate> offDay) {
       this.startDate = LocalDate.of(year, month, 1);
       this.endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());
       this.offDay = offDay;
   }


}
