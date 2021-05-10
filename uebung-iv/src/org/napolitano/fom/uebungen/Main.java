package org.napolitano.fom.uebungen;

import java.math.BigDecimal;
import java.util.*;

/**
 * Übung IV:
 *
 * Schreiben Sie ein Programm, dass die Daten von einem Mitglied im Segelclub abfragt und diese im Anschluss auf der
 * Konsole ausgibt.Verwenden Sie angemessene Datentypen.
 *
 * Folgende Daten sind wichtig:
 *
 * ▪ Name
 * ▪ Alter
 * ▪ Einkommen
 * ▪ Geschlecht
 * ▪ Mitgliedsstatus
 */
public class Main {

    /**
     * Main part der Applikation. Abfrage der Werte und anschließende Ausgabe
     * @param args
     */
    public static void main(String[] args) {

        System.out.printf("Segelclub 'Steife Briese' - Mitgliedserfassung%n");
        System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n%n");

        System.out.printf("Bitte geben Sie die Daten des Mitglieds ein:%n%n");

        try {
            String name = getName();
            int alter = getAlter();
            BigDecimal einkommen = getEinkommen();
            Geschlecht geschlecht = getGeschlecht();
            Mitgliedsstatus mitgliedsstatus = getMitgliedsstatus();

            Mitglied m = new Mitglied(name, alter, einkommen, geschlecht, mitgliedsstatus);

            showMitglied(m);

        } catch (Exception ex) {
            System.out.printf("%n%n/!\\ Die Ausführung des Programms wurde wegen eines Fehlers abgebrochen%n%nFehlermeldung: %s%n%n", ex.getMessage());
        }
    }

    /**
     * Abfrage des Namens über die Standardeingabe
     * @return
     */
    private static String getName() {
        System.out.printf("%n%nBitte geben Sie den vollen Namen des Mitglieds ein%n");
        System.out.printf("Die Eingabe wird mit der <Enter>-Taste abgeschlossen.%n%n");

        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    /**
     * Abfrage des Alters über die Standardeingabe
     * Warnung: Keine Fehlerprüfung!
     * @return
     */
    private static int getAlter() {
        System.out.printf("%n%nBitte geben Sie das Alter des Mitglieds in ganzen Jahren ein (z.B. 38)%n");
        System.out.printf("Die Eingabe wird mit der <Enter>-Taste abgeschlossen.%n%n");

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    /**
     * Abfrage des Alters über die Standardeingabe
     * Warnung: Keine Fehlerprüfung!
     * @return
     */
    private static BigDecimal getEinkommen() {
        System.out.printf("%n%nBitte geben Sie das Einkommen des Mitglieds ohne Währungseinheit ein (z.B. 12345,67)%n");
        System.out.printf("Die Eingabe wird mit der <Enter>-Taste abgeschlossen.%n%n");

        Scanner sc = new Scanner(System.in);
        return sc.nextBigDecimal();
    }

    /**
     * Abfrage des Geschlechts über die Standardeingabe
     * Warnung: Hier gibt es keine Fehlerbehandlung!
     * @return Geschlecht
     */
    private static Geschlecht getGeschlecht() {
        int i = 0;
        int anzahlGeschlechter = Geschlecht.values().length-1;

        System.out.printf("%n%nBitte wählen Sie das Geschlecht aus den folgenden Optionen (0 - %d)%n", anzahlGeschlechter);
        System.out.printf("Die Eingabe wird mit der <Enter>-Taste abgeschlossen.%n%n");

        for(Geschlecht enumEintrag : Geschlecht.values()) {
            System.out.printf("%d: %s%n", i++, enumEintrag);
        }

        System.out.printf("%nIhre Eingabe (0 - %d): ", anzahlGeschlechter);
        Scanner sc = new Scanner(System.in);

        return Geschlecht.values()[sc.nextInt()];
    }

    /**
     * Abfrage des Mitgliedsstatus
     * Warnung: Hier gibt es keine Fehlerbehandlung!
     * @return Geschlecht
     */
    private static Mitgliedsstatus getMitgliedsstatus() {
        int i = 0;
        int anzahlStatus = Mitgliedsstatus.values().length-1;

        System.out.printf("%n%nBitte wählen Sie den Mitgliedsstatus aus den folgenden Optionen (0 - %d)%n", anzahlStatus);
        System.out.printf("Die Eingabe wird mit der <Enter>-Taste abgeschlossen.%n%n");

        for(Mitgliedsstatus enumEintrag : Mitgliedsstatus.values()) {
            System.out.printf("%d: %s%n", i++, enumEintrag);
        }

        System.out.printf("%nIhre Eingabe (0 - %d): ", anzahlStatus);
        Scanner sc = new Scanner(System.in);

        return Mitgliedsstatus.values()[sc.nextInt()];
    }

    private static void showMitglied(Mitglied mitglied) {
        System.out.printf("%n%nDaten des erfassten Mitglieds%n");
        System.out.printf("-----------------------------%n%n");

        System.out.printf("Name:            %s%n", mitglied.getName());
        System.out.printf("Alter:           %d Jahre%n", mitglied.getAlter());
        System.out.printf("Einkommen:       %s%n", mitglied.getEinkommen().toString());
        System.out.printf("Geschlecht:      %s%n", mitglied.getGeschlecht());
        System.out.printf("Mitgliedsstatus: %s%n", mitglied.getMitgliesdsstatus());
   }

}
