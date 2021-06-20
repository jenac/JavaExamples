package org.jenac.java.examples.dagger;

import dagger.Component;
import org.jenac.java.examples.dagger.models.Car;

import javax.inject.Singleton;

@Singleton
@Component(modules = VehiclesModule.class)
public interface VehiclesComponent {
    Car buildCar();
}
