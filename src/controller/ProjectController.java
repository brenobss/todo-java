package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.util.List;

import model.Project;
import util.ConnectionFactory;

public class ProjectController {
	
	public void save(Project project) {
		
		String sql = "INSERT INTO projects ("
				+ "name, "
				+ "description, "
				+ "createdAt, "
				+ "updatedAt" 
				+ ") VALUES (?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement statement = null;
		
		try {
			
			conn = ConnectionFactory.getConnection();
			statement = conn.prepareStatement(sql);
			
			statement.setString(1, project.getName());
			statement.setString(2, project.getDescription());
			statement.setDate(3, new Date(project.getCreatedAt().getTime()));
			statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
			statement.execute();
		} catch (Exception e) {
			throw new RuntimeException("Erro ao salvar projeto " + e.getMessage(), e);
		} finally {
			ConnectionFactory.closeConnection(conn, statement);
		}
	}
	
	public void update(Project project) {
		
		String sql = "UPDATE projects SET "
				+ "name = ?, "
				+ "description = ?, "
				+ "createdAt = ?, "
				+ "updatedAt = ?, "
				+ "WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement statement = null;
		
		try {
			
			conn = ConnectionFactory.getConnection();
			statement = conn.prepareStatement(sql);
			
			statement.setString(1, project.getName());
			statement.setString(2, project.getDescription());
			statement.setDate(3, new Date(project.getCreatedAt().getTime()));
			statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
			statement.setInt(5, project.getId());
			statement.execute();
		} catch (Exception e) {
			throw new RuntimeException("Erro ao atualizar projeto " + e.getMessage(), e);
		} finally {
			ConnectionFactory.closeConnection(conn, statement);
		}
	}
	
	public void removeById(Integer idProject) {
		
		
	}
	
	public List<Project> getAll(){
		return null;
	}
}
