package ru.vasilev.repository;

import org.springframework.data.repository.CrudRepository;

import ru.vasilev.entity.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}