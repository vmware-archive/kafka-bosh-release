package io.pivotal.ecosystem;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * Used across manifest gen and create binding
 */
public class Util {

    public static String fileToString(String fileName) throws IOException {
        InputStream in = new Util().getClass().getClassLoader()
                .getResourceAsStream(fileName);
        return IOUtils.toString(in, "UTF-8");
    }
}