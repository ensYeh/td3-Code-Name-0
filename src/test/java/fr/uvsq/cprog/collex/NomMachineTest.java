package fr.uvsq.cprog.collex;

import static org.junit.Assert.*;
import fr.uvsq.cprog.collex.model.NomMachine;
import org.junit.Test;

public class NomMachineTest {
  @Test
  public void testConstructeurValide() {
    NomMachine nm = new NomMachine("server.example.com");
    assertEquals("server.example.com", nm.getNomQualifie());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructeurSansPoint() {
    new NomMachine("servername");
  }

  @Test
  public void testGetNomMachine() {
    NomMachine nm = new NomMachine("server.example.com");
    assertEquals("server", nm.getNomMachine());
  }

  @Test
  public void testGetDomain() {
    NomMachine nm = new NomMachine("server.example.com");
    assertEquals("example.com", nm.getDomain());
  }

  @Test
  public void testGetNomQualifie() {
    NomMachine nm = new NomMachine("pc1.local");
    assertEquals("pc1.local", nm.getNomQualifie());
  }

  @Test 
  public void testToString() {
    NomMachine nm = new NomMachine("mail.company.org");
    assertEquals("mail.company.org", nm.toString());
  }

  @Test
  public void testEquals() {
    NomMachine nm1 = new NomMachine("Server.Example.com");
    NomMachine nm2 = new NomMachine("server.example.com");
    NomMachine nm3 = new NomMachine("server.local");

    assertTrue(nm1.equals(nm2));
    assertTrue(!nm1.equals(nm3));
  }

  @Test
  public void testLowerCase() {
    NomMachine nm = new NomMachine("SERVER.EXAMPLE.COM");
    assertEquals("server.example.com", nm.getNomQualifie());
  }
}
