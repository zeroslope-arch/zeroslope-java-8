package com.zeroslope.domain.services;

import java.util.ArrayList;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeroslope.api.viewmodels.SampleViewModel;
import com.zeroslope.infrastructure.base.BaseRepository;
import com.zeroslope.infrastructure.base.BaseService;
import com.zeroslope.domain.models.SampleModel;

@Service
public class SampleService implements BaseService<SampleViewModel> {

    private final Logger logger = LoggerFactory.getLogger(SampleService.class);

    @Autowired
    private BaseRepository<SampleModel> repo;

    @Autowired
    private ModelMapper modelMapper;

	public ArrayList<SampleViewModel> list() {
        ArrayList<SampleModel> obj = repo.list();
        return modelMapper.map(obj, (new ArrayList<SampleModel>()).getClass());
    }
    
    public SampleViewModel read(long id) {
        SampleModel obj = repo.read(id);
        return modelMapper.map(obj, SampleViewModel.class);
    }
    
    public SampleViewModel save(SampleViewModel model) {
        SampleModel entity = modelMapper.map(model, SampleModel.class);
        if (model.id > 0) {
            SampleModel obj = repo.update(entity);
            return modelMapper.map(obj, SampleViewModel.class);
        } else {
            SampleModel obj = repo.create(entity);
            return modelMapper.map(obj, SampleViewModel.class);
        }
    }
    
    public void delete(long id) {
	    repo.delete(id);
    }
    
    public void delete(SampleViewModel model) {
	    repo.delete(model.id);
    }

}
