package io.pivotal.ecosystem;

import java.io.IOException;

/**
 * Only dummy binding file given so far
 * Todo implement binding to get a generic string to connect to kafka cluster
 */
public class CreateBinding {

    private String[] args;

    CreateBinding(String[] args) {
        super();
        this.args = args;
    }

    String generateBinding() throws IOException {
        if (args.length != 5) {

            System.err.println("Expected 5 arguments, incorrect number of args given");
        }
        String bindingID = args[1];
        String boshVMs = args[2];
        String manifest = args[3];
        String requestParams = args[4];

        return Util.fileToString("example_binding.json");

    }
}
