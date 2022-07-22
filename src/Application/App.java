package Application;

import java.util.List;

import controller.ProjectController;
import model.Project;

public class App {

	public static void main(String[] args) {
		
		ProjectController projectController = new ProjectController();
		
		List<Project> projects = projectController.getAll();
		
		for(Project project : projects) {
			System.out.println(project);
		}
	}

}
