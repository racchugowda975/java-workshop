package com.xworkz.instagram.repository;

import com.xworkz.instagram.things.InstagramUserDetails;

public class InstagramUserRepositoryImplementation implements InstagramUserRepository {
    private InstagramUserDetails[] listOfUsers = new InstagramUserDetails[3];
    private int index = 0;

    @Override
    public void saveUserDetails(InstagramUserDetails details) {
        System.out.println("details:" + details);
        if (this.index < listOfUsers.length) {
            System.out.println("We can save the details");
            listOfUsers[this.index] = details;
            this.index++;
            System.out.println("saved successfully");
        } else {
            System.err.println("Array is full we can't save the data");
        }
    }

    public void readInstagramUsers() {
        System.out.println("Reading Instagram User details!!");
        for (InstagramUserDetails details : listOfUsers) {
            System.out.println("user details:" + details);
        }
    }

    @Override
    public void findUserDetails(String name) {
        System.out.println("find User details method invoked");
        for (int i = 0; i < listOfUsers.length; i++) {
            if (listOfUsers[i].getName().equalsIgnoreCase(name)) {
                System.out.println("User is present");
                System.out.println("details are:" + listOfUsers[i]);
            }
        }
    }

    @Override
    public void findUserDetails(String name, String email) {
        System.out.println("find user details method invoked");
        for (int i = 0; i < listOfUsers.length; i++) {
            if (listOfUsers[i].getName().equalsIgnoreCase(name)
                    && listOfUsers[i].getEmail().equalsIgnoreCase(email)) {
                System.out.println("user is present");
                System.out.println("user details are:" + listOfUsers[i]);
            } else {
                System.out.println("User is not present");
            }
        }
    }
}