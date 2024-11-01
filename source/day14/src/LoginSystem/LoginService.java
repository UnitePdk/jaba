package LoginSystem;

public class LoginService {
    public void login(String ID, String password) /* throws UserIDNotFoundException*/{
        try{
        if(!ID.equals("user01")){
            throw new UserIDNotFoundException("아이디가 일치하지 않습니다.");}

        if(!password.equals("1234")){
            throw new PasswordMismatchException("비밀번가 일치하지 않습니다.");}
}catch(Exception e) {
            System.out.println(e);

        }
    }
}