package org.app.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.app.Application.Pointing;

@Getter
@Setter
@NoArgsConstructor
public class Salary {
    private double grossSalary;
    private double netSalary;
    private Guardian guardian;

    public Salary(double grossSalary, double netSalary, Guardian guardian) {
        this.grossSalary = grossSalary;
        this.netSalary = netSalary;
        this.guardian = guardian;
    }



    public double calculateNetSalaryNight(int weeks) {
        double totalSalary = ((getGrossSalary() * weeks ) * 1.3);
        return totalSalary;
    }

//    public double SalaryPerHourForShiftNight(int weeks, int hours){
//        double salaryTotal = calculateNetSalaryNight(weeks) / hours;
//        return salaryTotal;
//    }

}
