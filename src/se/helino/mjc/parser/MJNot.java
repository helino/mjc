package se.helino.mjc.parser;

public class MJNot implements MJExpression {
    private MJExpression exp;

    public MJNot(MJExpression exp) {
        this.exp = exp;
    }

    public MJExpression getExpression() {
        return exp;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
