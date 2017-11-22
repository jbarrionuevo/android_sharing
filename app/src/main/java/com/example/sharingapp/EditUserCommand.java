package com.example.sharingapp;

import android.content.Context;

public class EditUserCommand extends Command {
    private UserList user_list;
    private User user;
    private User updated_user;
    private Context context;

    public EditUserCommand(UserList user_list, User user, User updated_user, Context context) {
        this.user_list = user_list;
        this.user = user;
        this.updated_user = updated_user;
        this.context = context;
    }

    @Override
    public void execute() {
        user_list.removeUser(user);
        user_list.addUser(updated_user);
        user_list.saveUsers(context);
    }
}
