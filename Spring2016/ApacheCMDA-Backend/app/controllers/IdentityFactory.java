package controllers;

import models.Administrator;
import models.Guest;
import models.Identity;
import models.User;

/**
 * Created by Wenlu on 4/16/16.
 */
public class IdentityFactory {
    public Identity getIdentity (String type ){
        if(type.equals("User"))
            return new User() ;
        else if(type.equals("Administator")) // return new Administrator()
            return new Administrator();
        else if (type.equals("Guest")) // return new Guest()
            return new Guest();
        else
            return null;
    }
}
