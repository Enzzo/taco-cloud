package ru.vasilev.tacos.repository;

import java.util.Optional;

import ru.vasilev.tacos.entity.Ingredient;

public interface IngredientRepository {
	Iterable<Ingredient> findAll();
	
	Optional<Ingredient> findById(String id);
	
	Ingredient save(Ingredient ingredient);
}