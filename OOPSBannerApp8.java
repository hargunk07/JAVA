

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp8 {

    public static void main(String[] args) {

        
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        String word = "OOPS";

        StringBuilder[] bannerLines = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        
        for (char c : word.toCharArray()) {

            String[] pattern = patternMap.get(c);

            for (int i = 0; i < 7; i++) {
                bannerLines[i].append(pattern[i]).append("  ");
            }
        }

        
        for (StringBuilder line : bannerLines) {
            System.out.println(line.toString());
        }
    }
}