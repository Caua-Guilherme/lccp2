package pocotó;

public class Login {
    private String login;
    private String senha;

    public Login(String login, String senha){
        this.login = login;
        this.senha = senha;
   }

   public void setLogin(String login){
        this.login = login;
   }
   public void setSenha(String senha){
        this.senha = senha;
   }

    public String getSenha() {
        return senha;
    }

    public String getLogin() {
        return login;
    }
}
