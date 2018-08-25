package model;

import java.io.Serializable;
import java.util.Date;

public class Child extends Person implements Serializable {
    Date dateOfBirth;

    public Child (long id, String name, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
