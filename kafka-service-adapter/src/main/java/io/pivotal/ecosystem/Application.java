package io.pivotal.ecosystem;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {

        if (args[0].equals("generate-manifest")) {
            ManifestGenerator mg = new ManifestGenerator(args);
            System.out.println(mg.generateManifest());
        } else if (args[0].equals("create-binding")) {
            CreateBinding cb = new CreateBinding(args);
            System.out.println(cb.generateBinding());
        } else {
            System.err.println("invalid command: " + args[0]);
        }
    }
}