package com.amaap.merchentguide.service;

import com.amaap.merchentguide.domain.service.exception.InvalidRomanValueException;

public interface QueryProcessor {
    String processQuery(String queryContent) throws InvalidRomanValueException;
}
