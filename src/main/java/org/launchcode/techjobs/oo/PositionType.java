package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType {

    private int id;
    private static int nextId = 1;
    private String value;


    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String aValue) {
        this();
        this.value = aValue;
    }


    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (getClass() != o.getClass()) {
            return false;
        }

        PositionType that = (PositionType) o;
        return this.id == that.id
                && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

//    public static void main(String[] args) {
//    PositionType position1 = new PositionType("Manager");
//    PositionType position2 = new PositionType("Director");
//    PositionType position3 = new PositionType("Manager");
//
//    // Test equals method
//        System.out.println(position1.equals(position1));
//        System.out.println(position1.equals(position3));
//}
}
