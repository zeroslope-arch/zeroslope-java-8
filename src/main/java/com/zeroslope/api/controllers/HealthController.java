package com.zeroslope.api.controllers;

import com.zeroslope.api.viewmodels.SampleViewModel;
import com.zeroslope.infrastructure.base.BaseService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class HealthController {

    private final Logger logger = LoggerFactory.getLogger(HealthController.class);

    @Autowired
    private BaseService<SampleViewModel> _service;

    @GetMapping("/health")
    @ApiOperation(value = "API Health Check", notes = "returns 200 if the api is available.")
    public String Get() {
        return "{}";
    }
    
}
