package com.vicchern.innovationapp.dto;

import com.sun.istack.NotNull;
import com.vicchern.innovationapp.entity.IUser;

import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

public class UserDTO implements IUser {

    @NotNull
    @Size(max = 256)
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
    private Date dateOfBirth;

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
    private String userEmail;

    public UserDTO() {
    }

    public UserDTO(Long id, String firstName, String lastName, String userName, String password, Date dateOfBirth, String city, String country, int userRole, int reviewId, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.country = country;
        this.userRole = userRole;
        this.reviewId = reviewId;
        this.userEmail = email;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", userRole=" + userRole +
                ", reviewId=" + reviewId +
                ", email='" + userEmail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return userRole == userDTO.userRole && reviewId == userDTO.reviewId && Objects.equals(id, userDTO.id) && Objects.equals(firstName, userDTO.firstName) && Objects.equals(lastName, userDTO.lastName) && Objects.equals(userName, userDTO.userName) && Objects.equals(password, userDTO.password) && Objects.equals(dateOfBirth, userDTO.dateOfBirth) && Objects.equals(city, userDTO.city) && Objects.equals(country, userDTO.country) && Objects.equals(userEmail, userDTO.userEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, userName, password, dateOfBirth, city, country, userRole, reviewId, userEmail);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
