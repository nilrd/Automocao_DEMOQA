package projeto.cucumber;

import static org.junit.Assert.assertEquals;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cadastrarTest {

	WebDriver driver = new ChromeDriver();

	@Given("que esteja no site: {string}")
	public void que_esteja_no_site(String string) {
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
	}

	@Given("clicar no menu {string}")
	public void clicar_no_menu(String string) {
		// Codigo JS sugerido pelo CHATGPT para forçar fechamento da propaganda do ADS
		// na pagina que atrapalhava o click
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//h5[contains(text(),'Elements')]"));
		js.executeScript("arguments[0].click();", element);

	}

	@Given("clicar no submenu {string}")
	public void clicar_no_submenu(String string) {
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();

	}

	@When("preencher o campo nome {string}")
	public void preencher_o_campo_nome(String nome) {
		driver.findElement(By.id("userName")).sendKeys(nome);

	}

	@When("preencher o campo email {string}")
	public void preencher_o_campo_email(String email) {
		driver.findElement(By.id("userEmail")).sendKeys(email);

	}

	@When("preencher o campo CurrentAddress {string}")
	public void preencher_o_campo_current_address(String address1) {
		driver.findElement(By.id("currentAddress")).sendKeys(address1);

	}

	@When("preencher o campo permanentAddress {string}")
	public void preencher_o_campo_permanent_address(String address2) {
		driver.findElement(By.id("permanentAddress")).sendKeys(address2);

	}

	@When("clicar no botao submit")
	public void clicar_no_botao_submit() {
		// Codigo sugerido pelo CHATGPT para adicionar um tempo de espera ou forçar
		// click até que o botão submit apareça
		// ao executar navegador abre com 100% de zoom e devido aos ADS da pagina não
		// clica no botão submit.

		// Tentar ocultar o iframe de anúncio que está sobrepondo o botão
		try {
			WebElement adIframe = driver
					.findElement(By.id("google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.display='none';", adIframe); // Oculta o iframe
		} catch (NoSuchElementException e) {
			// Se o iframe não for encontrado, continuar normalmente
		}

		// Tentar garantir que o botão submit esteja visível
		WebElement submitButton = driver.findElement(By.id("submit"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", submitButton); // Scroll até o botão

		// Forçar o clique com JavascriptExecutor
		js.executeScript("arguments[0].click();", submitButton); // Forçar o clique
	}

	@Then("valido as informacoes {string}")
	public void valido_as_informacoes(String cadastroRealizado) {
		// Captura o texto exibido na página e remove quebras de linha e espaços extras
		String textoPagina = driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']")).getText()
				.replaceAll("\\s+", " ").trim();

		// Normaliza a string de cadastroRealizado também, se necessário
		String cadastroEsperado = cadastroRealizado.replaceAll("\\s+", " ").trim();

		// Compara o texto capturado com o esperado
		assertEquals(cadastroEsperado, textoPagina);

		// Finaliza o driver
		driver.quit();
	}

}
