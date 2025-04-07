package lab4.problem3;

public final class Paycheck {
    private final double FICA_RATE = 0.23;
    private final double STATE_RATE = 0.05;
    private final double LOCAL_RATE = 0.01;
    private final double MEDICARE_RATE = 0.03;
    private final double SOCIAL_SECURITY_RATE = 0.075;


    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;

    public Paycheck(double grossPay) {
        this.grossPay = grossPay;
        this.fica = grossPay * FICA_RATE;
        this.state = grossPay * STATE_RATE;
        this.local =  grossPay * LOCAL_RATE;
        this.medicare = grossPay * MEDICARE_RATE;
        this.socialSecurity = grossPay * SOCIAL_SECURITY_RATE;
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
