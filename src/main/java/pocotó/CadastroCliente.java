package pocotó;

import java.util.ArrayList;
import java.util.List;

public class CadastroCliente {
    List<String> clientes = new ArrayList<>();

    public void cadastrarClientes(String cliente){
        clientes.add(cliente);
    }
    public verificarClientes(String cliente){
        if(String cliente in clientes ){
            System.out.println("cliente ja cadastrado");
        }
        else{
            System.out.println("cliente nao encontrado");
        }

    }



}
