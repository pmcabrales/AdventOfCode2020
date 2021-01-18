package pmcabrales.adventofcode.day2;

public class PasswordPolicy {
    int min;
    int max;
    char character;
    String password;

    public PasswordPolicy(int min, int max, char character, String password) {
        this.min = min;
        this.max = max;
        this.character = character;
        this.password = password;
    }
}
