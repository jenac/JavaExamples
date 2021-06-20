package org.jenac.java.examples.dagger.banking;

import javax.inject.Inject;
import java.util.List;

final class HelloWorldCommand implements Command {

    private  final  Outputter outputter;
    @Inject
    HelloWorldCommand(Outputter outputter) {
        this.outputter = outputter;
    }

    @Override
    public String key() {
        return "hello";
    }

    @Override
    public Status handleInput(List<String> input) {
        if (!input.isEmpty()) {
            return Status.INVALID;
        }
        outputter.output("world!");
        return Status.HANDLED;
    }
}