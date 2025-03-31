package my.hoty.lab1xx.service;

import my.hoty.lab1xx.model.Client;
import my.hoty.lab1xx.model.Role;

import java.util.List;

public interface ClientService {
    boolean save(Client client);
    Client findByUsername(String name);
    List<Client> findAll();
    void updateClientRole(String username, String roleName);
}
