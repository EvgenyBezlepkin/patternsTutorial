package structural.proxy;

public class StringResource implements Resource<String>{

    @Override
    public String get(String o) {
        return new String(o);
    }
}
