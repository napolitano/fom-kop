package org.napolitano.fom.uebungen;

import java.util.*;

/**
 * Übung IV:
 *
 * Schreiben Sie ein Programm, dass die Daten von einem Mitglied im Segelclub abfragt und diese im Anschluss
 * auf der Konsole ausgibt.Verwenden Sie angemessene Datentypen.
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

    public static void main(String[] args) {

        String name;
        int alter;
        double einkommen;
        char geschlecht;
        char mitgliedsstatus;

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Segelclub - Mitglied anlegen");
            System.out.print("Bitte den Namen eingeben (<enter> zum abschließen): ");
            name = sc.nextLine();

            System.out.print("Bitte das Alter in ganzen Jahren eingeben (<enter> zum abschließen): ");
            alter = sc.nextInt();

            System.out.print("Bitte das Einkommen eingeben - z.B. 12345,67 (<enter> zum abschließen): ");
            einkommen = sc.nextDouble();

            System.out.print("Bitte das Geschlecht eingeben - m = Männlich, w = Weiblich, d = Divers (<enter> zum abschließen): ");
            geschlecht = sc.next().toLowerCase(Locale.ROOT).toCharArray()[0];

            System.out.print("Bitte den Mitgliedsstatus ein - k = Kein Mitglied, m = Mitglied (<enter> zum abschließen): ");
            mitgliedsstatus = sc.next().toLowerCase(Locale.ROOT).toCharArray()[0];

            System.out.printf("%n%nDaten des Mitglieds:%n%nName: %s%nAlter: %d%nEinkommen: %.2f%nGeschlecht: %s%nMitgliedsstatus: %s%n",name,alter,einkommen,geschlecht,mitgliedsstatus);


        } catch (Exception ex) {
            System.out.printf("%n%nDas Programm wurde wegen eines Fehlers beendet.%nFehler: %s", ex.getMessage());
        }
    }
}
