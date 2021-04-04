package behavioral.visitor.project;

import behavioral.visitor.additional_logic.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
