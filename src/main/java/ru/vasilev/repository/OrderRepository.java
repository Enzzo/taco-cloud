package ru.vasilev.repository;

import ru.vasilev.entity.TacoOrder;

public interface OrderRepository {
	TacoOrder save(TacoOrder order);
}