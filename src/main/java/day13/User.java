package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscription;

    User (String username){
        this.username=username;
        subscription=new ArrayList<>();
    }

    public String getUserName(){
        return this.username;
    }

    public List<User> getSubscription(){
        return subscription;
    }

    public void subscribe (User user){
        this.subscription.add(user);
    }

    public boolean isSubscribed (User user){
        boolean xxx = false;
        for (User user1 : subscription){
            if (user1.equals(user)) xxx= true;
        }
        return xxx;
    }

    public boolean isFriend (User userFriend){
        boolean xxx=false;
        if (userFriend.isSubscribed(this)&&(this.isFriend(userFriend))){
            xxx = true;
        }
        return xxx;
    }

    public void sendMassage (User user, String text){
        MessageDataBase.addNewMessage(this, user, text);
    }

    public String toString(){
        return "Пользователь " +username;
    }


}
