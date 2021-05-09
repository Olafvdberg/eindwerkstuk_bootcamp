package com.novi.eindwerkstuk.security;

public enum ApplicationUserPermission {
    ACTION_READ("action:read"),
    ACTION_WRITE("action:write"),
    APK_READ("apk:read"),
    APK_WRITE("apk:write"),
    BON_READ("bon:read"),
    BON_WRITE("bon:write"),
    CUSTOMER_READ("customer:read"),
    CUSTOMER_WRITE("customer:write"),
    MECHANIC_READ("mechanic:read"),
    MECHANIC_WRITE("mechanic:write"),
    PART_READ("part:read"),
    PART_WRITE("part:write"),
    REPERATION_READ("reperation:read"),
    REPERATION_WRITE("reperation:write"),
    STOCK_READ("stock:read"),
    STOCK_WRITE("stock:write"),
    CAR_READ("car:read"),
    CAR_WRITE("car:write");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
