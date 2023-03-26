package toyProject.webService.login;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor // 기본생성자 생성
@Getter
@Setter
@Entity
@Table(name="employee")
public class joinVO {

    @Id // pk 지정
    @Column(name="id") // 필드와 컬럼 매핑
    public String id;

    @Column(name="username")
    public String username;

    @Column(name="email")
    public String email;

    @Column(name="password")
    public String password;

}
