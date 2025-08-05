import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortenerTests {

    // Arrange
    String input = "ab";
    String expected = "";
    // unit under test
    Truncator uut = new Truncator();


    @BeforeEach
    public void setup() {
        // This method is called before each test method
        // You can initialize common variables or objects here
        input = "ab";
        expected = "";
        uut = new Truncator();
    }



    @Test
    public void testShortenTwoCharacters() throws EmptyStringException {


        // Act
        String actual = uut.truncate(input);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void AwfulTestShortenTwoCharacters() throws EmptyStringException {
        Truncator uut = new Truncator();
        assertEquals("", uut.truncate("ab"));
    }


    @ParameterizedTest
    @CsvSource({"abc,c", "abcd,cd", "a,a", "ab,b", "abcde,de", "abcdefg,efg", "abcdefgh,gh"})
    public void parameterizedTest(String input, String expected) throws EmptyStringException {


        // Act
        String result = uut.truncate(input);

        // Assert
        assertEquals(expected, result);
    }



    @ParameterizedTest
    @CsvFileSource(resources = "/resources/parameterized_test_cases.csv" )
    public void parameterizedCSVFileTest(String input, String expected) throws EmptyStringException {


        // Act
        String result = uut.truncate(input);

        // Assert
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testTruncateNullAndEmpty(String input) {
        try {
            uut.truncate(input);
            fail();
        } catch (EmptyStringException e) {
            assertEquals("Get with the program, moron.  The Input cannot be empty", e.getMessage());
        } catch (NullPointerException e) {
            assertEquals("Get with the program, moron.  The Input cannot be null", e.getMessage());
        }
    }
}
