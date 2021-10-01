package com.vicchern.innovationapp.dto;

import com.vicchern.innovationapp.entity.IReview;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class ReviewDTO implements IReview {

    @NotNull
    @Size(max = 256)
    private long id;

    @NotNull
    @Size(max = 256)
    private String title;

    @Size(max = 512)
    private String comment;

    @NotNull
    @Size(max = 256)
    private java.util.Date Date;

    @NotNull
    @Size(max = 256)
    private long movieId;

    @NotNull
    @Size(max = 256)
    private long userId;
}
