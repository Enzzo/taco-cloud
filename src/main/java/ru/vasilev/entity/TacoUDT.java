package ru.vasilev.entity;

import java.util.List;

import lombok.Data;

@Data
public class TacoUDT {
	private final String name;
	private final List<IngredientUDT> ingredients;
}