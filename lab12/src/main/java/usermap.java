import java.util.ArrayList;
import java.util.List;

public class usermap {
    public List<User> user= new ArrayList<User>();
    usermap(){
        //createUser();
    }
    public void createUser(){
        User u=new User("semhar","1234");
        user.add(u);
        User u1=new User("Issac","5678");
        user.add(u1);
    }
    public boolean getUser(String username,String pass){
        for(User u : user){
            if(u.getUsername().equals(username) && u.getPassword().equals(pass) )return true;
        }
        return false;
    }
}
