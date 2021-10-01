package com.vicchern.innovationapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public interface IUser {

      Long getId();

      String getFirstName();

    
      String getLastName();

   
      String getUserName();

      String getPassword();

    
      Date getDateOfBirth();

   
      String getCity();


      String getCountry();

 
      int getUserRole();

  
      int getReviewId();

  
      String getUserEmail();
}
