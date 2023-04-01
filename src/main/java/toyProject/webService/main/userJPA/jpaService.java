package toyProject.webService.main.userJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toyProject.webService.join.UserVO;

@Service
public class jpaService {

    @Autowired
    jpaRepository jpaRepository;

    public boolean doInsert(UserVO vo) {
        try {
            jpaRepository.save(vo);
            System.out.println("### 회원가입 성공!");
            return true;
        }catch (Exception e){
            System.out.println("### 회원가입 실패!");
            return false;
        }
    }

    public UserVO searchUser(UserVO vo){
        System.out.println("vo.getUsername() ==> "+vo.getUsername());
        System.out.println("vo.getPassword() ==> "+vo.getPassword());
        /**
         * JPA 같은 경우 VO 에 정의된 이름을 넣어야 한다니;;
         * 1번 컬럼, 2번 컬럼
         * findAllBy"1번"And"2번" 이렇게 넣어야 되는듯
         */
        // 정상 소스 findAllByUsernameAndPassword
        UserVO getUserVO = jpaRepository.findAllByUsernameAndPassword(vo.username, vo.password);

        // 오류 소스 findAllByUserAndPassword
//      UserVO getUserVO = jpaRepository.findAllByUserAndPassword(vo.username, vo.password);
        return getUserVO;
    }

}
