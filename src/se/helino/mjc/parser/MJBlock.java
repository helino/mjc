package se.helino.mjc.parser;

import java.util.ArrayList;

public class MJBlock implements MJStatement {
    private ArrayList<MJStatement> statements = new ArrayList<MJStatement>();

    public void addMJStatement(MJStatement s) {
        statements.add(s);
    }

    public ArrayList<MJStatement> getStatements() {
        return statements;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public void accept(TypeVisitor v) {
        v.visit(this);
    }
    
    public int accept(IntVisitor v) {
        return v.visit(this);
    }
}
