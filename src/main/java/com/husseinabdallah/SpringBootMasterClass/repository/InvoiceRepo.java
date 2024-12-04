package com.husseinabdallah.SpringBootMasterClass.repository;

import com.husseinabdallah.SpringBootMasterClass.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepo extends JpaRepository<Invoice, Long> {
}
