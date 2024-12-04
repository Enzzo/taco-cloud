package ru.vasilev.entity;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {
	@NotNull
	@Size(min=5, message="Name must be at least 5 characters long")
	public String name;
	
	@NotNull
	@Size(min=1, message="You must choose at least 1 ingredient")
	public List<Ingredient> ingredients;	
}