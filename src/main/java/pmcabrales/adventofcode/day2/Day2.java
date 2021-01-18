package pmcabrales.adventofcode.day2;

import pmcabrales.adventofcode.utils.AdventOfCodeUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Day2 {

    static int solvePart1(InputStream inputStream, int numCorrectPasswords){
        try {
            List<String> inputLines = AdventOfCodeUtils.getLinesFromInputStream(inputStream);
            for(String line : inputLines){
                PasswordPolicy passwordPolicy = getPasswordPolicy(line);
                numCorrectPasswords += passwordIsCorrectMethod1(passwordPolicy)?1:0;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numCorrectPasswords;
    }

    static int solvePart2(InputStream inputStream, int numCorrectPasswords){
        try {
            List<String> inputLines = AdventOfCodeUtils.getLinesFromInputStream(inputStream);
            for(String line : inputLines){
                PasswordPolicy passwordPolicy = getPasswordPolicy(line);
                numCorrectPasswords += passwordIsCorrectMethod2(passwordPolicy)?1:0;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numCorrectPasswords;
    }

    private static PasswordPolicy getPasswordPolicy(String line) {
        int min;
        int max;
        char character;
        String pass;

        String[] parsedLine = line.split("-");
        min = Integer.parseInt(parsedLine[0]);

        parsedLine = parsedLine[1].split(" ");
        max = Integer.parseInt(parsedLine[0]);
        pass = parsedLine[2];

        parsedLine = parsedLine[1].split(":");
        character = parsedLine[0].charAt(0);

        return new PasswordPolicy(min, max, character, pass);
    }

    private static boolean passwordIsCorrectMethod1(PasswordPolicy passwordPolicy) {
        long count = passwordPolicy.password.chars().filter(ch -> ch == passwordPolicy.character).count();
        return passwordPolicy.min <= count && count <= passwordPolicy.max;
    }

    private static boolean passwordIsCorrectMethod2(PasswordPolicy passwordPolicy) {
        int count = 0;
        count += (passwordPolicy.password.charAt(passwordPolicy.min - 1) == passwordPolicy.character)? 1 : 0;
        count += (passwordPolicy.password.charAt(passwordPolicy.max - 1) == passwordPolicy.character)? 1 : 0;

        return count == 1;
    }


}
