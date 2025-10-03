package fr.uvsq.cprog.collex.model;

/**
 * Représente une adresse IP.
 */
@SuppressWarnings("AbbreviationAsWordInName")
public class AdresseIP {
  private final String adresse;

  /**
   * Constructeur d'une adresse IP.
   *
   * @param adresse l'adresse IP sous forme de chaîne
   */
  public AdresseIP(String adresse) {
    // valider IP
    if (!estValide(adresse)) {
      throw new IllegalArgumentException("IP invalide");
    }

    this.adresse = adresse;
  }

  /**
   * Retourne vrai si ip est valide.
   * C-a-d: 4 parties, chaque partie entre 0 et 255
   *
   * @param ip l'adresse IP à valider
   * @return true si valide, false sinon
   */
  private boolean estValide(String ip) {
    String[] parties = ip.split("\\.");

    if (parties.length != 4) {
      return false;
    }

    for (String p : parties) {
      try {
        int n = Integer.parseInt(p);
        if (n < 0 || n > 255) {
          return false;
        }
      } catch (NumberFormatException e) {
        return false;
      }
    }
    return true;
  }

  /**
   * Retourne l'adresse IP.
   *
   * @return l'adresse IP
   */
  public String getAdresse() {
    return adresse;
  }

  @Override
  public String toString() {
    return adresse;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AdresseIP)) {
      return false;
    }
    return this.adresse.equals(((AdresseIP) o).adresse);
  }

  @Override
  public int hashCode() {
    return adresse.hashCode();
  }
}
