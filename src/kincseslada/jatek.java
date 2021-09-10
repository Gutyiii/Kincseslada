package kincseslada;

import java.util.Scanner;

public class jatek {

    static int valasztott;

    public void rejtveny() {
        System.out.println("Rejtvény:");
        System.out.println("Van 3 láda, ami közül 1 kincset rejt,\nezeken a ládkon van felirat:");
        System.out.println("1.:Én rejetem a kicsnet");
        System.out.println("2.:Nem én rejtem a kicsnet");
        System.out.println("3.:Az arany láda hazudik");
        System.out.println("Melyik ládát választod?");
    }

    public int valasztas() {
        Scanner sc = new Scanner(System.in);
        valasztott = sc.nextInt();
        while (valasztott < 1 || valasztott > 3) {
            System.out.println("Rossz a szám, újra");
            valasztott = sc.nextInt();
        }
        return valasztott;
    }

    public void eredmeny() {
        if (valasztott == 1) {
            ladak ladaka = new ladak("Arany", "Én rejetem a kicsnet", Boolean.FALSE);
            System.out.println("Nem talált");
        } else if (valasztott == 2) {
            ladak ladaka1 = new ladak("Ezüse", "Nem én rejtem a kicsnet", Boolean.TRUE);
            System.out.println("Talált");
        } else {
            ladak ladaka2 = new ladak("Bronz", "Az arany láda hazudik", Boolean.FALSE);
            System.out.println("Nem talált");
        }
    }

}
