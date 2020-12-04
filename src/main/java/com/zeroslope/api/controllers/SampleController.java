package com.zeroslope.api.controllers;

import java.util.ArrayList;
import com.zeroslope.api.viewmodels.SampleViewModel;
import com.zeroslope.infrastructure.base.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;

@RestController
public class SampleController {

    private final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    private BaseService<SampleViewModel> _service;

    @GetMapping("/sample")
    @ApiOperation(value = "List SampleViewModels",
            notes = "Reads all objects and eventually will allow you to filter on property")
    public ArrayList<SampleViewModel> list() {
        logger.info("TESTING THE LOGGER");
        return _service.list();
    }

    @GetMapping("/sample/{id}")
    @ApiOperation(value = "Read SampleViewModels",
            notes = "Reads a single object by the Id property")
    public SampleViewModel get(@PathVariable int id) {
        return _service.read(id);
    }

    @PutMapping("/sample")
    @ApiOperation(value = "Update SampleViewModels",
            notes = "Saves a single object. Uses the Id property to determine if its an update or create.")
    public SampleViewModel create(@RequestBody SampleViewModel model) {
        return _service.save(model);
    }

    @PostMapping("/sample")
    @ApiOperation(value = "Create SampleViewModels",
            notes = "Saves a single object. Uses the Id property to determine if its an update or create.")
    public SampleViewModel post(@RequestBody SampleViewModel model) {
        return _service.save(model);
    }

    @DeleteMapping("/sample/{id}")
    @ApiOperation(value = "Read SampleViewModels",
            notes = "Reads a single object by the Id property")
    public void delete(@PathVariable int id) {
        _service.delete(id);
    }
    
}
