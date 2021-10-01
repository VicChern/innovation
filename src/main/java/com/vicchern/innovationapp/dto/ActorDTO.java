package com.vicchern.innovationapp.dto;

import com.vicchern.innovationapp.entity.IActor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

public class ActorDTO implements IActor {

    @NotNull
    @Size(max = 256)
    private long id;

    @NotNull
    @Size(max = 256)
    private String firstName;

    @NotNull
    @Size(max = 256)
    private String lastName;

    public ActorDTO() {
    }

    public ActorDTO(long id, String firstName, String lastName, long movieId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.movieId = movieId;
    }

    @Override
    public String toString() {
        return "ActorDTO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", movieId=" + movieId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActorDTO actorDTO = (ActorDTO) o;
        return id == actorDTO.id && movieId == actorDTO.movieId && Objects.equals(firstName, actorDTO.firstName) && Objects.equals(lastName, actorDTO.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, movieId);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    @Size(max = 256)
    private long movieId;

}
