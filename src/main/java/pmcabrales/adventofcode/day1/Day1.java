package pmcabrales.adventofcode.day1;

/**
 * --- Day 1: Report Repair ---
 */
public class Day1 {

    protected static int solvePart1(int criteria, int[] expensesRecord){
        for (int k : expensesRecord) {
            for (int j = 1; j < expensesRecord.length; j++) {
                if (k + expensesRecord[j] == criteria) {
                    return k * expensesRecord[j];
                }
            }
        }
        return -1;
    }

    protected static int solvePart2(int criteria, int[] expensesRecord){
        for (int value : expensesRecord) {
            for (int j = 1; j < expensesRecord.length; j++) {
                for (int k = 2; k < expensesRecord.length; k++) {
                    if (value + expensesRecord[j] + expensesRecord[k] == criteria) {
                        return value * expensesRecord[j] * expensesRecord[k];
                    }
                }
            }
        }
        return -1;
    }
}
