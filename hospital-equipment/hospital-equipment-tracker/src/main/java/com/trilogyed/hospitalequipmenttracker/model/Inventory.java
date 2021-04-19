package com.trilogyed.hospitalequipmenttracker.model;

import java.util.Objects;

public class Inventory {
    Integer id;
    String description;
    String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventory inventory = (Inventory) o;
        return Objects.equals(id, inventory.id) && Objects.equals(description, inventory.description) && Objects.equals(location, inventory.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, location);
    }
}
