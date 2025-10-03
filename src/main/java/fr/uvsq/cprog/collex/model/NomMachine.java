package fr.uvsq.cprog.collex.model;

/**
 * Représente un nom de machine qualifié.
 */
public class NomMachine {
  private final String nomQualifie;

  /**
   * Constructeur d'un nom de machine.
   *
   * @param nom le nom qualifié de la machine
   */
  public NomMachine(String nom) {
    if (!nom.contains(".")) {
      throw new IllegalArgumentException("Nom doit contenir au moins un point");
    }

    this.nomQualifie = nom.toLowerCase();
  }

  public String getNomMachine() {
    return nomQualifie.substring(0, nomQualifie.indexOf("."));
  }

  public String getDomain() {
    return nomQualifie.substring(nomQualifie.indexOf(".") + 1);
  }

  public String getNomQualifie() {
    return this.nomQualifie;
  }

  @Override
  public String toString() {
    return this.nomQualifie;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof NomMachine)) {
      return false;
    }
    return nomQualifie.equals(((NomMachine) o).getNomQualifie());
  }

  @Override
  public int hashCode() {
    return nomQualifie.hashCode();
  }

}