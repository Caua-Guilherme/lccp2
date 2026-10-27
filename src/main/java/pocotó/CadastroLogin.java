package pocotó;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class CadastroLogin {
    List<String> logins = new ArrayList<>();
    List<String> senhas = new ArrayList<>();

    public void cadastrar(String login, String senha) {
        logins.add(login);
        senhas.add(senha);
    }

    public boolean verificar(String login, String senha) {
        int posicao = logins.indexOf(login);
        if(posicao == -1){
            return false;
        }
        return senhas.get(posicao).equals(senha);
    }

}
