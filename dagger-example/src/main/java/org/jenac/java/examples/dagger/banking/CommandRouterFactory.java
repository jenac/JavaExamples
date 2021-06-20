package org.jenac.java.examples.dagger.banking;

import dagger.Component;

@Component(modules = { HelloWorldModule.class, SystemOutModule.class })
interface CommandRouterFactory {
    CommandRouter router();
}