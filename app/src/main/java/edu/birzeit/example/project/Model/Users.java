package edu.birzeit.example.project.Model;

import java.util.List;

public class Users {
    private String fullName , email ,password  , type;
    private int id ;
    private List<Tours> toursList ;

    //private enum type {  Admin , guide , client } ;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Users(String fullName, String email, String password , String type) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.type=type;
    }



    @Override
    public String toString() {
        return "Users{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
