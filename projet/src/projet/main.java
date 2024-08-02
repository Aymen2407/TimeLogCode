package projet;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("d32c85cb-4ee1-498d-9881-2bc59cd4b5f3")
public class main {

    public static boolean login(String username, String password) {
        return username.equals("admin") && password.equals("admin");
    }

    public static void choixOpperation(int choix) {
        String result;

        switch (choix) {
            case 1:
                result = "Début d'activité";
                saveDebutActivitesToJsonFile();
                break;
            case 2:
                result = "Fin d'activité";
                saveFinActivitesToJsonFile();
                break;
            case 3:
                result = "Quitter";
                System.out.println("L'action sélectionnée est : " + result);
                System.exit(0);
                break;
            default:
                result = "Action invalide. Veuillez réessayer.";
                System.out.println(result);
                return;
        }

        System.out.println("L'action sélectionnée est : " + result);
    }

    public static void saveDebutActivitesToJsonFile() {
        activite[] activites = {
            new activite(1, 101, 1001, "Engineering", "08:00", ""),
            new activite(2, 102, 1002, "Marketing", "09:00", ""),
            new activite(3, 103, 1003, "Design", "10:00", "")
        };

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("debutactivites.json"), activites);
            System.out.println("Les données ont été enregistrées dans debutactivites.json.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveFinActivitesToJsonFile() {
        activite[] activites = {
            new activite(1, 101, 1001, "Engineering", "08:00", "16:00"),
            new activite(2, 102, 1002, "Marketing", "09:00", "17:00"),
            new activite(3, 103, 1003, "Design", "10:00", "18:00")
        };

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("finactivites.json"), activites);
            System.out.println("Les données ont été enregistrées dans finactivites.json.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String user;
        String password;
        boolean isAuthenticated = false;
        Scanner scanner = new Scanner(System.in);

        while (!isAuthenticated) {
            System.out.println("Veuillez entrer votre nom d'utilisateur :");
            user = scanner.next();
            System.out.println("Veuillez entrer votre mot de passe :");
            password = scanner.next();

            if (login(user, password)) {
                System.out.println("Connexion réussie !");
                isAuthenticated = true;
            } else {
                System.out.println("Nom d'utilisateur ou mot de passe incorrect. Veuillez réessayer.");
            }
        }

        while (true) {
            System.out.println("Veuillez sélectionner une action :");
            System.out.println("1: Début d'activité");
            System.out.println("2: Fin d'activité");
            System.out.println("3: Quitter");
            int action = scanner.nextInt();

            choixOpperation(action);

            if (action == 1 || action == 2 || action == 3) {
                break;
            }
        }

        System.out.println("Programme terminé.");
    }
}

class activite {
    public int id;
    public int projectId;
    public int employerId;
    public String discipline;
    public String heurDebut;
    public String heurFin;

    public activite(int id, int projectId, int employerId, String discipline, String heurDebut, String heurFin) {
        this.id = id;
        this.projectId = projectId;
        this.employerId = employerId;
        this.discipline = discipline;
        this.heurDebut = heurDebut;
        this.heurFin = heurFin;
    }
}