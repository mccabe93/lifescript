// Integer value
// Copyright 2013 Lutz Hamel
// Distributed under the terms of the GNU General Public License (GPL)

class IntValue extends Value {

    private Double value;

    public IntValue(Double value) {
        this.value=value;
    }

    public Double getValue() {
        return value;
    }

    public int getType() {
        return Value.INTEGER;
    }
}
