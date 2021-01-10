import common.InputView;

public class WhatDay {
    // Year, Month, day를 입력받아서 현재 요일을 구하는 문제
    private static String[] daysOfWeek = {"Saturday, Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    public static void main(String[] args) {
        OutputView1.askYear();
        String year = String.valueOf(InputView.getInt());
        OutputView1.askMonth();
        int month = InputView.getInt() % 12;
        OutputView1.askDay();
        int day = InputView.getInt();

        String dayOfWeek = calcWeekOfDay(
                Integer.parseInt(year.substring(0, 1)),
                Integer.parseInt(year.substring(1, 2)),
                month,
                day);

        OutputView1.responseDayOfWeek(dayOfWeek);

    }

    private static String calcWeekOfDay(int j, int k, int m, int q) {
        int d = (q + ((m + 1) * 13) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

        return daysOfWeek[d];
    }
}
