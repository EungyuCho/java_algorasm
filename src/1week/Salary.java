import common.InputView;

public class Salary {

    // Employ type을 받아서 급료를 계산하는 예제
    public static void main(String[] args) {
        OutputView1.askEmployeeType();
        char type = InputView.getLine().charAt(0);

        Employee employee;
        switch (type) {
            case 'c':
                employee = new Corporate();
                break;
            case 'h':
                employee = new Hourly();
                break;
            case 's':
                employee = new Sales();
                break;
            default:
                throw new IllegalArgumentException();
        }

        employee.printPayment();
    }
}

class Employee {
    public static double TAX_PERCENTAGE = 14.5;
    public double gross;
    public double taxes;
    public double netPay;

    public Employee() { }

    public void setPays(double gross) {
        this.gross = gross;
        this.taxes = (this.gross / 100) * TAX_PERCENTAGE;
        this.netPay = this.gross - this.taxes;
    }

    public void printPayment() {
        OutputView1.responsePayment(this.gross, this.taxes, this.netPay);
    }
}


class Corporate extends Employee {
    public Corporate() {
        OutputView1.askWeeklySalary();
        double salary = InputView.getDouble();
        setPays(salary);
    }
}

class Hourly extends Employee {
    public Hourly() {
        OutputView1.askHourlyWage();
        double wage = InputView.getDouble();
        OutputView1.askHourWorks();
        double works = InputView.getDouble();
        double salary = 0;

        if (works > 40) {
            double overWorks = works - 40;
            salary += overWorks * wage * 2;
            works -= overWorks;
        }

        salary += works * wage;
        setPays(salary);
    }
}

class Sales extends Employee {
    private static final int SALES_PERCENTAGE = 6;
    public Sales() {
        OutputView1.askWeeklySales();
        double salary = 500;
        double sales = InputView.getDouble();
        double bonus = (sales / 100) * SALES_PERCENTAGE;
        setPays(salary + bonus);
    }
}