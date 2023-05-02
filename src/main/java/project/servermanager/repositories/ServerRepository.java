package project.servermanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import project.servermanager.models.Server;

//Server is the model that we want to manipulate and Long is the type of the primary key of that model.
public interface ServerRepository extends JpaRepository<Server, Long> {
    //Name of the method is important here. It will SELECT s FROM server WHERE ipAddress = ?
    Server findByIpAddress(String ipAddress);
}
