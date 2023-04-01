package toyProject.webService.main.userJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import toyProject.webService.join.UserVO;

@Repository
public interface jpaRepository extends JpaRepository<UserVO, Long> {

    // 정상 findAllByUsernameAndPassword
    UserVO findAllByUsernameAndPassword(String username, String password);

    // 비정상 오류 findAllByUserAndPassword
//    UserVO findAllByUserAndPassword(String username, String password);
}
