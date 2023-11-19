package com.libraryManagment.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import  java.sql.SQLException;
public class databaseConnection {
    public static void main(String[] args) {
        // Récupérer les informations de connexion à partir des variables d'environnement
        String url = System.getenv("DATABASE_URL");
        String utilisateur = System.getenv("DATABASE_USER");
        String motDePasse = System.getenv("DATABASE_PASSWORD");

        // Vérifier si les informations de connexion sont présentes
        if (url == null || utilisateur == null || motDePasse == null) {
            System.err.println("Les informations de connexion ne sont pas définies.");
            return;
        }

        // Établir la connexion
        try (Connection connexion = DriverManager.getConnection(url, utilisateur, motDePasse)) {
            // La logique de votre application va ici
            System.out.println("Connexion réussie !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
