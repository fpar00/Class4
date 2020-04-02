package com.company;

public class User {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private Boolean UserAccount;


    public User(String firstName, String lastName, String email, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        UserAccount = true;
    }

    public void newAccountGuest(String firstName, String lastName, String password){
        if(UserAccount==false){
            this.firstName = firstName;
            this.lastName = lastName;
            this.password = password;
            UserAccount = true;
        } else {
            System.out.println("Error. Account information alredy exists.");
        }
    }

    public User(String email){
        this.email = email;
        UserAccount = false;
    }


    public String getName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getUserAccount() {
        return UserAccount;
    }
}