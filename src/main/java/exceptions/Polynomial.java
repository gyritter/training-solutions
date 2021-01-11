package exceptions;

public class Polynomial {

    private double[] coeff;

    public Polynomial(double[] coeff) {
        if (coeff == null || coeff.length < 1) {
            throw new NullPointerException("coefficients is null");
        }
        this.coeff = coeff;
    }

    public Polynomial(String[] coeffString) {
        if (coeffString == null || coeffString.length < 1) {
            throw new NullPointerException("coefficientStrs is null");
        }
        coeff = new double[coeffString.length];
        try {
            for (int i = 0; i < coeffString.length; i++) {
                coeff[i] = Double.parseDouble(coeffString[i]);
            }
        } catch(NumberFormatException ex) {
            throw new IllegalArgumentException("Illegal coefficients, not a number", ex);
        }
    }

    public double[] getCoeff() {
        return coeff;
    }

    public double evaluate(double x){
        double result=0.;
        double n=coeff.length-1;
        for (int i = 0; i < coeff.length; i++) {
            result+=Math.pow(x,n)*coeff[i];
            n--;
        }
        return result;
    }
}
