package com.schooler.core.util;

import org.springframework.stereotype.Service;

@Service
public class CommonUtil {
    public String formatMessage(String message) {
        return "You dit it: " + message;
    }
}
