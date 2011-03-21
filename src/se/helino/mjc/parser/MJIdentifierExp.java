package se.helino.mjc.parser;

public class MJIdentifierExp implements MJExpression {
    private String name;

    public MJIdentifierExp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
