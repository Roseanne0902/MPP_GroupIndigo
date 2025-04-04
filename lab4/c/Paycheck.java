package mPP.exercisesMPP.lab4;

public final class Paycheck {

    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;

    public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
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
