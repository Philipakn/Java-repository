import java.util.ArrayList;

public class LetterCombinations {

    public void combineLetters() {

        String comb = new String();
        ArrayList<String> array = new ArrayList<String>();

        char[] table = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
                'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char c1;
        char c2;
        char c3;
        char c4;
        char c5 = '"';
        char c6 = '"';

        int total = 0;
        for (int j = 0; j <= 25; j++) {
            for (int k = 0; k <= 25; k++) {
                for (int l = 0; l <= 25; l++) {
                    for (int m = 0; m <= 25; m++) {
                        c1 = table[j];
                        c2 = table[k];
                        c3 = table[l];
                        c4 = table[m];
                        comb = Character.toString(c5) + Character.toString(c1) + Character.toString(c2) + Character.toString(c3)
                                + Character.toString(c4) + Character.toString(c6);
                        array.add(comb);
                        total++;
                    }
                }
            }
        }
        System.out.println(array);
    }
}
