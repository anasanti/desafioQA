package desafio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Simulador {
    private WebDriver driver;
    private WebDriverWait wait;

    private By radio = By.name("perfil");
    private By valorAplicar = By.id("valorAplicar");
    private By valorInvestir = By.id("valorInvestir");
    private By tempoPoupar = By.id("tempo");
    private By selecionarTempo = By.xpath("//form[@id='formInvestimento']/div[4]/div[2]/div[2]/a/span[4]");
    private By periodoMes = By.linkText("Meses");
    private By periodoAno = By.linkText("Anos");
    private By limparFormulario = By.linkText("Limpar formulário");
    private By simularInvestimento = By.xpath("//button[@type='submit']");


    public Simulador(WebDriver drive, WebDriverWait wait) {
        this.driver = drive;
        this.wait = wait;
    }

    public void RadioParaVoce(){
        wait.until(ExpectedConditions.elementToBeClickable(radio));
        driver.findElements(radio).get(0).click();
    }

    public void RadioParaEmpresa(){
        wait.until(ExpectedConditions.elementToBeClickable(radio));
        driver.findElements(radio).get(1).click();
    }

    public void labelValorAplicar(String valor){
        driver.findElement(valorAplicar).sendKeys("value",valor);
    }

    public String getAplicarValor(){
        return driver.findElement(valorAplicar).getText();
    }

    public void labelValorInvestir(String valor){
        driver.findElement(valorInvestir).sendKeys("value",valor);
    }

    public String getInvestirValor(){
        return driver.findElement(valorInvestir).getText();
    }

    public void labelTempoQueQuerPoupar(String valor){
        driver.findElement(tempoPoupar).sendKeys("value",valor);
    }

    public String getITempoQueQuerPoupar(){
        return driver.findElement(tempoPoupar).getText();
    }

    public void buttonSelectTempo(){
        wait.until(ExpectedConditions.elementToBeClickable(selecionarTempo));
        driver.findElement(selecionarTempo).click();
    }

    public void selectMes(){
        wait.until(ExpectedConditions.elementToBeClickable(periodoMes));
        driver.findElement(periodoMes).click();
    }

    public void selectAno(){
        wait.until(ExpectedConditions.elementToBeClickable(periodoAno));
        driver.findElement(periodoAno).click();
    }

    public void buttonLimparFormulario(){
        wait.until(ExpectedConditions.elementToBeClickable(limparFormulario));
        driver.findElement(limparFormulario).click();
    }

    public void buttonSimularInvestimento(){
        wait.until(ExpectedConditions.elementToBeClickable(simularInvestimento));
        driver.findElement(simularInvestimento).click();
    }



}
