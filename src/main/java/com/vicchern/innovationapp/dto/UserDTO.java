package com.vicchern.innovationapp.dto;

import com.sun.istack.NotNull;
import javax.validation.constraints.Size;

public class UserDTO {
    private Long id;

    @NotNull
    @Size(max = 256)
    private String firstName;

    @NotNull
    @Size(max = 256)
    private String lastName;

    @NotNull
    @Size(max = 256)
    private String userName;

    @NotNull
    @Size(max = 256)
    private String password;

    @NotNull
    @Size(max = 256)
    private String dateOfBirth;

    @Size(max = 256)
    private String city;

    @NotNull
    @Size(max = 256)
    private String country;

    @NotNull
    private int userRole;

    @Size(max = 256)
    private int reviewId;

    @NotNull
    @Size(max = 256)
    private String email;
}
