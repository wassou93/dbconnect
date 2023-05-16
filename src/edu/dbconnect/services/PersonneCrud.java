package edu.dbconnect.services;

import edu.dbconnect.entities.Personne;
import edu.dbconnect.interfaces.ICrud;
import edu.dbconnect.utils.MySQLConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonneCrud implements ICrud<Personne> {

    private static final String PERSONNE_CREATE_QUERY = "INSERT INTO personne (nom, prenom) VALUES (?, ?)";
    private static final String PERSONNES_RETRIEVE_QUERY = "SELECT * FROM personne";

    @Override
    public void addEntity(Personne personne) {
        try (PreparedStatement pst = MySQLConnection.getInstance().getConnection()
                .prepareStatement(PERSONNE_CREATE_QUERY)) {
            pst.setString(1, personne.getNom());
            pst.setString(2, personne.getPrenom());
            pst.executeUpdate();
            System.out.println("Personne Added...");
        } catch (SQLException ex) {
            System.out.println("Erreur d'ajout...");
        }
    }

    @Override
    public List<Personne> displayEntities() {
        List<Personne> listePersonnes = new ArrayList<>();
        try (Statement st = MySQLConnection.getInstance().getConnection().createStatement()) {
            ResultSet rs = st.executeQuery(PERSONNES_RETRIEVE_QUERY);
            while (rs.next()) {
                Personne p = new Personne();
                p.setId(rs.getInt("id"));
                p.setNom(rs.getString("nom"));
                p.setPrenom(rs.getString("prenom"));
                listePersonnes.add(p);
            }
        } catch (SQLException ex) {
            System.out.println("Erreur de lecture...");
        }
        return listePersonnes;
    }
}
