package se.helino.mjc.parser;

public class MJAnd extends MJBinaryExpression {

    public MJAnd(MJExpression left, MJExpression right) {
        super(left, right);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public MJType accept(TypeVisitor v) {
        return v.visit(this);
    }

    public int accept(IntVisitor v) {
        return v.visit(this);
    }
}
