package ru.danila.expression;

import ru.danila.exceptions.CastToDoubleException;

public interface Expression {
    boolean isDoubleValue();
    double getDoubleValue() throws CastToDoubleException;
}
