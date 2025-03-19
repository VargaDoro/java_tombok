package static_mod;

import java.util.Random;

public class TombHasznalata {
    
    static final Random random = new Random();

    private static String[] nevek;
    
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
       
       nevek = new String[3];
       nevek[0] = "Ede";
       nevek[1] = "Éva";
       nevek[2] = "Pál";
       nevStatisztika(nevek);
    }
    
    private static void nevStatisztika(String[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            boolean van = tomb[i].contains("e");
            System.out.printf("(%d) = %s\n", i+1, tomb[i]);
        }
        String ki = "hossza: (%d), 'e'-t tartalmaz: ".formatted(tomb[i].length());
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
