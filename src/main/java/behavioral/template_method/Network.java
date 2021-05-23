package behavioral.template_method;

public abstract class Network {
    protected String userName;
    protected String password;
    protected String net;

    public static final String Twitter = "Twitter";
    public static final String Facebook = "Facebook";

    // основной метод алгоритма, инкапсулирующий методы
    // которые могут быть переопределены
    public boolean post(String message) {
        if (logIn(this.userName, this.password)) {
            sendData(message);
            logOut(net);
            return true;
        }
        return false;
    }

    // реализация этого метода полностью разная в наследниках, поэтому метод определяется как abstract
    abstract boolean logIn(String userName, String password);

    // общая часть частично отличающихся методов может быть вынесена в класс-родитель
    void sendData(String data) {
        System.out.println("Message: '" + data + "' was posted");
    }

    void logOut(String net) {
        System.out.println("User: '" + userName + "' was logged out from " + net);
    }
}
