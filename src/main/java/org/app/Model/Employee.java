package org.app.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public sealed class Employee permits NormalEmployee, Guardian {
    protected String name;
    protected String firstName;
    protected int matriculation;
    protected LocalDate birthDate;
    protected LocalDate startWorkDate;
    protected LocalDate endWorkDate;
}
