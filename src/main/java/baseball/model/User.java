package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    public static final int FIRST_GAME =0;
    public static final int RESTART_GAME = 1;
    public static final int END_GAME = 2;

    private int status;
    private List<Integer> numList;

    public void updateStatus(int status) {
        this.status = status;
    }

    public void updateNumList(List<Integer> numList) {
        this.numList = numList;
    }

    public User(int status) {
        this.status = status;
        this.numList = new ArrayList<>();
    }

    public int getStatus() {
        return status;
    }

    public List<Integer> getNumList() {
        return numList;
    }
}