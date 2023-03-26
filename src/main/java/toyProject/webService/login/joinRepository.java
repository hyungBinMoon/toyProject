package toyProject.webService.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface joinRepository extends JpaRepository<joinVO, Long> {

}
