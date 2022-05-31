
public class Cliente {

	private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String dataNascimento;
    private String email;

    
	public Cliente(String nome, String endereco, String telefone, String cpf, String dataNascimento, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public String getNome() {
		return nome;
	}

    public String getEndereco() {
        return endereco;
    }

    public void atualizarEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void atualizarTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void atualizarEmail(String email) {
        this.email = email;
    }

    
}