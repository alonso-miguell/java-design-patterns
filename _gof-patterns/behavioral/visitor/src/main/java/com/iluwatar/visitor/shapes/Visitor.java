package com.iluwatar.visitor.shapes;

/** we use polymorphism here (method overloading)
 * for declaring all the kind of objects a visitor
 * can visit
 */
public interface Visitor {
  String visit(Dot dot);

  String visit(Circle circle);

  String visit(Rectangle rectangle);

  String visit(CompoundShape cg);
}