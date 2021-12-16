/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.daggerjava.services;

import com.mycompany.daggerjava.communicator.ProductCommunicator;
import com.mycompany.daggerjava.pojos.Product;
import javax.inject.Inject;
import lombok.Data;

/**
 *
 * @author jeremy
 */
@Data
public class ProductServiceImpl implements ProductService {

    private ProductCommunicator communicator;

    @Inject
    public ProductServiceImpl(ProductCommunicator communicator) {
        this.communicator = communicator;
    }

    @Override
    public Product getProduct() {
        return communicator.getProduct();
    }

}
