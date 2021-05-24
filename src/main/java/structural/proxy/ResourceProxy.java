package structural.proxy;

public class ResourceProxy implements Resource<String> {

    private int enterCount = 0;
    private final Resource<String> resource;

    public ResourceProxy(Resource<String> resource) {
        this.resource = resource;
    }

    public String get(String s) {
        if (++enterCount > 5) {
            throw new RuntimeException("Resource is overloaded");
        }
        return resource.get(s);
    }

}
