package org.app.Application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.app.Model.Guardian;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
public class Pointing {
    private LocalDateTime StartShiftDay;
    private LocalDateTime EndShiftDay;
    private LocalDateTime StartShiftNight;
    private LocalDateTime EndShiftNight;

    public Pointing() {
        this.StartShiftDay = LocalDateTime.of(LocalDate.now(), LocalTime.of(7, 00));
        this.EndShiftDay = this.StartShiftDay.plusHours(10);
        this.StartShiftNight = this.EndShiftDay;
        this.EndShiftNight = this.StartShiftNight.plusHours(14);

    }

    public Duration calculateHourOfWorkDayPerWeek(String Name) {
        int totalHourForOneDay =  10 ;
        Duration totalHourOnWeek = Duration.ofHours(totalHourForOneDay * 7 );
        return totalHourOnWeek;
    }

    public Duration calculateHourOfWorkNightPerWeek(String Name) {
        int totalHourForOneDay =  14 ;
        Duration totalHourOnWeek = Duration.ofHours(totalHourForOneDay * 7 );
        return totalHourOnWeek;
    }



}
