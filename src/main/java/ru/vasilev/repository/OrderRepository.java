package ru.vasilev.repository;

import org.springframework.data.repository.CrudRepository;

import ru.vasilev.entity.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {}