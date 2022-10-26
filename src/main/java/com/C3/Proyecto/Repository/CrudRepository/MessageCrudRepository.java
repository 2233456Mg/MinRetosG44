package com.C3.Proyecto.Repository.CrudRepository;


import com.C3.Proyecto.Entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
