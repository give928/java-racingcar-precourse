package racingcar.ui;

import racingcar.domain.*;
import racingcar.dto.RecordDto;

public class RacingCarController {
    private final Movement movement = NumberConditionMovement.from(new RandomNumberGenerator());

    public void start() {
        Racing racing = Racing.of(createEntry(), createLap());
        RecordDto recordDto = racing.race(movement);
        OutputView.showRecord(recordDto);
    }

    private Entry createEntry() {
        Entry entry = null;
        while (entry == null) {
            entry = inputCarNames();
        }
        return entry;
    }

    private static Entry inputCarNames() {
        try {
            String carNames = InputView.inputCarNames();
            return Entry.from(carNames);
        } catch(IllegalArgumentException e) {
            OutputView.error(e.getMessage());
        }
        return null;
    }

    private Lap createLap() {
        Lap lap = null;
        while (lap == null) {
            lap = inputLap();
        }
        return lap;
    }

    private Lap inputLap() {
        try {
            String lapCount = InputView.inputLapCount();
            return Lap.from(lapCount);
        } catch(IllegalArgumentException e) {
            OutputView.error(e.getMessage());
        }
        return null;
    }
}
