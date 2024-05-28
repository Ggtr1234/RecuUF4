package pt1_1.ex4;

import java.util.ArrayList;
import java.util.List;

public class SchoolDataBase {
    private List<UserSchool> usersSchool = new ArrayList<>();

    public List<UserSchool> getUsersSchool() {
        return usersSchool;
    }

    public void setUsersSchool(List<UserSchool> usersSchool) {
        this.usersSchool = usersSchool;
    }
    public void userAdd(UserSchool user){
        usersSchool.add(user);
    }
    public void getUser(String name){
        for (UserSchool user : usersSchool){
            if (user.getName().equals(name)){
                System.out.println(user);
            }
        }
    }
    public List<UserSchool> getUsers(){
        return usersSchool;
    }
    public void showUsers(){
        for (UserSchool user : usersSchool){
            System.out.println(user);
        }
    }
}
