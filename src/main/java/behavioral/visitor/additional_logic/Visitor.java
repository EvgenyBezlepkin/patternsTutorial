package behavioral.visitor.additional_logic;

import behavioral.visitor.project.Circle;
import behavioral.visitor.project.Dot;
import behavioral.visitor.project.Rectangle;

public interface Visitor {

    String visit(Dot dot);

    String visit(Circle circle);

    String visit(Rectangle rectangle);

}
