package com.segurosx.repositories;
import com.segurosx.models.Cliente;

public interface ClienteRepository {

    void create(Cliente cliente);

    Cliente find(String id);

}