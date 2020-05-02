package l14_l15_listener.tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MiniMaxAiGameStrategy implements AiGameStrategy {

    public static final int PLACED_BY_GAMER = 1;

    public static final int PLACED_BY_AI = -1;

    @Override
    public int aiMakeTurn(int[] field) {

        Pair<Integer, Integer> evaluateNewTurn = evaluateNextTurn(field, true);
        System.out.println(evaluateNewTurn);
        return evaluateNewTurn.first;
    }

    public Pair<Integer, Integer> evaluateNextTurn(int[] field, boolean isAiTurn) {
        if (checkAiWin(field)) {
            return new Pair<>(100, 1);
        }
        if (checkPlayerWin(field)) {
            return new Pair<>(100, -1);
        }
        if (isNoPlaceToPut(field)) {
            return new Pair<>(100, 0);
        }
        List<Integer> freePlaces = findFreePlaces(field);
        Map<Integer, Integer> placeToEstimation = new HashMap<>();
        for (Integer place : freePlaces) {
            int setNumber = isAiTurn ? PLACED_BY_AI : PLACED_BY_GAMER;
            int[] copy = copy(field);
            copy[place] = setNumber;
            boolean nextTurnMadeBy = !isAiTurn;
            Integer estimation = evaluateNextTurn(copy, nextTurnMadeBy).second;
            placeToEstimation.put(place, estimation);
        }

        if (isAiTurn) {
            Pair<Integer, Integer> maxEstimation = new Pair<>(Integer.MIN_VALUE, Integer.MIN_VALUE);
            for (Map.Entry<Integer, Integer> entry : placeToEstimation.entrySet()) {
                if (entry.getValue() > maxEstimation.second) {
                    maxEstimation = new Pair<>(entry.getKey(), entry.getValue());
                }
            }
            return maxEstimation;
        } else {
            Pair<Integer, Integer> minEstimation = new Pair<>(Integer.MIN_VALUE, Integer.MAX_VALUE);
            for (Map.Entry<Integer, Integer> entry : placeToEstimation.entrySet()) {
                if (entry.getValue() < minEstimation.second) {
                    minEstimation = new Pair<>(entry.getKey(), entry.getValue());
                }
            }
            return minEstimation;
        }
    }

    private int[] copy(int[] original) {
        return Arrays.copyOf(original, 9);
    }

    private List<Integer> findFreePlaces(int[] field) {
        List<Integer> freePlaces = new ArrayList<>();
        for (int i = 0; i < field.length; i++) {
            if (field[i] == 0) {
                freePlaces.add(i);
            }
        }
        return freePlaces;
    }

    public boolean isNoPlaceToPut(int[] field) {
        for (int i = 0; i < 9; i++) {
            if (field[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean checkPlayerWin(int[] field) {
        return checkWin(PLACED_BY_GAMER, field);
    }

    public boolean checkAiWin(int[] field) {
        return checkWin(PLACED_BY_AI, field);
    }

    private boolean checkWin(int placedBy, int[] field) {
        boolean top = field[0] == placedBy && field[1] == placedBy && field[2] == placedBy;
        boolean middle = field[3] == placedBy && field[4] == placedBy && field[5] == placedBy;
        boolean bottom = field[6] == placedBy && field[7] == placedBy && field[8] == placedBy;

        boolean left = field[0] == placedBy && field[3] == placedBy && field[6] == placedBy;
        boolean center = field[1] == placedBy && field[4] == placedBy && field[7] == placedBy;
        boolean right = field[2] == placedBy && field[5] == placedBy && field[8] == placedBy;

        boolean diagonal = field[0] == placedBy && field[4] == placedBy && field[8] == placedBy;
        boolean backDiagonal = field[2] == placedBy && field[4] == placedBy && field[6] == placedBy;

        boolean isWin = top || middle || bottom || left || center || right || diagonal || backDiagonal;
        return isWin;
    }
}
