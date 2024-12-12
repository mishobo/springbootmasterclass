package com.husseinabdallah.SpringBootMasterClass.controller;

import com.husseinabdallah.SpringBootMasterClass.entity.Invoice;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import com.husseinabdallah.SpringBootMasterClass.service.interfaces.InvoiceService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/invoice")
public class InvoiceController {

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @PostMapping(value = "/create-invoice", consumes = "application/json", produces = "application/json")
    public ResponseEntity<ApiResponse<Invoice>> createInvoice(@RequestBody @Valid Invoice invoice) {
        return invoiceService.createInvoice(invoice);
    }


    @GetMapping(value = "/get-invoice", produces = "application/json")
    public ResponseEntity<ApiResponse<Invoice>> getInvoice(@RequestParam Long invoiceId) {
        return invoiceService.getInvoice(invoiceId);
    }

}
