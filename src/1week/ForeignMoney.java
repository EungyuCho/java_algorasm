import common.InputView;

public class ForeignMoney {
    // dot를 입력받아서 line stack brick으로 올라가며 전환 해주고 출력 해주는 예제
    private static int DOT_TO_LINE = 6;
    private static int LINE_TO_STACK = 60;
    private static int STACK_TO_BRICK = 50;

    public static void main(String[] args) {
        OutputView1.askNumber();
        int dots = InputView.getInt();

        int lines = (int) dots / DOT_TO_LINE;
        dots = dots % DOT_TO_LINE;

        int stacks = (int) lines / LINE_TO_STACK;
        lines = lines % LINE_TO_STACK;

        int bricks = (int) stacks / STACK_TO_BRICK;
        stacks = stacks % STACK_TO_BRICK;

        OutputView1.responseTransMoney(bricks, stacks, lines, dots);
    }
}
