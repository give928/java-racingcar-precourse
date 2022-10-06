package racingcar.domain;

public class NumberConditionMovement implements Movement {
    public static final int CONDITION = 4;
    private final NumberGenerator numberGenerator;

    public NumberConditionMovement(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    @Override
    public boolean forward() {
        return CONDITION <= numberGenerator.generate();
    }
}
