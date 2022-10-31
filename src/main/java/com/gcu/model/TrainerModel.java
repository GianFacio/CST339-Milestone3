package com.gcu.model;

/**
 * Used to create trainer (admin) objects
 * 
 * @author Jess Larson
 *
 */
public class TrainerModel {
	private String firstName;
	private String lastName;
	private int id;
	private String username;
	private String password;
	
	
	public TrainerModel() {

	}
	/**
	 * TrainerModel constructor used to create trainer (admin) objects
	 * @param firstName String
	 * @param lastName String
	 * @param id int
	 * @param username String
	 * @param password String
	 */
	public TrainerModel(String firstName, String lastName, int id, String username, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
