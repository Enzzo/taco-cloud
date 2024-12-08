package ru.vasilev.repository;

import java.util.List;
import java.util.Optional;

import ru.vasilev.entity.Ingredient;

public interface IngredientRepository {
	List<Ingredient> findAll();
	Optional<Ingredient> findById(String id);
	Ingredient save(Ingredient ingredient);
}