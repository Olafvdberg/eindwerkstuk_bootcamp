package com.novi.eindwerkstuk.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.novi.eindwerkstuk.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    ADMIN(Sets.newHashSet(ACTION_READ, ACTION_WRITE, APK_READ, APK_WRITE, BON_WRITE, BON_READ, CAR_WRITE, CAR_READ, CUSTOMER_WRITE, CUSTOMER_READ, MECHANIC_WRITE, MECHANIC_READ, PART_READ, PART_WRITE, REPERATION_READ, REPERATION_WRITE, STOCK_READ, STOCK_WRITE)),
    ADMINISTRATIVEASSISTANT(Sets.newHashSet(CAR_READ, CAR_WRITE, CUSTOMER_WRITE, CUSTOMER_READ, REPERATION_READ, REPERATION_WRITE)),
    MECHANIC(Sets.newHashSet(CAR_WRITE, CAR_READ, CUSTOMER_READ, CUSTOMER_WRITE, APK_WRITE, APK_READ, PART_WRITE, PART_READ, REPERATION_WRITE, REPERATION_READ, ACTION_WRITE, ACTION_READ)),
    CASHIER(Sets.newHashSet(BON_READ, BON_WRITE)),
    BACKOFFICEASSISTANT(Sets.newHashSet(STOCK_WRITE, STOCK_READ));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
