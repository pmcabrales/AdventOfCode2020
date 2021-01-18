package pmcabrales.adventofcode.day2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class Day2Test {

    protected InputStream inputStream1;
    protected InputStream inputStream2;

    @Before
    public void init(){
        inputStream1 = Day2.class.getResourceAsStream("/day2/input1.txt");
        inputStream2 = Day2.class.getResourceAsStream("/day2/input2.txt");
    }

    @Test
    public void solvePart1Test() {
        assertEquals(2, Day2.solvePart1(inputStream1, 0));
        assertEquals(607, Day2.solvePart1(inputStream2, 0));
    }

    @Test
    public void solvePart2Test() {
        assertEquals(1, Day2.solvePart2(inputStream1, 0));
        assertEquals(321, Day2.solvePart2(inputStream2, 0));
    }

}
