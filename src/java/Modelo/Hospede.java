package Modelo;

/**
 *
 * @author Gabriel Quadrado
 */
public class Hospede{
    private String nome;
    private int idade;
    private String sexo;
    private String status;
    private int id;

    public Hospede(String nome, int idade, String sexo, String status) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.status = status;
    }
    
    public Hospede() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}