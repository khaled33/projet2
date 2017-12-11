package com.exem.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.exem.bdd.bdd;
import com.exem.beans.rapport;


public class DaoRapImpli implements DaoRap<rapport> {
	
	Connection connect =bdd.getInstance();
	@Override
	public rapport ajout(rapport obj) {
				
		String query="INSERT INTO `rapports` (`id_rapport`, `Id_user`,`titre_rapport`, `nom_etudi`, `prenom_etudiant`, `rapport`, `annee_rapport`,`branche_etudes`,`mention_rapport`,`description`)"
				+ " VALUES (NULL, ?, ?, ?, ?, ?, ?,?,?,?)";
		
		try {
			PreparedStatement  prepdStmt = (PreparedStatement) connect.prepareStatement(query);
			prepdStmt.setInt(1, obj.getId_user());
			prepdStmt.setString(2, obj.getTitre_rapport());
			prepdStmt.setString(3, obj.getNom_etudi());	
			prepdStmt.setString(4, obj.getPrenom_etudiant());
			prepdStmt.setString(5, obj.getRapport());
			prepdStmt.setString(6, obj.getAnnee_rapport());
			prepdStmt.setString(7, obj.getBranche_etudes());
			prepdStmt.setString(8, obj.getMention_rapport());
			prepdStmt.setString(9, obj.getDescription());
System.out.println("ok");
			
			prepdStmt.execute(); 
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public rapport modifer (rapport obj) {
		
		String query ="UPDATE `rapports` SET "+"`titre_rapport` = ?, "	+"`nom_etudi` = ?, "+"`prenom_etudiant` = ? ,"+ "`rapport` = ?, "+ "`annee_rapport` = ?, " + "`branche_etudes` = ?, "+ "`mention_rapport` = ?, "+"`description`=?		"
				+ " WHERE "
				+ "`id_rapport` = ?";
		
		try {
			PreparedStatement  prepdStmt = connect.prepareStatement(query);
			prepdStmt.setString(1, obj.getTitre_rapport());
			prepdStmt.setString(2, obj.getNom_etudi());
			prepdStmt.setString(3, obj.getPrenom_etudiant());
			prepdStmt.setString(4, obj.getRapport());
			prepdStmt.setString(5, obj.getAnnee_rapport());
			prepdStmt.setString(6, obj.getBranche_etudes());
			prepdStmt.setString(7, obj.getMention_rapport());
			prepdStmt.setString(8, obj.getDescription());
			prepdStmt.setInt(9, obj.getId_rapport());

			

			
			
			prepdStmt.execute(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<rapport> list() {
		List<rapport> list=new ArrayList<rapport>();
		String query = "SELECT * FROM `rapports`";
		try {
			Statement stmt=(Statement) connect.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()){
				rapport s =new rapport();
				
				s.setId_rapport(rs.getInt("id_rapport"));
				s.setId_user(rs.getInt("Id_user"));
				s.setTitre_rapport(rs.getString("titre_rapport"));
				s.setNom_etudi(rs.getString("nom_etudi"));
				s.setPrenom_etudiant(rs.getString("prenom_etudiant"));
				s.setTitre_rapport(rs.getString("rapport"));
				s.setAnnee_rapport(rs.getString("annee_rapport"));
				s.setBranche_etudes(rs.getString("branche_etudes"));
				s.setMention_rapport(rs.getString("mention_rapport"));
				s.setDescription(rs.getString("description"));
				System.out.println(s.toString());
				
				
				list.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	
	
	
	
	@Override
	public rapport recherche(int id) {
		// TODO Auto-generated method stub
		return null;
	}}

	