package countryClass;

import java.util.Arrays;

public class unknownCountry {
    private String nameCountry;
    private double areaCountry;
    private double populationCountry;
    private String nameCapital;
    private double populationCapital;

    public static void main(String[] args) {
        unknownCountry[] country = new unknownCountry[5];
        country[0] = new unknownCountry("Russia", 17.1, 146.7, "Moscow", 12.6);
        country[1] = new unknownCountry("Finland", 338, 5.5, "Helsinki", 655);
        country[3] = new unknownCountry("Andorra", 467, 85.4, "Andorra la Vella", 22.6);
        country[2] = new unknownCountry("France", 643.8, 67.8, "Paris", 2.1);
        country[4] = new unknownCountry("Singapore", 725, 5.7);
        printAll(country);
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        if (nameCountry == null || nameCountry.isEmpty()) {
            throw new IllegalArgumentException("Необходимо ввести название страны");
        }
        this.nameCountry = nameCountry;
    }

    public double getAreaCountry() {
        return areaCountry;
    }

    public void setAreaCountry(double areaCountry) {
        if (areaCountry > 0) {
            this.areaCountry = areaCountry;
        } else {
            System.out.println("Необходимо ввести площадь страны");
        }
    }

    public double getPopulationCountry() {
        return populationCountry;
    }

    public void setPopulationCountry(double populationCountry) {
        if (populationCountry > 0) {
            this.populationCountry = populationCountry;
        } else {
            System.out.println("Необходимо ввести население страны");
        }
    }

    public String getNameCapital() {
        return nameCapital;
    }

    public void setNameCapital(String nameCapital) {
        if (nameCapital == null || nameCapital.isEmpty()) {
            throw new IllegalArgumentException ("Необходимо ввести название столицы");
        }
        this.nameCapital = nameCapital;
    }
    public void setNameCapital() {
            }


    public double getPopulationCapital() {
        return populationCapital;
    }

    public void setPopulationCapital(double populationCapital) {
        if (populationCapital > 0) {
            this.populationCapital = populationCapital;
        } else {
            System.out.println("Необходимо ввести население столицы");
        }
    }

    public double getPopulationDensity() {
        return populationCountry / areaCountry;
    }

    public void Capital(String nameCapital, double populationCapital) {
        setNameCapital(nameCapital);
        setPopulationCapital(populationCapital);
        System.out.println("Название столицы " + getNameCapital() + " Население столицы " + getPopulationCapital());
    }


    public unknownCountry(String nameCountry, double areaCountry, double populationCountry, String nameCapital, double populationCapital) {
        unknownCountry Country = new unknownCountry();
        setNameCountry(nameCountry);
        setAreaCountry(areaCountry);
        setPopulationCountry(populationCountry);
        setNameCapital(nameCapital);
        setPopulationCapital(populationCapital);

    }

    public unknownCountry(String nameCountry, double areaCountry, double populationCountry) {
        setNameCountry(nameCountry);
        setAreaCountry(areaCountry);
        setPopulationCountry(populationCountry);
    }

    public unknownCountry() {
    }

    public void print(String nameCountry, double areaCountry, double populationCountry, String nameCapital, double populationCapital) {
        unknownCountry unknownCountry = new unknownCountry();
        unknownCountry.setNameCapital(nameCapital);
        unknownCountry.setNameCountry(nameCountry);
        unknownCountry.setAreaCountry(areaCountry);
        unknownCountry.setPopulationCapital(populationCapital);
        unknownCountry.setPopulationCountry(populationCountry);
        if (nameCapital != null && populationCapital != 0) {
            System.out.println("Название страны " + getNameCountry() + "\n Площадь страны " + getAreaCountry() + "\nНаселение страны " + getPopulationCountry());
            System.out.println("Название столицы " + getNameCapital() + " Население столицы " + getPopulationCapital());
        } System.out.println("Название страны " + getNameCountry() + "\n Площадь страны " + getAreaCountry() + "\nНаселение страны " + getPopulationCountry());
    }

    public static void printAll(unknownCountry[] country) {
        System.out.println(Arrays.toString(country));
    }
    public String toString() {
        if (nameCapital != null && populationCapital != 0) {
            return "Название страны " + getNameCountry() + " Площадь страны " + getAreaCountry() + " Население страны " + getPopulationCountry() + " Название столицы " + getNameCapital() + " Население столицы " + getPopulationCapital() +"\n";
        }
        return "Название страны " + getNameCountry() + " Площадь страны " + getAreaCountry() + " Население страны " + getPopulationCountry() + "\n";
    }
    }





