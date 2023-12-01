package page.main.calculate;

public class CreditService {
    public static double calculate(int loanAmount, double interestRate, int period) {
        double interestRateMonth = interestRate / (12 * 100);
        double ratio = (interestRateMonth * Math.pow(1 + interestRateMonth, period) /
                (Math.pow(1 + interestRateMonth, period) - 1));
        double IntermediateResult = ratio * loanAmount;
        return (IntermediateResult * period) / period;
    }
}
