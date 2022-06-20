package com.example.beer_cyfrowe_rozliczenie.data;

import com.example.beer_cyfrowe_rozliczenie.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            LoggedInUser fakeUser =
                    new LoggedInUser(
                            java.util.UUID.randomUUID().toString(),
                            "Witaj dzielny pchorze!");
            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Coś poszło nie tak :(", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}