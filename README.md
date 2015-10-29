# log-capture

Log capturing - for testing, logging assertions and silencing noisy expected error logs from unit tests

# Status

This module is work in progress.  I'll remove this message when ready.

# Usage

Capture logs

       LogCapture logCapture = LogCapture.capture("ROOT").atLevel(Level.ERROR);
       try {
           ...
       } finally {
           logCapture.stop();
       }
       assertEquals("Expected Message", logCapture.toList().get(0));

Suppress logs during a try block

       try (LogCapture.capture("ROOT").atLevel(Level.ERROR)) {
           ...
       }
