package com.amaap.merchentguide.service;

import com.amaap.merchentguide.domain.model.entity.Metal;
import com.amaap.merchentguide.domain.model.entity.exception.InvalidMetalDataException;
import com.amaap.merchentguide.repository.MetalRepository;
import com.amaap.merchentguide.repository.db.impl.exception.MetalAlreadyExistException;
import jakarta.inject.Inject;

public class MetalService {
    MetalRepository metalRepository;
    @Inject
    public MetalService(MetalRepository metalRepository) {
        this.metalRepository = metalRepository;
    }

    public Metal create(String name, double credits) throws MetalAlreadyExistException, InvalidMetalDataException {
        return metalRepository.add(name,credits);
    }

    public Metal getMetal(String name) {
        return metalRepository.selectFromMetalTable(name);
    }
}
