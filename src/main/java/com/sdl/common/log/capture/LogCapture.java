package com.sdl.common.log.capture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Level;

/**
 * Capture logs.
 */
public class LogCapture {
    private static final Logger LOG = LoggerFactory.getLogger(LogCapture.class);

    private LogPatternLevel logPatternLevel;

    /**
     * Capture log for the given pattern with a simple appender.  Note that you must stop a capture
     * after starting it with capture Log using try { ... } finally { logCapture.stop }.
     *
     * @param pattern log pattern to capture
     * @return log capture
     */
    public static LogCapture capture(String pattern) {
        LogCapture logCapture = new LogCapture(pattern);
        return logCapture;
    }

    public LogCapture(String pattern) {
        this.logPatternLevel = new LogPatternLevel(pattern, Level.INFO);
    }

    public LogCapture atLevel(Level level) {
        return this;
    }

    public void stop() {
    }
}
