package structural.abstract_document;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public interface Document {

    Void put(Property key, Object value);

    Object get(Property key);

    <T> Stream<T> getChildrenByMetatype(Property key, Function<Map<Property, Object>, T> constructor);
}
