package lab4.problem3;

public final class Paycheck {

    private final double grossPay;
    private final double ficaRate = 0.23;
    private final double fica;
    private final double stateRate = 0.05;
    private final double state;
    private final double localRate = 0.01;
    private final double local;
    private final double medicareRate = 0.03;
    private final double medicare;
    private final double socialSecurityRate = 0.075;
    private final double socialSecurity;

    public Paycheck(double grossPay) {
        this.grossPay = grossPay;
        this.fica = grossPay * ficaRate;
        this.state = grossPay * stateRate;
        this.local =  grossPay *  localRate;
        this.medicare = grossPay *  medicareRate;
        this.socialSecurity = grossPay *  socialSecurityRate;
    }

    public double getNetPay() {
        return grossPay - (fica + state + local + medicare + socialSecurity);
    }

    public void print() {
        System.out.printf("Gross Pay: %.2f\n", grossPay);
        System.out.printf("FICA: %.2f\n", fica);
        System.out.printf("State Tax: %.2f\n", state);
        System.out.printf("Local Tax: %.2f\n", local);
        System.out.printf("Medicare: %.2f\n", medicare);
        System.out.printf("Social Security: %.2f\n", socialSecurity);
        System.out.printf("Net Pay: %.2f\n", getNetPay());
    }
}
