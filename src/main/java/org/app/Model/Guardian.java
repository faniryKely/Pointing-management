package org.app.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public final class Guardian extends Employee {
   private Categories guardianCategories;
   private Salary salary;

    public Guardian(String name, String firstName, int matriculation, Date birthDate, Date startWorkDate, Date endWorkDate, Categories guardianCategories) {
        super(name, firstName, matriculation, birthDate, startWorkDate, endWorkDate);
        this.guardianCategories = guardianCategories;
    }

    public double getSalary() {
        double grossSalary = salary.getNetSalary();
        double finalSalary = grossSalary - ( grossSalary * 20 ) / 100 ;
        return finalSalary;
    }


}
