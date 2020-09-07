package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	
	@Given("Abrir Login")
	 public void abrir_Chrome() {
		 System.out.println("En este paso abre el navegador google chrome");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\cvillalm\\Downloads\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://localhost:8080/Evaluacion2ClaudiaVillalobos/Index.jsp");
	}
	 
	 @When("ingresar username {string} y userpass {string}")
	 public void ingresar_username_y_password(String string, String string2) {
		 System.out.println("En este paso ingresa las credenciales de usuario");
		 System.out.println("Este paso ingresa al nombre de usuario y contraseña en la pagina de login");
		 driver.findElement(By.id("username")).sendKeys(string);
		 driver.findElement(By.id("userpass")).sendKeys(string2);
		 
	 }

	 @Then("inicia sesion")
	 public void inicia_sesion() {
		 System.out.println("En este paso inicia sesion con los datos ingresados desde nuestro archivo Mytest.feature");
		 driver.findElement(By.id("loginbtn")).click();
	 }

	 @Given("Abrir Login Blank")
	 public void abrir_ChromeBlank() {
		 System.out.println("En este paso abre el navegador google chrome");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\cvillalm\\Downloads\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://localhost:8080/Evaluacion2ClaudiaVillalobos/Index.jsp");
	}
	 
	 @When("ingresar username vacio y userpass vacio")
	 public void ingresar_username_y_passwordBlank() {
		 System.out.println("En este paso ingresa las credenciales de usuario");
		 System.out.println("Este paso ingresa al nombre de usuario y contraseña en la pagina de login");
		 driver.findElement(By.id("username")).sendKeys("");
		 driver.findElement(By.id("userpass")).sendKeys("");
		 
	 }

	 @Then("inicia sesion Blank")
	 public void inicia_sesionBlank() {
		 System.out.println("En este paso inicia sesion con los datos ingresados desde nuestro archivo MyTestBlank.feature");
		 driver.findElement(By.id("loginbtn")).click();
	 }

	 @Given("Abrir Login wrong")
	 public void abrir_ChromeWrong() {
		 System.out.println("En este paso abre el navegador google chrome");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\cvillalm\\Downloads\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://localhost:8080/Evaluacion2ClaudiaVillalobos/Index.jsp");
	}
	 
	 @When("ingresar username {string} y userpass {string} wrong")
	 public void ingresar_username_y_passwordWrong(String string, String string2) {
		 System.out.println("En este paso ingresa las credenciales de usuario erroneos");
		 System.out.println("Este paso ingresa al nombre de usuario y contraseña erroneos en la pagina de login");
		 driver.findElement(By.id("username")).sendKeys(string);
		 driver.findElement(By.id("userpass")).sendKeys(string2);
		 
	 }

	 @Then("inicia sesion wrong")
	 public void inicia_sesionWrong() {
		 System.out.println("En este paso muestra un mensaje de error");
		 driver.findElement(By.id("loginbtn")).click();
	 }
}
