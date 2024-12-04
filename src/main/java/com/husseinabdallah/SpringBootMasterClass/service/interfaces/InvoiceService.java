package com.husseinabdallah.SpringBootMasterClass.service.interfaces;

import com.husseinabdallah.SpringBootMasterClass.entity.Invoice;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import org.springframework.http.ResponseEntity;

public interface InvoiceService {

    ResponseEntity<ApiResponse<Invoice>> createInvoice(Invoice invoice);

}
