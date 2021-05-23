package structural.abstract_document;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class AbstractDocument implements Document {

    // хранилище
    private final Map<Property, Object> properties;

    protected AbstractDocument(Map<Property, Object> properties) {
        Objects.requireNonNull(properties, "properties map is required");
        this.properties = properties;
    }

    @Override
    public Void put(Property key, Object value) {
        properties.put(key, value);
        return null;
    }

    @Override
    public Object get(Property key) {
        return properties.getOrDefault(key, "Nothing");
    }

    @Override
    public <T> Stream<T> getChildrenByMetatype(Property key, Function<Map<Property, Object>, T> constructor) {
        return Stream.ofNullable(get(key))
                .filter(Objects::nonNull)
                .map(el -> (List<Map<Property, Object>>) el)
                .flatMap(Collection::stream)
                .filter(x -> x.get(Property.METATYPE) == key)
                .map(constructor);
    }
}
