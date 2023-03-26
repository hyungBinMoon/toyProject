package toyProject.webService.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class joinService {

    @Autowired
    joinRepository joinRepository;

    public void doInsert(joinVO vo) {joinRepository.save(vo);}

}
