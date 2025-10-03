package fr.uvsq.cprog.collex;

import static org.junit.Assert.*;
import fr.uvsq.cprog.collex.model.AdresseIP;
import fr.uvsq.cprog.collex.model.DnsItem;
import fr.uvsq.cprog.collex.model.NomMachine;
import org.junit.Test;

public class DnsItemTest {
  @Test
  public void testConstructeurValide() {
    AdresseIP ip = new AdresseIP("192.168.1.1");
    NomMachine nm = new NomMachine("server.example.com");
    DnsItem item = new DnsItem(ip, nm);
    assertEquals(ip, item.getIp());
    assertEquals(nm, item.getNom());
  }

  @Test
  public void testGetIp() {
    AdresseIP ip = new AdresseIP("10.0.0.1");
    NomMachine nm = new NomMachine("pc1.local");
    DnsItem item = new DnsItem(ip, nm);
    assertEquals(ip, item.getIp());
  }

  @Test
  public void testGetNom() {
    AdresseIP ip = new AdresseIP("172.16.0.1");
    NomMachine nm = new NomMachine("mail.company.org");
    DnsItem item = new DnsItem(ip, nm);
    assertEquals(nm, item.getNom());
  }

  @Test 
  public void testToString() {
    AdresseIP ip = new AdresseIP("192.168.1.100");
    NomMachine nm = new NomMachine("web.example.com");
    DnsItem item = new DnsItem(ip, nm);
    assertEquals("192.168.1.100 web.example.com", item.toString());
  }
}
