package org.app.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public sealed class Employee permits NormalEmployee, Guardian {
    protected String name;
    protected String firstName;
    protected int matriculation;
    protected Date birthDate;
    protected Date startWorkDate;
    protected Date endWorkDate;
}
