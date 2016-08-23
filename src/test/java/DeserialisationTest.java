/*
 * Copyright (c) 2016, Spiideo
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.junit.Test;

/**
 * @author Raniz
 * @since 2016-08-23.
 */
public class DeserialisationTest {

    private final String json = "{\"s\":\"test\"}";

    @Test
    public void testLombok() throws IOException {
        new ObjectMapper().readValue(json, LombokObject.class);
    }

    @Test
    public void testManual() throws IOException {
        new ObjectMapper().readValue(json, ManualObject.class);
    }
}