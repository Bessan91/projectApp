package edu.birzeit.example.project.Model;

import java.util.List;

public class UsersData implements IUsersData {
    private List<Users> AllUsers ;

    @Override
    public List<String> getUsers(){
        return null; 
    }

    @Override
    public List<Users> getUsersByType(){
        return null;
    };

}
