package pocotó;
import java.util.Scanner;

public class UsarLogin {
    public static void main(String[] args) {
        Scanner olhar = new Scanner(System.in);
        CadastroLogin cadastro = new CadastroLogin();

        cadastro.cadastrar(olhar);

            System.out.println("Digite seu login: ");
            String nlogin = olhar.next();
            System.out.println("Digite sua senha: ");
            String nsenha = olhar.next();

            if(cadastro.verificar(nlogin, nsenha)){
            System.out.println("login realizado com sucesso");
            }
            else{
            System.out.println("login invalido");
            }
        olhar.close();
    }
}
