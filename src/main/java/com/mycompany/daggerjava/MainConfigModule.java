/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.daggerjava;

import dagger.Provides;
import dagger.Module;

/**
 *
 * @author jeremy
 */
@Module
public class MainConfigModule {

    @Provides
    public String provideUrl() {
        return "URL";
    }
}
