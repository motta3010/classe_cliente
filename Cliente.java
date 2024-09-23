import java.util.Date;

public class Cliente {
    private int id_cliente;
    private String Nome_cli;
    //private Tipo_Documento old_Tipo_Documento;
    private int Cod_Docum;
    private int Rg_Cli;
    private String Endereço;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private String CEP;
    private int DDD_res;
    private String Tel_res;
    private int DDD_com;
    private String Tel_com;
    private int DDD_cel;
    private String Tel_cel;
    private int E_mail;
    private int Status_cli;
    private Date Data_cad_Cliente;

    public Cliente() {
    }

    // Métodos
    public void Efetua_pedido() {
        // Lógica para efetuar pedido
        System.out.println("Pedido efetuado com sucesso!");
    }

    public void Efetua_Pagamento() {
        // Lógica para efetuar pagamento
        System.out.println("Pagamento efetuado com sucesso!");
    }

    public void Cadastra_cliente() {
        // Lógica para cadastrar cliente
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void Exclui_cliente() {
        // Lógica para excluir cliente
        System.out.println("Cliente excluído com sucesso!");
    }

    public void Altera_Dados() {
        // Lógica para alterar dados do cliente
        System.out.println("Dados do cliente alterados com sucesso!");
    }

    public void Consulta_Dados() {
        // Lógica para consultar dados do cliente
        System.out.println("Consultando dados do cliente...");
    }

    // Getters e Setters (omitidos para brevidade, 
    // adicione-os conforme necessário)

    public static void main(String[] args) {
        // Criando uma instância da classe Cliente
        Cliente cliente1 = new Cliente();

        // Utilizando os métodos da classe
        cliente1.Cadastra_cliente();
        cliente1.Efetua_pedido();
        cliente1.Efetua_Pagamento();
        cliente1.Consulta_Dados();
        cliente1.Altera_Dados();
        cliente1.Exclui_cliente(); 
    }
}

