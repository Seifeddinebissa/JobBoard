package tn.esprit.application.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.application.entities.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
