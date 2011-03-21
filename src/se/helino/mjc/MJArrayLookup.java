package se.helino.mjc;

public class MJArrayLookup extends MJBinaryExpression implements Acceptable {
    
    public MJArrayLookup(MJExpression left, MJExpression right) {
        super(left, right);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}