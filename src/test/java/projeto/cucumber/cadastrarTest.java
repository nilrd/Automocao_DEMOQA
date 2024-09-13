package projeto.cucumber;

import java.time.Duration;

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

	WebDriver driver;

	@Given("que esteja no site: {string}")
	public void que_esteja_no_site(String string) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");

	}

	@Given("clicar no menu {string}")
	public void clicar_no_menu(String string) {
		//Codigo JS sugerido pelo CHATGPT para forçar fechamento da propaganda do ADS na pagina que atrapalhava o click
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//h5[contains(text(),'Elements')]"));
		js.executeScript("arguments[0].click();", element);

	}

	@Given("clicar no submenu {string}")
	public void clicar_no_submenu(String string) {
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();

	}

	@When("preencher o campo nome")
	public void preencher_o_campo_nome() {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Nilson Brites");
	}

	@When("preencher o campo email")
	public void preencher_o_campo_email() {
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("nilson.brites@QAdesucesso.com");

	}

	@When("preencher o campo CurrentAddress")
	public void preencher_o_campo_current_address() {
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Vale do Silicio, California, EUA");

	}

	@When("preencher o campo permanentAddress")
	public void preencher_o_campo_permanent_address() {
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']"))
				.sendKeys("Apple, Vale do Silicio California EUA");

	}

	@When("clicar no botao submit")
	public void clicar_no_botao_submit() {
		//Codigo sugerido pelo CHATGPT para adicionar um tempo de espera até que o botão submit apareça 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
		submitButton.click();

	}

	@Then("valido as informacoes")
	public void valido_as_informacoes() {
		String msgPrint = driver.switchTo().alert().getText();
		System.out.println(msgPrint);

	}

}
