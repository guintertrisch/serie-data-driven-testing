
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class DataDrivenWithJunitTest {


    @ParameterizedTest
    @ValueSource(strings = {"Guinter", "Maria", "Joao"})
    public void deveMostrarValoresDoConjunto(String valor) {
        System.out.println(valor);
    }

    @ParameterizedTest
    @CsvSource({"guinter, 31",
                "banana, 2",
                "lemon lime, 2"})
    public void deveMostrarValoresDoCsv(String b, int a) {
        System.out.println(b + " - " + a);
    }

    @ParameterizedTest(name = "{index} - > nome: {0}, idade: {1}, endereço: {2}")
    @CsvFileSource(resources = "/dados.csv", numLinesToSkip = 1)
    public void deveMostrarValoresDoCsvComClasse(@AggregateWith(ConverterCsvAluno.class) Aluno aluno) {
        System.out.println(aluno.getNome() + " - " + aluno.getIdade() + " - " + aluno.getEndereco());
    }

}
