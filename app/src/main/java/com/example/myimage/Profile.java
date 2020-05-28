package com.example.myimage;

public class Profile {
    private String name;
    private String profilePic;
    private boolean permission;

    public Profile(){

    }

    public Profile(String name, String profilePic, boolean permission) {
        this.name = name;
        this.profilePic = profilePic;
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getPermission() {
        return permission;
    }

    public void setPermission(boolean permission) {
        this.permission = permission;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
}
