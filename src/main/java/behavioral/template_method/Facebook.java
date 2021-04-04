package behavioral.template_method;

public class Facebook extends Network {

    public Facebook(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.net = Network.Facebook;
    }

    public boolean logIn(String userName, String password) {
        System.out.println(userName + "hi from Facebook");
        return true;
    }
}
