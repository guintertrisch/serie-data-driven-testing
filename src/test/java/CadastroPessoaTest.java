import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CadastroPessoaTest {


    @ParameterizedTest
    @ValueSource(strings = {"pessoa fisica", "pessoa juridica"})
    public void deveCadastrarPessoa(String tipoPessoa) {
        System.out.println(tipoPessoa);
    }
}
