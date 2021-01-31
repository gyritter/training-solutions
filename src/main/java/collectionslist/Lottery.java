package collectionslist;

import java.util.*;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {

        if (!(lotteryType < ballCount))
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");

        List<Integer> balls = new ArrayList<>();

        for (int i = 1; i < ballCount + 1; i++) {
            balls.add(i);
        }
        Collections.shuffle(balls);
        Random rnd = new Random();
        int index;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < lotteryType; i++) {
            index = rnd.nextInt(ballCount - i);
            result.add(balls.get(index));
            balls.remove(index);
        }
        Collections.sort(result);
        return result;

    }
}
