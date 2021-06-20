package org.jenac.java.examples.dagger.banking;

import dagger.Binds;
import dagger.Module;

@Module
abstract class HelloWorldModule {
    @Binds
    abstract Command helloworldCommand(HelloWorldCommand command);
}
