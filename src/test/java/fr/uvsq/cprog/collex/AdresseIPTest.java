package fr.uvsq.cprog.collex;

import static org.junit.Assert.*;
import fr.uvsq.cprog.collex.model.AdresseIP;
import org.junit.Test;

public class AdresseIPTest {
  @Test
  public void testConstructeurValide() {
    AdresseIP ip = new AdresseIP("192.168.1.1");
    assertEquals("192.168.1.1", ip.getAdresse()) ;
  }

  @Test(expected = IllegalArgumentException.class)
  public void testEstValide() {
    new AdresseIP("192.312.11.0");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testEstValideTropParts() {
    new AdresseIP("192.168.11.0.2.12");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testEstValidePasAssez() {
    new AdresseIP("192.312.11");
  }

  @Test
  public void testGetAdresse() {
    AdresseIP ip = new AdresseIP("192.168.1.1");
    assertEquals("192.168.1.1", ip.getAdresse()); 
  }

  @Test 
  public void testToString() {
    AdresseIP ip = new AdresseIP("192.168.1.1");
    assertEquals("192.168.1.1", ip.toString());
  }

  @Test
  public void testEquals() {
    AdresseIP ip1 = new AdresseIP("192.168.1.1");
    AdresseIP ip2 = new AdresseIP("192.168.1.1");
    AdresseIP ip3 = new AdresseIP("192.168.1.0");

    assertTrue(ip1.equals(ip2));
    assertTrue(!ip1.equals(ip3));
  }
}
