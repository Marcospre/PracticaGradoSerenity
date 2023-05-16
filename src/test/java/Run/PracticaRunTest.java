package Run;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin = {"pretty"},
		features="src/test/resources/features/compras.feature",
		tags="@CompraOrdenadores",
		glue= {"Step"}
	
		)
public class PracticaRunTest {

}

