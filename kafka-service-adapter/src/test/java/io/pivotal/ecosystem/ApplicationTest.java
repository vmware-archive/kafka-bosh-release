package io.pivotal.ecosystem;

import org.apache.commons.lang.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void testManifest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String[] s = new String[]{"generate-manifest", "1", "2", "3", "4", "5"};
        Application.main(s);
        String ret = StringUtils.chomp(outContent.toString());
        assertEquals(Util.fileToString("example_manifest.yml"), ret);
    }

    @Test
    public void testBinding() throws IOException {
        String[] s = new String[]{"create-binding", "1", "2", "3", "4"};
        Application.main(s);
        String ret = StringUtils.chomp(outContent.toString());
        assertEquals(Util.fileToString("example_binding.json"), ret);

    }
}