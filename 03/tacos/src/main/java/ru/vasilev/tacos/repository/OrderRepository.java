package ru.vasilev.tacos.repository;

import ru.vasilev.tacos.entity.TacoOrder;

public interface OrderRepository {
	TacoOrder save(TacoOrder order);
}
