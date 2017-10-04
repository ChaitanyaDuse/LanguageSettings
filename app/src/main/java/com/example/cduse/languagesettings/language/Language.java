package com.example.cduse.languagesettings.language;

/**
 * Created by cduse on 10/3/2017.
 */

public class Language {
    private int _id;
    private String code;
    private String displayName;
    private boolean isAppDefault;
    private boolean isUserDefault;

    public Language(int id, String code, String displayName, boolean isAppDefault, boolean isUserDefault) {
        _id = id;
        this.code = code;
        this.displayName = displayName;
        this.isAppDefault = isAppDefault;
        this.isUserDefault = isUserDefault;
    }


    public boolean isUserDefault() {
        return isUserDefault;
    }

    public void setUserDefault(boolean userDefault) {
        isUserDefault = userDefault;
    }

    public boolean isAppDefault() {
        return isAppDefault;
    }

    public void setAppDefault(boolean appDefault) {
        isAppDefault = appDefault;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }
}
