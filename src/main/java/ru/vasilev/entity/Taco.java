package ru.vasilev.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Table
public class Taco {
	@Id
	private Long id;

	@NotNull
	@Size(min = 5, message = "Name must be at least 5 characters long")
	public String name;

	private Date createdAt = new Date();

	@Size(min = 1, message = "You must choose at least 1 ingredient")
	public List<Ingredient> ingredients = new ArrayList<>();

	public void addIngredient(Ingredient ingredient) {
		this.ingredients.add(ingredient);
	}
}