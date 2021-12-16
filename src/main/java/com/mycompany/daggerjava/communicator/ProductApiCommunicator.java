/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.daggerjava.communicator;

import com.mycompany.daggerjava.pojos.Product;
import javax.inject.Inject;
import lombok.Data;

/**
 *
 * @author jeremy
 */
@Data
public class ProductApiCommunicator implements ProductCommunicator {

    private String url;

    @Inject
    public ProductApiCommunicator(String url) {
        this.url = url;
    }

    @Override
    public Product getProduct() {
        return new Product();
    }

}
