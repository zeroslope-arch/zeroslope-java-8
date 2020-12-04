package com.zeroslope.domain.repositories;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.zeroslope.domain.models.SampleModel;
import com.zeroslope.infrastructure.base.BaseRepository;

@Component
@Repository
public class SampleRepository implements BaseRepository<SampleModel> {

    private final Logger logger = LoggerFactory.getLogger(SampleRepository.class);
    private String _connectionString;

    // TODO: Wire up to ORM

    public SampleRepository(String connectionString) {
        _connectionString = connectionString;
    }

    public ArrayList<SampleModel> list() {
        return new ArrayList<SampleModel>();
    }
    
    public SampleModel read(long id) {
        return new SampleModel(id);
    }
    
    public SampleModel create(SampleModel model) {
        return model;
    }
    
    public SampleModel update(SampleModel model) {
        return model;
    }
    
    public void delete(long id) {  }

}