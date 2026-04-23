package com.oleksii.android_app_005_personal_bucket_list.objects;

public class ActionObject {

    private final String actionName;
    private final int actionImg;
    private final String actionDescription;

    public ActionObject(String actionName, int actionImg, String actionDescription) {
        this.actionName = actionName;
        this.actionImg = actionImg;
        this.actionDescription = actionDescription;
    }

    public String getActionName() {
        return this.actionName;
    }

    public int getActionImg() {
        return this.actionImg;
    }

    public String getActionDescription() {
        return this.actionDescription;
    }
}
