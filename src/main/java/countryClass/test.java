package countryClass;

import java.util.Scanner;

public class test {
        public static void main(String[] args) {

        /*unknownCountry unknownCountry = new unknownCountry("",6,7);
        unknownCountry.setNameCapital("");
        unknownCountry.setNameCountry("nameCountry");
        unknownCountry.setAreaCountry(6);
        unknownCountry.setPopulationCapital(-5);
        unknownCountry.setPopulationCountry(-8);
        unknownCountry.print("333",-9,9,"kkk",7);
            countryClass.unknownCountry.printAll();
            unknownCountry Country = new unknownCountry();*/
            Scanner in = new Scanner(System.in);
            System.out.println("Введи слово");
            String y;
            y = in.nextLine();
            int x = 0;
            x = in.nextInt();
            int d =0;
            d = in.nextInt();
            unknownCountry unknownCountry = new unknownCountry(y,x,d);


            System.out.println("Country " + unknownCountry.getNameCountry() );


    }
}
