package com.trilogyed.hospitalequipmenttracker.controller;

import com.trilogyed.hospitalequipmenttracker.feign.Equipment;
import com.trilogyed.hospitalequipmenttracker.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EquipmentController {

    @Autowired
    Equipment client;


    @RequestMapping(value = "/equipment", method = RequestMethod.POST)
    public Inventory createEquipment(Inventory inventory) {
        return client.createEquipment(inventory);
    }

    @RequestMapping(value = "/equipment", method = RequestMethod.GET)
    public List<Inventory> getAllEquipment() {
        return client.getAllEquipment();
    }

    @RequestMapping(value = "/equipment/{id}", method = RequestMethod.GET)
    public Inventory getEquipmentById(@PathVariable int id) {
        return client.getEquipment(id);
    }

    @RequestMapping(value = "/equipment/{id}", method = RequestMethod.PUT)
    public void updateEquipment(@PathVariable int id, @RequestBody Inventory inventory) {
        if(inventory.getId() == null) {
            inventory.setId(id);
        }
        if(inventory.getId() != id) {
            throw new IllegalArgumentException("Equipment ID must match parameter given");
        }
        client.updateEquipment(id, inventory);
    }

    @RequestMapping(value = "/equipment/{id}", method = RequestMethod.DELETE)
    public void deleteEquipment(@PathVariable int id) {
        client.deleteEquipment(id);
    }
}
