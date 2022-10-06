package racingcar.domain;

import java.util.Objects;

public class Position {
    static final int FORWARD_VALUE = 1;
    private static final String POSITION_EXPRESSION = "-";

    private int value = 0;

    private Position() {
    }

    public static Position create() {
        return new Position();
    }

    public int forward() {
        value += FORWARD_VALUE;
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position = (Position) o;
        return value == position.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return new String(new char[value]).replace("\0", POSITION_EXPRESSION);
    }
}
