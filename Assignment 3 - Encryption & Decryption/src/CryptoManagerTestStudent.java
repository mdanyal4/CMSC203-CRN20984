import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

	@Test
	public void testTestStringInBounds() {
		assertFalse(CryptoManager.isStringInBounds("cmsc"));
		assertTrue(CryptoManager.isStringInBounds("CMSC"));
		assertTrue(CryptoManager.isStringInBounds("CMSC 203 WITH AHMED TAREK"));

	} 
	
	/*
	@Test
	public void testTestEncryptCaesar() {
				
		assertEquals("HRXH",CryptoManager.caesarEncryption("CMSC", 5));
		assertEquals("JT]M",CryptoManager.caesarEncryption("BLUE", 8));
		assertEquals("WP!!H",CryptoManager.caesarEncryption("PIZZA", 7));
	}
	
	

	@Test
	void testTestDecryptCaesar() {
		assertEquals("YELLOW",CryptoManager.caesarDecryption("[GNNQY", 2));
		assertEquals("FOOD",CryptoManager.caesarDecryption("JSSH", 4));
		assertEquals("FISH",CryptoManager.caesarDecryption("OR\\Q", 9));

	}

	@Test
	void testTestEncryptBellaso() {
		assertEquals(" __\\",CryptoManager.bellasoEncryption("POOL", "P"));
		assertEquals("JZ^STZ",CryptoManager.bellasoEncryption("BURGER", "HELLO"));
		assertEquals("D.WI^W",CryptoManager.bellasoEncryption("FRIES", "BYE"));

	}

	@Test
	void testTestDecryptBellaso() {
		assertEquals("WAFFLE",CryptoManager.bellasoDecryption("*ZX[\\X", "SYRUP"));
		assertEquals("PANCAKE",CryptoManager.bellasoDecryption("#Z XQ^^", "SYRUP"));
		assertEquals("SAUSAGE",CryptoManager.bellasoDecryption("&B*VFZF", "SAUCE"));
	}
	*/

}
