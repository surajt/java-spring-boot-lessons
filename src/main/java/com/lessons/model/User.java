package com.lessons.model;

public class User {
    private int userID;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private Boolean isAdmin;

    public User(int userID, String firstName, String lastName, String email, String mobile, Boolean isAdmin) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.isAdmin = isAdmin;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return String.format("%d\t%s %s\t%s\t%s  Is Admin : %s",
                userID, firstName, lastName, email, mobile, isAdmin ? "Yes" : "No");
    }
}
