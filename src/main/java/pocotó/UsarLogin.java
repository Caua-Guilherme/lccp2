package pocotó;
import java.sql.SQLOutput;
import java.util.Scanner;

public class UsarLogin {
    public static void main(String[] args) {
        Scanner olhar = new Scanner(System.in);
        CadastroLogin cadastro = new CadastroLogin();
        String novoLogin = "sim";
        do {
            System.out.println("Crie seu login: ");
            String login = olhar.nextLine();

            System.out.println(login);

            System.out.println("Crie a sua senha: ");
            String senha = olhar.nextLine();

            System.out.println(senha);

            cadastro.cadastrar(login, senha);

            System.out.println("Deseja adicionar outro login?: ");
            novoLogin = olhar.nextLine();

            System.out.println(novoLogin);
        }while(novoLogin.equalsIgnoreCase("sim"));

        System.out.println("digite o login a ser verificado: ");
        String loginVerificar = olhar.nextLine();
        System.out.println("digite a senha a ser verificada: ");
        String senhaVerificar = olhar.nextLine();

        if (cadastro.verificar(loginVerificar, senhaVerificar)){
            System.out.println("login realizado com sucesso");
           }
            else{
            System.out.println("login invalido");}

        olhar.close();

    }
}
