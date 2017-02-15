import static org.junit.Assert.*;

public class PalindromeTesterTest
{

    @org.junit.Test
    public void testSpace() throws Exception
    {
        assertTrue(PalindromeTester.isPalindrome(" "));
    }

    @org.junit.Test
    public void testNotPalindrome() throws Exception
    {
        assertFalse(PalindromeTester.isPalindrome("12345"));
        assertFalse(PalindromeTester.isPalindrome("123451"));
    }

    @org.junit.Test
    public void testPalindrome() throws Exception
    {
        assertTrue(PalindromeTester.isPalindrome("a"));
        assertTrue(PalindromeTester.isPalindrome("aba"));
        assertTrue(PalindromeTester.isPalindrome("abba"));
    }
}