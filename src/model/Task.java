package model;

import java.util.Date;

public class Task {
	
	private Integer id;
	private Integer idProject;
	private String name;
	private String description;
	private Boolean completed;
	private String notes;
	private Date deadline;
	private Date createdAt;
	private Date updated;
	
	public Task(Integer id, Integer idProject, String name, String description, Boolean completed, String notes, Date deadline, Date createdAt,
			Date updated) {
		this.id = id;
		this.idProject = idProject;
		this.name = name;
		this.description = description;
		this.completed = completed;
		this.notes = notes;
		this.deadline = deadline;
		this.createdAt = createdAt;
		this.updated = updated;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdProject() {
		return idProject;
	}

	public void setIdProject(Integer idProject) {
		this.idProject = idProject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Override
	public String toString() {
		return "Task [name=" + name + ", description=" + description + ", completed=" + completed + ", notes=" + notes
				+ ", deadline=" + deadline + ", createdAt=" + createdAt + ", updated=" + updated + "]";
	}
	
}
