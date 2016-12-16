// function value
// Copyright 2013 Lutz Hamel
// Distributed under the terms of the GNU General Public License (GPL)

public class FunctionValue extends Value {

    // we store the AST tree representing the function value
    Function function = null;

    public FunctionValue(Function function) {
        this.function=function;
    }

    public int getType() {
        return Value.FUNCTION;
    }

    public Function getFunction() {
        return function;
    }

}
