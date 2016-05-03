package models;

/**
 * Created by Wenlu on 4/16/16.
 */
public interface Identity  {

    void setAvatar(String avatar);

    void setUserName(String name);

    void setPassword(String password);

    void setEmail(String email);

    void setPriviledge( String priviledge );

    public long getId();

    void doSthSpecial();
}
