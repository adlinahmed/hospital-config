package com.trilogyed.hospitalinventoryservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "equipment_location")
public class Inventory {
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Id
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
