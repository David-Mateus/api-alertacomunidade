package tech.davidmateus.alertacomunidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.davidmateus.alertacomunidade.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
