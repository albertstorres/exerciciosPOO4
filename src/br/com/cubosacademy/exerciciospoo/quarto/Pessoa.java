package br.com.cubosacademy.exerciciospoo.quarto;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa (String nomePessoa, int idadePessoa, String sexoPessoa) {
        this.nome = nomePessoa;
        this.idade = idadePessoa;
        this.sexo = sexoPessoa;
    }

    public String getNomePessoa () {
        return this.nome;
    }
    public int getIdadePessoa () {
        return this.idade;
    }
    public String getSexoPessoa () {
        return this.sexo;
    }

    public void setNomePessoa (String novoNomePessoa) {
        this.nome = novoNomePessoa;
    }
    public void setSexoPessoa (String novoSexoPessoa) {
        this.sexo = novoSexoPessoa;
    }
}
