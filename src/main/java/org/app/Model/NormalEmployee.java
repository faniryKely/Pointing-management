package org.app.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public final class NormalEmployee extends Employee {
    private Categories normalCategory;
    public NormalEmployee(String name, String firstName, int matriculation, Date birthDate, Date startWorkDate, Date endWorkDate, Categories categories) {
        super(name, firstName, matriculation, birthDate, startWorkDate, endWorkDate);
        this.normalCategory = categories;
    }
}
