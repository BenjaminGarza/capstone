package com.BenGarza.capstone.Repository;

import com.BenGarza.capstone.Models.Purchase;
import com.BenGarza.capstone.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PurchaseRepository
     extends JpaRepository<Purchase, Long> {
    Optional<Purchase> findPurchaseById(Long id);
}
