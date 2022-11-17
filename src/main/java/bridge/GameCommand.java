package bridge;

import java.util.Objects;

public enum GameCommand {

    PROGRESS,
    FINISH,
    RETRY
    ;

    private static final String RESTART = "R";
    private static final String QUIT = "Q";

    public boolean isFinish() {
        return this == FINISH;
    }

    public boolean isRetry() {
        return this == RETRY;
    }

    public static void checkStatus(String input) {
        if (Objects.equals(input, RESTART) || Objects.equals(input, QUIT)) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static GameCommand getStatus(String input) {
        if (Objects.equals(input, RESTART)) {
            return RETRY;
        }
        return FINISH;
    }

}