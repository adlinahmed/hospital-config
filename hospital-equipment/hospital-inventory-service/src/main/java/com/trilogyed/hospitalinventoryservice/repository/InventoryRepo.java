package com.trilogyed.hospitalinventoryservice.repository;

import com.trilogyed.hospitalinventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Integer> {

    List<Inventory> findByDescription(String description);
}
