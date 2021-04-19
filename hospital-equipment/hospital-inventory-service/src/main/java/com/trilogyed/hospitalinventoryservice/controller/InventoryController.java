package com.trilogyed.hospitalinventoryservice.controller;

import com.trilogyed.hospitalinventoryservice.model.Inventory;
import com.trilogyed.hospitalinventoryservice.repository.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class InventoryController {

    @Autowired
    InventoryRepo repo;

    @RequestMapping(value = "/inventory", method = RequestMethod.POST)
    public Inventory createEquipment(Inventory inventory) {
        return repo.save(inventory);
    }

    @RequestMapping(value = "/inventory/{id}", method = RequestMethod.GET)
    public Inventory getEquipment(@PathVariable int id) {
        Optional<Inventory> inventory = repo.findById(id);
        return inventory.get();
    }

    @RequestMapping(value = "/inventory", method = RequestMethod.GET)
    public List<Inventory> getAllEquipment() {
        return repo.findAll();
    }

    @RequestMapping(value = "/inventory/{id}", method = RequestMethod.PUT)
    public void updateEquipment(@PathVariable int id, @RequestBody Inventory inventory) {
        repo.save(inventory);
    }

    @RequestMapping(value = "/inventory/{id}", method = RequestMethod.DELETE)
    public void deleteEquipment(@PathVariable int id) {
        repo.deleteById(id);
    }

    @RequestMapping(value = "/inventory/description/{description}", method = RequestMethod.GET)
    public List<Inventory> findByDescription(@PathVariable String description) {
        return repo.findByDescription(description);
    }
}
