package org.jenac.java.examples.dagger;

import dagger.Module;
import dagger.Provides;
import org.jenac.java.examples.dagger.models.Brand;
import org.jenac.java.examples.dagger.models.Engine;

import javax.inject.Singleton;

@Module
public class VehiclesModule {
    @Provides
    public Engine provideEngine() {
        return new Engine();
    }

    @Provides
    @Singleton
    public Brand provideBrand() {
        return new Brand("JenAc");
    }
}
