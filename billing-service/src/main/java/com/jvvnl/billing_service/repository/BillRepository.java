package com.jvvnl.billing_service.repository;

import com.jvvnl.billing_service.entity.Bill;
import com.jvvnl.billing_service.entity.BillStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {
    List<Bill> findByUserId(Long userId);
    List<Bill> findByStatus(BillStatus status);
}
