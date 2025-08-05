import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    void testDefaultConstructorSetsChecking() {
        Account account = new Account();
        assertEquals(AccountType.CHECKING, account.getAccountType());
    }

    @Test
    void testConstructorWithCheckingType() {
        Account account = new Account(AccountType.CHECKING);
        assertEquals(AccountType.CHECKING, account.getAccountType());
    }

    @Test
    void testConstructorWithSavingType() {
        Account account = new Account(AccountType.SAVING);
        assertEquals(AccountType.SAVING, account.getAccountType());
    }

    @Test
    void testConstructorWithCreditCardType() {
        Account account = new Account(AccountType.CREDIT_CARD);
        assertEquals(AccountType.CREDIT_CARD, account.getAccountType());
    }

    @Test
    void testSetAccountType() {
        Account account = new Account();
        account.setAccountType(AccountType.SAVING);
        assertEquals(AccountType.SAVING, account.getAccountType());
    }

    @Test
    void testToStringIncludesAccountType() {
        Account account = new Account(AccountType.CREDIT_CARD);
        assertTrue(account.toString().contains("CREDIT_CARD"));
    }

    @Test
    void testEqualsAndHashCode() {
        Account a1 = new Account(AccountType.SAVING);
        Account a2 = new Account(AccountType.SAVING);
        Account a3 = new Account(AccountType.CHECKING);

        assertEquals(a1, a2);
        assertNotEquals(a1, a3);
        assertEquals(a1.hashCode(), a2.hashCode());
        assertNotEquals(a1.hashCode(), a3.hashCode());
    }
}