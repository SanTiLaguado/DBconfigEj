package com.apirestj3.apirest.domain.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detail_products")
public class DetailProduct {

    @EmbeddedId
    ProductInvoicePk id;

    private Integer quality;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "id_invoice", insertable = false, updatable = false)
    private Invoice invoice;

    @ManyToOne
    @JoinColumn(name = "id_product", insertable = false, updatable = false)
    private Product product;

    public ProductInvoicePk getId() {
        return id;
    }

    public void setId(ProductInvoicePk id) {
        this.id = id;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    

}
