import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class connectionBD {
    public static void main(String[] args) {
        // Informations de connexion à la base de données
        String url = "jdbc:mysql://localhost:3306/biblio"; 
        String user = "root"; // Votre utilisateur MySQL (par défaut : root)
        String password = ""; // Votre mot de passe MySQL (vide par défaut sur WAMP)

        // Tentative de connexion
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connexion réussie à la base de données !");
        } catch (SQLException e) {
            System.err.println("Erreur de connexion : " + e.getMessage());
  }
 }

}