package com.amaap.merchentguide.domain.service;

import com.amaap.merchentguide.domain.model.valueobject.QueryType;
import com.amaap.merchentguide.service.IntergalacticUnitService;
import com.amaap.merchentguide.service.MetalService;
import jakarta.inject.Inject;

public class ProcessorFactory {
    IntergalacticUnitService intergalacticUnitService;
    MetalService metalService;
    @Inject
    public ProcessorFactory(IntergalacticUnitService intergalacticUnitService, MetalService metalService) {
        this.intergalacticUnitService = intergalacticUnitService;
        this.metalService = metalService;
    }

    public QueryProcessor getProcessor(QueryType queryType) {
        if(queryType.equals(QueryType.UNIT_QUERY))
            return new UnitQueryProcessor(intergalacticUnitService);
        else if(queryType.equals(QueryType.METAL_QUERY))
            return new MetalQueryProcessor(metalService,intergalacticUnitService);
        else
            return new InvalidQueryProcessor();
    }
}
