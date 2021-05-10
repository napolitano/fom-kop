package org.napolitano.fom.uebungen;


import java.math.BigDecimal;

/**
 * Diese Klasse repräsentiert ein Mitglied
 */
public class Mitglied {
    private String Name = "";
    private int Alter; // Annahme ist: Alter in ganzen Jahren
    private BigDecimal Einkommen; // Annahme ist: Beliebiger numerischer Wert mit Nachkommastellen. Double wg. Genauigkeit
    private Geschlecht Geschlecht;
    private Mitgliedsstatus Mitgliesdsstatus;

    /**
     * Initialisierung eines neuen Mitglieds
     *
     * @param name
     * @param alter
     * @param einkommen
     * @param geschlecht
     * @param mitgliedsstatus
     */
    public Mitglied(String name, int alter, BigDecimal einkommen, Geschlecht geschlecht, Mitgliedsstatus mitgliedsstatus) {
        this.setName(name);
        this.setAlter(alter);
        this.setEinkommen(einkommen);
        this.setGeschlecht(geschlecht);
        this.setMitgliesdsstatus(mitgliedsstatus);
    }

    String getName() {
        return Name;
    }

    void setName(String name) {
        Name = name;
    }

    int getAlter() {
        return Alter;
    }

    void setAlter(int alter) {
        Alter = alter;
    }

    BigDecimal getEinkommen() {
        return Einkommen;
    }

    void setEinkommen(BigDecimal einkommen) {
        Einkommen = einkommen;
    }

    org.napolitano.fom.uebungen.Geschlecht getGeschlecht() {
        return Geschlecht;
    }

    void setGeschlecht(org.napolitano.fom.uebungen.Geschlecht geschlecht) {
        Geschlecht = geschlecht;
    }

    Mitgliedsstatus getMitgliesdsstatus() {
        return Mitgliesdsstatus;
    }

    void setMitgliesdsstatus(Mitgliedsstatus mitgliesdsstatus) {
        Mitgliesdsstatus = mitgliesdsstatus;
    }
}
