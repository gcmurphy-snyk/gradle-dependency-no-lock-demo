package com.example.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoreService {
    private static final Logger logger = LoggerFactory.getLogger(CoreService.class);
    private final ObjectMapper objectMapper;

    public CoreService() {
        this.objectMapper = new ObjectMapper();
        logger.info("CoreService initialized");
    }

    public String serialize(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (Exception e) {
            logger.error("Serialization failed", e);
            return null;
        }
    }
}