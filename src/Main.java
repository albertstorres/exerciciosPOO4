//4 - ) Crie uma classe Pessoa com atributos como nome, idade e sexo.
// Utilize um construtor para inicializar esses atributos.
import br.com.cubosacademy.exerciciospoo.quarto.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Albert", 35, "Masculino");
        System.out.println("Nome: " + pessoa.getNomePessoa());
        System.out.println("Idade: " + pessoa.getIdadePessoa());
        System.out.println("Sexo: " + pessoa.getSexoPessoa());
        pessoa.setNomePessoa("Albert Sevy");
        System.out.println("nome atualizado: " + pessoa.getNomePessoa());
    }
}