package tech.davidmateus.alertacomunidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tweet extends JpaRepository<Tweet, Long> {
}
