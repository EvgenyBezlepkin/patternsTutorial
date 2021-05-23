package structural.abstract_document;

import java.util.Map;

public class Part extends AbstractDocument implements HasModel, HasPrice, HasType, HasMetaType {

    public Part(Map<Property, Object> properties) {
        super(properties);
    }
}
