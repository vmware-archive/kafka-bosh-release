package io.pivotal.ecosystem;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ManifestGenerator {

    private String[] args;

    ManifestGenerator(String[] args) {
        super();
        this.args = args;
    }

    String generateManifest() throws IOException {
        if (args.length != 6) {
            System.err.println("Expected 6 arguments, incorrect number of args given");
        }

        String serviceDeployment = args[1];
        String plan = args[2];
        String requestParams = args[3];
        String previousManifest = args[4];
        String previousPlan = args[5];

        return Util.fileToString("example_manifest.yml");
    }
}