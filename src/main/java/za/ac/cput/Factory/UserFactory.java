package za.ac.cput.Factory;

import za.ac.cput.Domain.User;

public class UserFactory {
    public static User createUser(String userId, String firstName, String lastName) {

        if (userId == null || userId.isEmpty()) return null;
        if (firstName == null || firstName.isEmpty()) return null;
        if (lastName == null || lastName.isEmpty()) return null;


        return new User.Builder()
                .setUserId(userId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
    }
}
