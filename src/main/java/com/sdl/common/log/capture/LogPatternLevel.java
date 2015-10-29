package com.sdl.common.log.capture;

import java.util.logging.Level;

/**
 * Log pattern and level pair.
 */
public class LogPatternLevel {
    private String pattern;
    private Level level;

    public LogPatternLevel(String pattern, Level level) {
        this.pattern = pattern;
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public String toString() {
        return pattern + "@" + level;
    }
}
