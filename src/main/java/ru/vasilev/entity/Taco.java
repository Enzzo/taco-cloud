package ru.vasilev.entity;

import java.util.List;

import lombok.Data;

@Data
public class Taco {
	public String name;
	public List<Ingredient> ingredients;	
}