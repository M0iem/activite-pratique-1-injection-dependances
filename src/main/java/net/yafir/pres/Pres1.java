package net.yafir.pres;
import net.yafir.ext.DaoImplV2;
import net.yafir.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier= new MetierImpl(d);
//      metier.setDao(d);
        System.out.println("RES=" +metier.calcul());

    }
}
