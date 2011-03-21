package se.helino.mjc;

import java.util.ArrayList;

public class MJCall extends MJExpression implements Acceptable {
    private MJExpression exp;
    private MJIdentifier methodId;
    private ArrayList<MJExpression> parameters = new ArrayList<MJExpression>();

    public MJCall(MJExpression exp, MJIdentifier methodId) {
        this.exp = exp;
        this.methodId = methodId;
    }

    public void addParameter(MJExpression e) {
        parameters.add(e);
    }

    public MJExpression getExpression() {
        return exp;
    }

    public MJIdentifier getMethodId() {
        return methodId;
    }

    public ArrayList<MJExpression> getParameters() {
        return parameters;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
