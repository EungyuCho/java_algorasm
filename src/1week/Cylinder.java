import common.InputView;

public class Cylinder {
    // 원통형 실린더의 Area를 구하는 문제
    private static double PI = 3.141592;
    public static void main(String[] args) {
        OutputView1.askCylinderRadius();
        int radius = InputView.getInt();
        OutputView1.askCylinderHeight();
        int height = InputView.getInt();

        OutputView1.responseCylinderArea(getArea(radius, height));
    }

    private static double getArea(int r, int h) {
        return (2 * PI * r * h) + (2 * PI * r * r);
    }
}
