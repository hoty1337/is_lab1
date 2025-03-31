package my.hoty.lab1xx.repository;

import my.hoty.lab1xx.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Client, Long> {

    Client findByUsername(String username);
}
