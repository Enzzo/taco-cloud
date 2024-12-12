package ru.vasilev.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class IngredientUDT {
	private final String name;
	private final Ingredient.Type type;
}