package Class;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class DataList implements Serializable {

    private ArrayList<Profile> profileList;
    private Profile currentProfile;

    public DataList() {
        this.profileList = new ArrayList<Profile>();
    }

    public DataList(Profile currentProfile) {
        this.profileList = new ArrayList<Profile>();
        this.currentProfile = currentProfile;
    }

    public ArrayList<Profile> getProfileList() {
        return profileList;
    }

    public void setProfileList(ArrayList<Profile> profileList) {
        this.profileList = profileList;
    }

    public void updateList(Profile profile) {
        this.profileList.add(profile);
    }


    public Profile getCurrentProfile() {
        return currentProfile;
    }

    public void setCurrentProfile(Profile currentProfile) {
        this.currentProfile = currentProfile;
    }




}
