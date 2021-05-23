package structural.abstract_document;

import java.util.Map;

public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts, HasDescription {

    public Car(Map<Property, Object> properties) {
        super(properties);
    }
}
