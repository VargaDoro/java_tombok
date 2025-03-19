package static_mod;

import java.util.Random;

public class TombHasznalata {
    
    static final Random random = new Random();
    
    public static void main(String[] args) {
       int[] egeszek={10,20,30};
       kiirTomb("int[] tomb1={10,20,30}", egeszek);
       valtoztat(egeszek);
       kiirTomb("változtatás után", egeszek);
       int valtoztatasSzama=0;
       while(!(egeszek[0]==40)){
           valtoztat(egeszek);
           valtoztatasSzama++;
       }
       String s = "--- [0] = 40 (%d * valtoztat())".formatted(valtoztatasSzama);
       kiirTomb(s, egeszek);
       
    }

    private static void kiirTomb(String cim, int[] tomb) {
        System.out.println(cim);
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf("[%d] = %d\n", i, tomb[i]);
        }
    }

    private static void valtoztat(int[] tomb) {
        int i=random.nextInt(tomb.length);
        tomb[i] *= -2; 
    }
}
