package com.BenGarza.capstone.Services;

import com.BenGarza.capstone.Models.Purchase;
import com.BenGarza.capstone.Models.User;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class PurchaseService {




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
        System.out.println(purchase);
    }
}
