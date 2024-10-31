package tech.davidmateus.alertacomunidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.davidmateus.alertacomunidade.entities.User;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
