package org.app.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.app.Application.Salary;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public  class Categories {
   private String categoriesName;
   private int hourPerWeek;
   private Salary salaryPerWeek;
   private float Indemnity;

}
