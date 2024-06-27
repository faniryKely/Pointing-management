import org.app.Application.Calendar;
import org.app.Model.Guardian;
import org.app.Model.Salary;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestForPointing {
    @Test
    public void insertEmploye() {
        Guardian Rakoto = new Guardian(
                "Rakoto",
                "Baristone",
                12,
                LocalDate.of(1987, Month.FEBRUARY, 05),
                LocalDate.of(2024, Month.JUNE, 06),
                LocalDate.of(2026, Month.JUNE, 07),
                "Guardian",
                100000
        );

        Guardian Rabe = new Guardian(
                "Rabenatoandro",
                "Henry",
                14,
                LocalDate.of(1997, Month.DECEMBER, 12),
                LocalDate.of(2023, Month.AUGUST, 21),
                LocalDate.of(2025, Month.AUGUST, 23),
                "Guardian",
                100000
        );

    }
    @Test
    public void insertSalary() {
        Guardian Rakoto = new Guardian(
                "Rakoto",
                "Baristone",
                12,
                LocalDate.of(1987, Month.FEBRUARY, 05),
                LocalDate.of(2024, Month.JUNE, 06),
                LocalDate.of(2026, Month.JUNE, 07),
                "Guardian",
                100000
        );

        Guardian Rabe = new Guardian(
                "Rabenatoandro",
                "Henry",
                14,
                LocalDate.of(1997, Month.DECEMBER, 12),
                LocalDate.of(2023, Month.AUGUST, 21),
                LocalDate.of(2025, Month.AUGUST, 23),
                "Guardian",
                100000
        );

        assertEquals(80000, Rakoto.getNetGuardianSalaryPerWeek());

        assertEquals(80000, Rabe.getNetGuardianSalaryPerWeek());

    }
    @Test
    public void totalWorkDay(){
        Calendar Rakoto = new Calendar(LocalDate.of(2024, Month.MAY, 26), LocalDate.of(2024, Month.JULY, 6));
        int exceptedTotalWorkDayValue = 42;
        assertEquals(exceptedTotalWorkDayValue, Rakoto.calculateTotalWorkDay(7, 6, 0));


    }
    @Test
    public void totalHourOfWork(){
        Calendar Rakoto = new Calendar(LocalDate.of(2024, Month.MAY, 26), LocalDate.of(2024, Month.JULY, 6));
        int exceptedTotalHourWorkValue = 420;
        assertEquals(exceptedTotalHourWorkValue, Rakoto.calculateTotalWorkPerHour(10, 6, 0, 7));

    }
    @Test
    public void TestSalaryPerDay() {
        Guardian Rakoto = new Guardian(
                "Rakoto",
                "Baristone",
                12,
                LocalDate.of(1987, Month.FEBRUARY, 05),
                LocalDate.of(2024, Month.JUNE, 06),
                LocalDate.of(2026, Month.JUNE, 07),
                "Guardian",
                100000
        );
        double exceptedValueOfSalaryPerDay = 14285.71;
        assertEquals(exceptedValueOfSalaryPerDay, Rakoto.getNetGuardianSalaryPerDay(7));

    }
    @Test
    public void TestSalaryPerHour(){
        Guardian Rakoto = new Guardian(
                "Rakoto",
                "Baristone",
                12,
                LocalDate.of(1987, Month.FEBRUARY, 05),
                LocalDate.of(2024, Month.JUNE, 06),
                LocalDate.of(2026, Month.JUNE, 07),
                "Guardian",
                100000
        );
        Guardian Rabe = new Guardian(
                "Rabenatoandro",
                "Henry",
                14,
                LocalDate.of(1997, Month.DECEMBER, 12),
                LocalDate.of(2023, Month.AUGUST, 21),
                LocalDate.of(2025, Month.AUGUST, 23),
                "Guardian",
                100000
        );
        double exceptedValueOfSalaryPerHourForRakoto = 1428.571;

        assertEquals(exceptedValueOfSalaryPerHourForRakoto, Rakoto.getSalaryPerHour(10));

    }
    @Test
    public void TestSalaryPerGuardian(){
        Guardian Rabe = new Guardian(
                "Rabenatoandro",
                "Henry",
                14,
                LocalDate.of(1997, Month.DECEMBER, 12),
                LocalDate.of(2023, Month.AUGUST, 21),
                LocalDate.of(2025, Month.AUGUST, 23),
                "Guardian",
                100000
        );
        Salary salaryForRabe = new Salary(100000, 80000, Rabe);
        double excepetedValueOfSalaryPerGuardian = 780000;

        assertEquals(excepetedValueOfSalaryPerGuardian, salaryForRabe.calculateNetSalaryNight(6));

    }
}
