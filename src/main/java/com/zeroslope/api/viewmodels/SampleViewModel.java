package com.zeroslope.api.viewmodels;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class SampleViewModel {

    @Getter @Setter public Long id;
    @Getter @Setter public String name;
    @Getter @Setter public String description;

    public SampleViewModel(long id) {
        this.id = id;
    }

    public SampleViewModel(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

}

