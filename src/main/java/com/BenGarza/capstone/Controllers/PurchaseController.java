package com.BenGarza.capstone.Controllers;
import com.BenGarza.capstone.Models.Purchase;
import com.BenGarza.capstone.Models.User;
import com.BenGarza.capstone.Services.PurchaseService;
import com.BenGarza.capstone.Services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@Controller
@Slf4j
public class PurchaseController {






        private final PurchaseService purchaseService;

        @Autowired
        public PurchaseController(PurchaseService purchaseService) {
            this.purchaseService = purchaseService;
        }

        @GetMapping("/cart")
        public List<Purchase> getPurchases(Model model){

            log.info("we did it");
            return purchaseService.getPurchases();

    }
    @PostMapping("/cart")
    public void registerNewPurchase(@RequestBody Purchase purchase) {
        purchaseService.addNewPurchase(purchase);
    }


}
