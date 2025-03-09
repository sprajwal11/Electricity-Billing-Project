package com.jvvnl.billing_service.controller;


import com.jvvnl.billing_service.entity.Bill;
import com.jvvnl.billing_service.entity.BillStatus;
import com.jvvnl.billing_service.service.BillService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bills")
public class BillController {
    private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    @GetMapping
    public List<Bill> getAllBills() {
        return billService.getAllBills();
    }

    @GetMapping("/user/{userId}")
    public List<Bill> getBillsByUserId(@PathVariable Long userId) {
        return billService.getBillsByUserId(userId);
    }

    @GetMapping("/{id}")
    public Optional<Bill> getBillById(@PathVariable Long id) {
        return billService.getBillById(id);
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        return billService.createBill(bill);
    }

    @PatchMapping("/{id}/status")
    public Bill updateBillStatus(@PathVariable Long id, @RequestParam BillStatus status) {
        return billService.updateBillStatus(id, status);
    }
}
