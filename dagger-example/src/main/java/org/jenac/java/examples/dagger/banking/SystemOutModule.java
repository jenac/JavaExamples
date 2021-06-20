package org.jenac.java.examples.dagger.banking;

import dagger.Module;
import dagger.Provides;

@Module
abstract class SystemOutModule {

    @Provides
    static Outputter textOutputter() {
        return System.out::println;
    }
}
