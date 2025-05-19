package com.xworkz.instagram.runner;

import com.xworkz.instagram.repository.InstagramUserRepository;
import com.xworkz.instagram.repository.InstagramUserRepositoryImplementation;
import com.xworkz.instagram.things.InstagramUserDetails;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstagramRunner {
    public static void main(String[] args) {
        InstagramUserDetails instagramUserDetails = new InstagramUserDetails();
        instagramUserDetails.setName("Rachana");
        instagramUserDetails.setEmail("Rachana@gmail.com");
        instagramUserDetails.setDateOfBirth(LocalDate.of(9999, 06, 15));
        instagramUserDetails.setCreatedOn(LocalDateTime.now());
        System.out.println(instagramUserDetails.toString());
        System.out.println("Welcome to Instagram!!!!");
        InstagramUserDetails user1 = new InstagramUserDetails();
        user1.setName("rekha");
        user1.setEmail("rekha@gmail.com");
        user1.setDateOfBirth(LocalDate.of(9999, 06, 15));
        user1.setCreatedOn(LocalDateTime.now());
        System.out.println(user1.toString());

        InstagramUserDetails user2 = new InstagramUserDetails();
        user2.setName("pooja");
        user2.setEmail("pooja@gmail.com");
        user2.setDateOfBirth(LocalDate.of(9999, 06, 15));
        user2.setCreatedOn(LocalDateTime.now());
        System.out.println(user2.toString());

        InstagramUserRepository repo = new InstagramUserRepositoryImplementation();
        repo.saveUserDetails(instagramUserDetails);
        repo.saveUserDetails(user1);
        repo.saveUserDetails(user2);
        repo.readInstagramUsers();
        repo.findUserDetails("rachana");
    }
}

