package structural.abstract_document;

import java.util.Optional;
import java.util.stream.Stream;


interface HasType extends Document {

    default Optional<String> getType() {
        return Optional.ofNullable((String) get(Property.TYPE));
    }
}

interface HasPrice extends Document {

    default Optional<Number> getPrice() {
        return Optional.ofNullable((Number) get(Property.PRICE));
    }
}
interface HasModel extends Document {

    default Optional<String> getModel() {
        return Optional.ofNullable((String) get(Property.MODEL));
    }
}

interface HasParts extends Document {

    default Stream<Part> getParts() {
        return getChildrenByMetatype(Property.PARTS, Part::new);
    }
}

interface HasDescription extends Document {

    default Stream<Description> getDescription() {
        return getChildrenByMetatype(Property.DESCRIPTION, Description::new);
    }
}

interface HasMetaType extends Document {

    default Optional<Property> getMetaType() {
        return Optional.ofNullable((Property) get(Property.METATYPE));
    }
}

interface HasLabel extends Document {

    default Optional<String> getLabel() {
        return Optional.ofNullable((String) get(Property.LABEL));
    }
}

interface HasValue extends Document {

    default Optional<String> getValue() {
        return Optional.ofNullable((String) get(Property.VALUE));
    }
}