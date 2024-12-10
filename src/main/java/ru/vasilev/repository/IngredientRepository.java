package ru.vasilev.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import ru.vasilev.entity.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String>{
	
}