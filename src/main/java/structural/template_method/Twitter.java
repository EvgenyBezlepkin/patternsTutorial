package structural.template_method;

public class Twitter extends Network {

    public Twitter(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.net = Network.Twitter;
    }

    public boolean logIn(String userName, String password) {
        System.out.println("Twitter  welcomes " + userName);
        System.out.println("LogIn success on Twitter");
        return true;
    }

    // переопределяет метод абстрактного класса
    public void sendData(String data) {
        System.out.println("Message: '" + data + "' was posted on Twitter");
    }

}
