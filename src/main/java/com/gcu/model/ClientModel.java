package com.gcu.model;

/**
 * Create client objects
 * @author Jess Larson
 *
 */
public class ClientModel {
	private String firstName;
	private String lastName;
	private int age;
	private int weight;
	private int height;//inches
	private String username;
	private String password;
	private ExerciseModel exercisePlan;//keeps track of exercise plan in database
	private ExerciseModel exerciseHistory;//keeps track of actual exercise history in database

	
	public ClientModel() {
		
	}
	/**
	 * ClienModel constructor used to create client objects
	 * 
	 * @param firstName String
	 * @param lastName String
	 * @param age int
	 * @param weight int
	 * @param height int
	 * @param username String
	 * @param password String
	 */
	public ClientModel(String firstName, String lastName, int age, 
			int weight, int height, String username, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.weight = weight;
		this.height = height;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getQuantity() {
		return weight;
	}
	public void setQuantity(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
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
	public ExerciseModel getExercisePlan() {
		return exercisePlan;
	}
	public void setExercisePlan(ExerciseModel exercisePlan) {
		this.exercisePlan = exercisePlan;
	}
	public ExerciseModel getExerciseHistory() {
		return exerciseHistory;
	}
	public void setExerciseHistory(ExerciseModel exerciseHistory) {
		this.exerciseHistory = exerciseHistory;
	}
}
