package com.C3.Proyecto.Repository.CrudRepository;

import com.C3.Proyecto.Entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
