package dmacc.beans;

import jakarta.persistence.Embeddable;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Dec 13, 2023
 */
@Embeddable
public class Performers {
	private String name;
	private String gender;
	private String favoriteFood;
	
	public Performers() {
		super();
	}

	public Performers(String name, String gender, String favoriteFood) {
		super();
		this.name = name;
		this.gender = gender;
		this.favoriteFood = favoriteFood;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	@Override
	public String toString() {
		return "Performers [name=" + name + ", gender=" + gender + ", favoriteFood=" + favoriteFood + "]";
	}

}
