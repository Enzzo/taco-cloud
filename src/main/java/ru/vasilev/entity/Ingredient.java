package ru.vasilev.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Ingredient {	
	
	private String id;
	private String name;
	private Type type;
	
	public Ingredient(String id, String name, Type type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}

	public enum Type{
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}
	
	public Type getType() {
		return type;
	}
}