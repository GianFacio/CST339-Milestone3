package com.gcu.model;

import java.text.SimpleDateFormat;
/**
 * To create exercise plans and actual exercise results
 * @author Jess Larson
 *
 */
public class ExerciseModel {
	private String name;//name of exercise
	private String type;//strength, aerobic, balance, flexibility, etc
	private String location;//location of exercise
	private int weight;//amount of weight lifted
	private int reps;//repetitions of exercise
	private int time;//minutes of aerobic exercise, for example, running a mile in 6 min
	private int distance;//mile distance of aerobic exercise, for example run 1 mile
	private SimpleDateFormat date;//date of exercise
	
	public ExerciseModel() {

	}
	/**
	 * ExerciseModel constructor.  To create exercise plans and actual exercise results
	 * 
	 * @param name
	 * @param type
	 * @param location
	 * @param weight
	 * @param reps
	 * @param time
	 * @param distance
	 * @param date
	 */
	public ExerciseModel(String name, String type, String location, int weight, int reps, int time, int distance,
			SimpleDateFormat date) {
		this.name = name;
		this.type = type;
		this.location = location;
		this.weight = weight;
		this.reps = reps;
		this.time = time;
		this.distance = distance;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getReps() {
		return reps;
	}
	public void setReps(int reps) {
		this.reps = reps;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public SimpleDateFormat getDate() {
		return date;
	}
	public void setDate(SimpleDateFormat date) {
		this.date = date;
	}
}
