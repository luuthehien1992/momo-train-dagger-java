/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.daggerjava.communicator;

import dagger.Binds;
import dagger.Module;

/**
 *
 * @author jeremy
 */
@Module
public interface ProductCommunicatorModule {

    @Binds
    ProductCommunicator bindProductCommunicator(ProductApiCommunicator impl);
}
