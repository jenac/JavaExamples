package org.jenac.java.examples.dagger.banking;

import dagger.Component;

@Component
interface CommandRouterFactory {
    CommandRouter router();
}