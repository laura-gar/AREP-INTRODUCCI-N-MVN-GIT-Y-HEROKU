package edu.escuelaing.arem;


public class Services {
    public double celsiusToFahrenheit(double celsius){
        double res = (celsius * 9/5) + 32;
        return res;
    }

    public double fahrenheitToCelsius(double fahrenheit){
        double res = (fahrenheit - 32) * 5/9;
        return res;
    }

    public void main(String[] args) {
        System.out.println(celsiusToFahrenheit(10));
        System.out.println(fahrenheitToCelsius(71.6));
    }

}
