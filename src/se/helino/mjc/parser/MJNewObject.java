package se.helino.mjc.parser;

public class MJNewObject implements MJExpression {
    private MJIdentifier id;

    public MJNewObject(MJIdentifier id) {
        this.id = id;
    }

    public MJIdentifier getId() {
        return id;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
