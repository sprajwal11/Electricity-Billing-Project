package com.jvvnl.billing_service.service;


import com.jvvnl.billing_service.entity.Bill;
import com.jvvnl.billing_service.entity.BillStatus;
import com.jvvnl.billing_service.repository.BillRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillService {
    private final BillRepository billRepository;

    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public List<Bill> getAllBills() {
        return billRepository.findAll();
    }

    @Cacheable(value = "bills", key = "#userId")
    public List<Bill> getBillsByUserId(Long userId) {
        return billRepository.findByUserId(userId);
    }

    public Optional<Bill> getBillById(Long id) {
        return billRepository.findById(id);
    }

    public Bill createBill(Bill bill) {
        return billRepository.save(bill);
    }

    public Bill updateBillStatus(Long id, BillStatus status) {
        Bill bill = billRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bill not found"));
        bill.setStatus(status);
        return billRepository.save(bill);
    }
}
