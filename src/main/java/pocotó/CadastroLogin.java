package pocotó;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class CadastroLogin {
    List<String> logins = new ArrayList<>();
    List<String> senhas = new ArrayList<>();
    public void cadastrar(Scanner olhar) {
        Scanner ler = new Scanner(System.in);

        String novoLogin = "sim";
        do {
            System.out.println("Crie seu login: ");
            String login = ler.next();
            System.out.println("Crie a sua senha: ");
            String senha = ler.next();

            logins.add(login);
            senhas.add(senha);

            System.out.println("Deseja adicionar outro login?: ");
            novoLogin = ler.next();
        }while(novoLogin.equalsIgnoreCase("sim"));
        ler.close();
    }
    public boolean verificar(String login, String senha) {
        int posicao = logins.indexOf(login);
        if(posicao == -1){
            return false;
        }
        return senhas.get(posicao).equals(senha);
    }

}
