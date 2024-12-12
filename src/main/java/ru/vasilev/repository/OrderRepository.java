package ru.vasilev.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import ru.vasilev.entity.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, UUID> {}