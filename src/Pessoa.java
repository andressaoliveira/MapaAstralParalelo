import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private final String nome;
    private final String cidade;
    private final LocalDate data;
    private final Signo signo;
    private final Integer idade;
    private final String geracao;

    public Pessoa(String nome, String cidade, LocalDate data) {
        this.nome = nome;
        this.cidade = cidade;
        this.data = data;
        this.signo = Signo.getSigno(data);
        this.idade = calcularIdade(data);
        this.geracao = obterGeracao(data);
    }

    private Integer calcularIdade(LocalDate data) {
        return Period.between(data, LocalDate.now()).getYears();
    }

    private String obterGeracao(LocalDate data) {

        //- Geração (X, Y, Z ou Boomer, com base na data de nascimento)
        //Baby Boomers (1946-1964), Geração X (1965-1980), Geração Y ou Millennial (1981-1996) e Geração Z (1997-2010).

        if (!(data.isAfter(LocalDate.of(1964, 12, 31))
                || data.isBefore(LocalDate.of(1946, 1, 1)))) {
            return "Boomer";
        }
        if (!(data.isAfter(LocalDate.of(1980, 12, 31))
                || data.isBefore(LocalDate.of(1965, 1, 1)))) {
            return "X";
        }
        if (!(data.isAfter(LocalDate.of(1996, 12, 31))
                || data.isBefore(LocalDate.of(1981, 1, 1)))) {
            return "Y";
        }
        if (!(data.isAfter(LocalDate.of(2010, 12, 31))
                || data.isBefore(LocalDate.of(1997, 1, 1)))) {
            return "Z";
        }
        return "Geração não encontrada";
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public LocalDate getData() {
        return data;
    }

    public Signo getSigno() {
        return signo;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getGeracao() {
        return geracao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", data=" + data +
                ", signo=" + signo +
                ", idade=" + idade +
                ", geracao='" + geracao + '\'' +
                '}';
    }
}


//### Criar uma base de dados (pode ser em memória) de pessoas com os seguintes atributos e extrair as informações

//### Atributos
//- Nome
//- Cidade de nascimento
//- Data de nascimento
//- Signo (com base na data de nascimento)
//- Idade (com base na data de nascimento)


