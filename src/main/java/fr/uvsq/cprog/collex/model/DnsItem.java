package fr.uvsq.cprog.collex.model;

import fr.uvsq.cprog.collex.model.NomMachine;

/**
 * Représente une entrée DNS associant une adresse IP à un nom de machine.
 */
public class DnsItem {
  private final AdresseIP ip;
  private final NomMachine nom;

  /**
   * Constructeur d'une entrée DNS.
   *
   * @param ip l'adresse IP
   * @param nom le nom de la machine
   */
  public DnsItem(AdresseIP ip, NomMachine nom) {
    this.ip = ip;
    this.nom = nom;
  }

  /**
   * Retourne l'adresse IP.
   *
   * @return l'adresse IP
   */
  public AdresseIP getIp() {
    return this.ip;
  }

  /**
   * Retourne le nom de la machine.
   *
   * @return le nom de la machine
   */
  public NomMachine getNom() {
    return nom;
  }

  @Override
  public String toString() {
    return ip + " " + nom;
  }

}