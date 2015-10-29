package com.sdl.common.log.capture;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Level;

/**
 * Log capture test.
 */
public class LogCaptureTest {
    /*
     * Note that com.sdl.common.log.capture log patterns are ignored by log capture, so we need
     * to have a special pattern here outside of com.sdl.common.log.capture package which is not
     * ignored.
     */
    private static final Logger LOG = LoggerFactory.getLogger("com.sdl.common.log.capture.test-log-capture");

    @Test
    public void testAtLevel() {
        LogCapture capture = LogCapture.capture("root").atLevel(Level.INFO);
        try {
            LOG.info("Test message that should be captured");
        } finally {
            capture.stop();
        }

        //List<String> messages = capture.toList();
        //assertEquals("No message was log captured", 1, messages.size());
        //assertEquals("[INFO] Test message that should be captured", messages.get(0));

    }
}
