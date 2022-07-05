package com.BenGarza.capstone.Services;

import com.BenGarza.capstone.Models.Purchase;
import com.BenGarza.capstone.Repository.PurchaseRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import java.util.Optional;

@Service
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;

    public PurchaseService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    public List<Purchase> getPurchases(){
            //  User user = new User( "test@gmail.com", "Ben",  "password");
            // model.addAttribute("stu", user);

            return List.of(
                    new Purchase(
                            2.99,
                            new Date()
                    )
            );
        }


    public void addNewPurchase(Purchase purchase) {
        Optional<Purchase> purchaseOptional = purchaseRepository
                .findPurchaseById(purchase.getId());
        if(purchaseOptional.isPresent()) {
            throw new IllegalStateException("Duplicate purchase");
        }
        purchaseRepository.save(purchase);
    }
}
