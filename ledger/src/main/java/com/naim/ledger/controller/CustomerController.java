package com.naim.ledger.controller;

import com.naim.ledger.repo.CustomerRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerRepository customerRepository;

    @GetMapping("/customers")
    public String customers(Model model) {

        model.addAttribute(
                "customers",
                customerRepository.findAll()
        );

        return "customer/list";
    }
}