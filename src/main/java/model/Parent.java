package model;

import java.io.Serializable;

public class Parent extends Person implements Serializable {
    public Parent (long id, String name, String occupation, int noOfChile) {
        this.id = id;
        this.name = name;
        this.occupation = occupation;
        this.noOfChile = noOfChile;
    }

    String occupation;
    int noOfChile;

    public long getNoOfChile() {
        return noOfChile;
    }

    public void setNoOfChile(int noOfChile) {
        this.noOfChile = noOfChile;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
