package org.app.Model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Date;
@Getter
@Setter
public final class Guardian extends Employee {
   private String guardianCategories;
   private double salary;


    public Guardian(String name, String firstName, int matriculation, LocalDate birthDate, LocalDate startWorkDate, LocalDate endWorkDate, String guardian, double StartSalary) {
        super(name, firstName, matriculation, birthDate, startWorkDate, endWorkDate);
        this.guardianCategories = guardian;
        this.startWorkDate = startWorkDate;
        this.salary = StartSalary;
    }

    public double getNetGuardianSalaryPerWeek() {
        double netGuardianSalary = 0;
        netGuardianSalary = getSalary() - (getSalary() * 0.2);
        return netGuardianSalary;
    }


    public double getSalaryPerHour(int hours){
        double salaryPerDay = getSalary() / 7;
        double salaryPerHour = ((salaryPerDay / hours));
        BigDecimal bd = new BigDecimal(salaryPerHour).setScale(3, BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }

}
