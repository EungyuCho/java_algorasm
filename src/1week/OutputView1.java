public class OutputView1 {

    private static final String PARSE_AT_SECOND = "%.2f";
    public static void askAlphabet() {
        System.out.println("알파벳을 입력해 주세요. 나가려면 exit를 입력 해 주세요.");
    }

    public static void pleaseInputOneCharacter() {
        System.out.println("한 글자만 입력 해 주세요.");
    }

    public static void askCylinderRadius() {
        System.out.print("Enter the radius of a cylinder (in cm): ");
    }

    public static void askCylinderHeight() {
        System.out.print("Enter the height of the cylinder (in cm): ");
    }

    public static void responseCylinderArea(double result) {
        System.out.println("The surface area of a cylinder is: " + String.format(PARSE_AT_SECOND,result) + " sq. cm");
    }

    public static void askNumber() {
        System.out.print("Enter the number of dots: ");
    }

    public static void responseTransMoney(int bricks, int stacks, int lines, int dots) {
        System.out.println("The number of dots is the same as: ");
        System.out.println(bricks + " bricks");
        System.out.println(stacks + " stacks");
        System.out.println(lines + " lines");
        System.out.println(dots + " dots");
    }

    public static void askEmployeeType() {
        System.out.print("Select employee type: (c) corporate (h) hourly (s) sales: ");
    }

    public static void askWeeklySalary() {
        System.out.print("Enter weekly salary: ");
    }

    public static void askHourlyWage() {
        System.out.print("Enter hourly wage: ");
    }

    public static void askHourWorks() {
        System.out.print("Enter hours worked: ");
    }

    public static void askWeeklySales() {
        System.out.print("Enter weekly sales: ");
    }

    public static void responsePayment(double gross, double taxes, double netPay) {
        System.out.println("Gross pay: $" + String.format(PARSE_AT_SECOND, gross));
        System.out.println("Taxes: $" + String.format(PARSE_AT_SECOND, taxes));
        System.out.println("Net pay: $" + String.format(PARSE_AT_SECOND, netPay));
    }

    public static void askYear() {
        System.out.print("Enter the year (e.g. 1968): ");
    }

    public static void askMonth() {
        System.out.print("Enter month (1-12): ");
    }

    public static void askDay() {
        System.out.print("Enter the day of the month (1-31): ");
    }

    public static void responseDayOfWeek(String dayOfWeek) {
        System.out.println("The day of the week is " + dayOfWeek);
    }
}
