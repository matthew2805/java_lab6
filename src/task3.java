

import java.util.Scanner;

interface Converter {
    double getConvertedValue(double baseValue);
}

class BYrub implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue;
    }
}

class USD implements Converter {

    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue / 3.26;
    }
}

class EUR implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue / 3.51;
    }
}

class Grivna implements Converter {

    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue * 9.03;
    }
}
class RUSrub implements Converter {

    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue * 25.78;
    }
}

public class task3 {
    public static void main(String[] args){
        System.out.println("Vvedite chislo");
        Scanner scn=new Scanner(System.in);
        double BELrub=0;
        BELrub =scn.nextDouble();


        System.out.println("Bel ruble = " +
                new BYrub().getConvertedValue(BELrub));
        System.out.println("Bel ruble v USD = " +
                new USD().getConvertedValue(BELrub));
        System.out.println("Bel ruble v EUR = " +
                new EUR().getConvertedValue(BELrub));
        System.out.println("Bel ruble v GRIVNE = " +
                new Grivna().getConvertedValue(BELrub));
        System.out.println("Bel ruble v RUSruble = " +
                new RUSrub().getConvertedValue(BELrub));
    }
}
