/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.daggerjava;

import com.mycompany.daggerjava.communicator.ProductCommunicatorModule;
import com.mycompany.daggerjava.services.ProductService;
import com.mycompany.daggerjava.services.ProductServiceModule;

import dagger.Component;

/**
 *
 * @author jeremy
 */
@Component(modules = {
    ProductServiceModule.class,
    ProductCommunicatorModule.class,
    MainConfigModule.class
})
public interface MainCompoment {

    ProductService getProductService();
}
