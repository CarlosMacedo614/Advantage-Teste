package registroSteps;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import registroPage.CreateAccount;

public class RegistroSteps{
	CreateAccount create = new CreateAccount();
	
	
@Given("que eu esteja no formulario de abertura de conta {string}")
public void que_eu_esteja_no_formulario_de_abertura_de_conta(String string) {
create.navegador("http://advantageonlineshopping.com/", "ChROME",
"acessando site da loja"); }

	@When("preencher os dados obrigatorios")
	public void preencher_os_dados_obrigatorios() throws InterruptedException {
		create.menuUser();
	  create.criarConta("Carlos", "carlosadriana10@hotmail.com", "112200aA", "112200aA", "Carlos", "Macedo", "11940474037", "Brazil", "Sao Paulo", "r. cachoeira dos indio n 105", "SP", "03818-110");
	}

	@Then("a conta sera gerada")
	public void a_conta_sera_gerada() throws IOException {
	   create.evdenciaScreen("RegistroOk");
	   create.fechar("#####_Teste feito com sucesso_#####");
	}
}
