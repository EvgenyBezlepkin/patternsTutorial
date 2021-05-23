package structural.abstract_document;

import java.util.Map;

public class Description extends AbstractDocument implements HasMetaType, HasValue, HasLabel, HasParts {

    public Description(Map<Property, Object> properties) {
        super(properties);
    }
}
