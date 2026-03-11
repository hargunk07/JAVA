

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp7 {

    public static void main(String[] args) {

        Map<Character, CharacterPatternMap> patternMap = CharacterPatternMap.createPatternMap();

        String text = "OOPS";
        StringBuilder[] bannerLines = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        for (char c : text.toCharArray()) {

            CharacterPatternMap pattern = patternMap.get(c);

            for (int i = 0; i < 7; i++) {
                bannerLines[i].append(pattern.getPattern()[i]).append("  ");
            }
        }

        for (StringBuilder line : bannerLines) {
            System.out.println(line.toString());
        }
    }

    
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }

        
        public static Map<Character, CharacterPatternMap> createPatternMap() {

            Map<Character, CharacterPatternMap> map = new HashMap<>();

            map.put('O', new CharacterPatternMap('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            }));

            map.put('P', new CharacterPatternMap('P', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    " ***** ",
                    "*      ",
                    "*      ",
                    "*      "
            }));

            map.put('S', new CharacterPatternMap('S', new String[]{
                    " ***** ",
                    "*      ",
                    "*      ",
                    " ***** ",
                    "      *",
                    "      *",
                    " ***** "
            }));

            return map;
        }
    }
}