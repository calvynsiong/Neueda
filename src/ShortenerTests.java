import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortenerTests {
    @Test
    public void testShortenTwoCharacters() throws EmptyStringException {
        // Arrange
        String input = "ab";
        String expected = "";
        // unit under test
        Truncator uut = new Truncator();

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
}
