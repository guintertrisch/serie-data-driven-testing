import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CadastroPessoaTest {

    @ParameterizedTest
    @ValueSource(strings = {"pessoa fisica", "pessoa juridica"})
    public void deveCadastrarPessoa(String tipoPessoa) {
        System.out.println(tipoPessoa);
    }

    @ParameterizedTest
    @CsvSource({"Guinter,pessoa fisica",
            "Maria,pessoa juridica"})
    public void deveCadastrarPessoaETipo(String nome, String tipoPessoa) {
        System.out.println(nome + " - " + tipoPessoa
        );
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dados_usuario.csv", numLinesToSkip = 1)
    public void deveMostrarDadosArquivoExterno(String nome, String tipoPessoa) {
        System.out.println(nome + "- " + tipoPessoa);
    }


}
