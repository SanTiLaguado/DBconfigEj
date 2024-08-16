package com.apirestj3.apirest.domain.entities;

import java.io.Serializable;

import jakarta.persistence.Column;

public class ProductInvoicePk implements Serializable{

    @Column(name ="id_product")
    private Long idproduct;

    @Column(name ="id_invoice")
    private Long idinvoice;

    public ProductInvoicePk() {
    }

    public Long getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(Long idproduct) {
        this.idproduct = idproduct;
    }

    public Long getIdinvoice() {
        return idinvoice;
    }

    public void setIdinvoice(Long idinvoice) {
        this.idinvoice = idinvoice;
    }

    

}
