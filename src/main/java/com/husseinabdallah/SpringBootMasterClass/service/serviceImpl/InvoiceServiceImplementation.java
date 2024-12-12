package com.husseinabdallah.SpringBootMasterClass.service.serviceImpl;

import com.husseinabdallah.SpringBootMasterClass.entity.Invoice;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import com.husseinabdallah.SpringBootMasterClass.repository.InvoiceRepo;
import com.husseinabdallah.SpringBootMasterClass.service.interfaces.InvoiceService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImplementation implements InvoiceService {

    private final InvoiceRepo invoiceRepo;

    public InvoiceServiceImplementation(InvoiceRepo invoiceRepo) {
        this.invoiceRepo = invoiceRepo;
    }

    @Override
    public ResponseEntity<ApiResponse<Invoice>> createInvoice(Invoice invoice) {
        var savedInvoice = invoiceRepo.save(invoice);

        ApiResponse<Invoice> response = new ApiResponse<>(
                true,
                "data saved successfully",
                savedInvoice,
                null
        );

        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<ApiResponse<Invoice>> getInvoice(Long invoiceId) {
        var invoice = invoiceRepo.findById(invoiceId).orElse(null);

        ApiResponse<Invoice> response = new ApiResponse<>(
                true,
                "data fetched successfully",
                invoice,
                null
        );

        return ResponseEntity.ok(response);
    }
}
