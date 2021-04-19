package com.trilogyed.hospitalequipmenttracker.feign;

import com.trilogyed.hospitalequipmenttracker.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "hospital-inventory-service")
public interface Equipment {

    @RequestMapping(value = "/inventory", method = RequestMethod.POST)
    public Inventory createEquipment(Inventory inventory);

    @RequestMapping(value = "/inventory/{id}", method = RequestMethod.GET)
    public Inventory getEquipment(@PathVariable int id);


    @RequestMapping(value = "/inventory", method = RequestMethod.GET)
    public List<Inventory> getAllEquipment();


    @RequestMapping(value = "/inventory/{id}", method = RequestMethod.PUT)
    public void updateEquipment(@PathVariable int id, @RequestBody Inventory inventory);

    @RequestMapping(value = "/inventory/{id}", method = RequestMethod.DELETE)
    public void deleteEquipment(@PathVariable int id);

    @RequestMapping(value = "/inventory/description/{description}", method = RequestMethod.GET)
    public List<Inventory> findByDescription(@PathVariable String description);

}