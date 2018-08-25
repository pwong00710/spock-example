package model;

import java.io.Serializable;

public class Person implements Serializable {
    long id;
    String name;

    public Person () {

    }

    public Person (long id, String name, String occupation, int noOfChile) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
