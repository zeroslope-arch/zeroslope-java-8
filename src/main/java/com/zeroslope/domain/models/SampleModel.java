package com.zeroslope.domain.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class SampleModel implements Serializable {

    @Id
    @Getter @Setter private Long id;

    @NotBlank
    @Size(min = 3, max = 500)
    @Getter @Setter private String name;

    @Column(columnDefinition = "text")
    @Getter @Setter private String description;

    @CreatedDate
    @Getter @Setter private Date createdDate;

    @LastModifiedDate
    @Getter @Setter private Date updatedDate;

    public SampleModel(long id) {
        this.id = id;
    }

    public SampleModel(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}

