package structural.visitor.additional_logic;

import structural.visitor.project.Circle;
import structural.visitor.project.Dot;
import structural.visitor.project.Rectangle;

public interface Visitor {

    String visit(Dot dot);

    String visit(Circle circle);

    String visit(Rectangle rectangle);

}
