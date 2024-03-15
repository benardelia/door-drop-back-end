package com.bravetech.doordrop.User;

import com.bravetech.doordrop.models.User;
import com.bravetech.doordrop.models.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class UserRegistrationData {
    private String password;
    private String fullname;
    private String email;
    private String phone;

//  NB:  don't forget to add setter and getter if you want to use this class in @RequestBody annotation
    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    private final User user = new User();
    private final UserDetails userDetails = new UserDetails();
   public User getUserCredentials(){
        user.setPassword(this.password);
        user.setUsername(this.email);

        return user;
    }

    public UserDetails getUserDetails(String id){
        userDetails.setEmail(this.email);
        userDetails.setFullname(this.fullname);
        userDetails.setEmail(this.email);
        userDetails.setPhone(this.phone);
        userDetails.setId(id);

        return userDetails;
    }

    @Override
    public String toString() {
        return "UserRegistrationData{" +
                "password='" + password + '\'' +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", user=" + user +
                ", userDetails=" + userDetails +
                '}';
    }
}
