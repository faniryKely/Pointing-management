package org.app.Application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.app.Model.Guardian;
import org.app.Model.WorkShift;

import java.math.BigDecimal;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class Salary {
    private double grossSalary;
    private double netSalary;
    private WorkShift workShift;
    private Guardian guardian;

    public Salary(double grossSalary, double netSalary, Guardian guardian, WorkShift workShift) {
        this.grossSalary = grossSalary;
        this.netSalary = netSalary;
        this.guardian = guardian;
        this.workShift = workShift;
    }

    public double salaryIncreased() {
        double salary = 0.0;
        switch (workShift) {
            case DAY -> salary += getGrossSalary();
            case NIGHT -> salary += getGrossSalary() * 1.3;
        }

        return salary;
    }


    public double calculateNetSalaryNight(int weeks) {
        double totalSalary = salaryIncreased() * weeks;
        return totalSalary;
    }

    public double getNetGuardianSalaryPerNight(int night){
        double salary = salaryIncreased() / night;
        BigDecimal bd = new BigDecimal(salary).setScale(2, BigDecimal.ROUND_DOWN);
        return bd.doubleValue();
    }

    public double getNetSalaryGuardianPerDay(int day) {
        double salary = salaryIncreased() / day;
        BigDecimal bd = new BigDecimal(salary).setScale(2, BigDecimal.ROUND_DOWN);
        return bd.doubleValue();
    }

    public double getNetSalaryNightPerHour(int hour) {
        double salaryNight = salaryIncreased() / 7;
        double salary =  salaryNight / hour;
        BigDecimal bd = new BigDecimal(salary).setScale(2, BigDecimal.ROUND_DOWN);
        return bd.doubleValue();
    }
}
