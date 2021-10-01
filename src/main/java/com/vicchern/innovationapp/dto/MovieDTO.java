package com.vicchern.innovationapp.dto;

import com.vicchern.innovationapp.entity.IMovie;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class MovieDTO implements IMovie {

    @NotNull
    @Size(max = 256)
    private long id;

    @NotNull
    @Size(max = 256)
    private String title;

    @NotNull
    @Size(max = 256)
    private Date date;

    @NotNull
    @Size(max = 256)
    private String originCountry;
}
