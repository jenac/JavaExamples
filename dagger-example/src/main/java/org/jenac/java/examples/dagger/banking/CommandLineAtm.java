package org.jenac.java.examples.dagger.banking;

import java.util.Scanner;

class CommandLineAtm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandRouterFactory commandRouterFactory =
                DaggerCommandRouterFactory.create();
        CommandRouter commandRouter = commandRouterFactory.router();

        while (scanner.hasNextLine()) {
            commandRouter.route(scanner.nextLine());
        }
    }
}