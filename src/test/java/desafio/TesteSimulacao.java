package desafio;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.DriveManager;

public class TesteSimulacao {
    private DriveManager driver;
    private Simulador simulador;
    private WebDriverWait wait;

    private By mensagemErroInvestir = By.id("valorInvestir-error");
    private By mensagemErroAplicar = By.id("valorAplicar-error");
    private By resultadoSimulacao = By.xpath("//div[@class='blocoResultadoSimulacao']");
    private By mensagemErroTempo = By.id("tempo-error");


    @Before
    public void setUp() {

        driver = new DriveManager(System.getProperty("browserName"));
        wait = new WebDriverWait(driver.getDriver(), 5);
        simulador = new Simulador(driver.getDriver(), wait);
    }

    @Test
    public void DeveConcluiSimulacaoDeInvestimentoParaVoceTempoAno() {

        simulador.RadioParaVoce();
        simulador.labelValorAplicar("50.000,00");
        simulador.labelValorInvestir("100,00");
        simulador.labelTempoQueQuerPoupar("15");
        simulador.buttonSelectTempo();
        simulador.selectAno();
        simulador.buttonSimularInvestimento();
        validaResultadoSimulacao();
    }

    @Test
    public void DeveConcluiSimulacaoDeInvestimentoParaVoceTempoMes() {

        simulador.RadioParaVoce();
        simulador.labelValorAplicar("50.000,00");
        simulador.labelValorInvestir("100,00");
        simulador.labelTempoQueQuerPoupar("15");
        simulador.buttonSelectTempo();
        simulador.selectMes();
        simulador.buttonSimularInvestimento();
        validaResultadoSimulacao();
    }

    @Test
    public void DeveConcluiSimulacaoDeInvestimentoParaEmpresaTempoMes() {

        simulador.RadioParaEmpresa();
        simulador.labelValorAplicar("100.000,00");
        simulador.labelValorInvestir("100,00");
        simulador.labelTempoQueQuerPoupar("15");
        simulador.buttonSelectTempo();
        simulador.selectMes();
        simulador.buttonSimularInvestimento();
        validaResultadoSimulacao();
    }

    @Test
    public void DeveConcluiSimulacaoDeInvestimentoParaEmpresaTempoAno() {

        simulador.RadioParaEmpresa();
        simulador.labelValorAplicar("100.000,00");
        simulador.labelValorInvestir("100,00");
        simulador.labelTempoQueQuerPoupar("15");
        simulador.buttonSelectTempo();
        simulador.selectAno();
        simulador.buttonSimularInvestimento();
        validaResultadoSimulacao();
    }

    @Test
    public void DeveConcluiSimulacaoDeInvestimentoComValorAplicarMinimo() {

        simulador.RadioParaEmpresa();
        simulador.labelValorAplicar("20,00");
        simulador.labelValorInvestir("100,00");
        simulador.labelTempoQueQuerPoupar("15");
        simulador.buttonSelectTempo();
        simulador.selectMes();
        simulador.buttonSimularInvestimento();
        validaResultadoSimulacao();
    }

    @Test
    public void DeveConcluiSimulacaoDeInvestimentoComValorAplicarMaximo() {

        simulador.RadioParaEmpresa();
        simulador.labelValorAplicar("9.999.999,00");
        simulador.labelValorInvestir("100,00");
        simulador.labelTempoQueQuerPoupar("15");
        simulador.buttonSelectTempo();
        simulador.selectMes();
        simulador.buttonSimularInvestimento();
        validaResultadoSimulacao();
    }

    @Test
    public void DeveConcluiSimulacaoDeInvestimentoComValorInvestirMaximo() {

        simulador.RadioParaEmpresa();
        simulador.labelValorAplicar("100.000,00");
        simulador.labelValorInvestir("9.999.999,00");
        simulador.labelTempoQueQuerPoupar("15");
        simulador.buttonSelectTempo();
        simulador.selectMes();
        simulador.buttonSimularInvestimento();
        validaResultadoSimulacao();
    }

    @Test
    public void DeveConcluiSimulacaoDeInvestimentoComValorInvestirMinimo() {

        simulador.RadioParaEmpresa();
        simulador.labelValorAplicar("100.000,00");
        simulador.labelValorInvestir("20,00");
        simulador.labelTempoQueQuerPoupar("15");
        simulador.buttonSelectTempo();
        simulador.selectMes();
        simulador.buttonSimularInvestimento();
        validaResultadoSimulacao();
    }

    @Test
    public void DeveApresentarErroAoInformarValorAplicarMenorQueMinimo() {

        simulador.labelValorAplicar("19,99");
        simulador.buttonSimularInvestimento();
        validaMensagemErroAplicarComValorMinimo();
    }

    @Test
    public void DeveApresentarErroAoInformarValorAplicarMaiorQueMaximo() {

        simulador.labelValorAplicar("9.999.999,99");
        simulador.buttonSimularInvestimento();
        validaMensagemErroAplicaromValorMaximo();
    }

    @Test
    public void DeveApresentarErroAoInformarValorInvestirMenorQueMinimo() {

        simulador.labelValorInvestir("19,99");
        simulador.buttonSimularInvestimento();
        validaMensagemErroInvestirComValorMinimo();
    }

    @Test
    public void DeveApresentarErroAoInformarValorInvestirMaiorQueMaximo() {

        simulador.labelValorInvestir("9.999.999,99");
        simulador.buttonSimularInvestimento();
        validaMensagemErroInvestirComValorMaximo();
    }

    @Test
    public void DeveApresentarErroNaoInformandoTempo() {

        simulador.labelTempoQueQuerPoupar("");
        simulador.buttonSimularInvestimento();
        validaMensagemDeErroTempoObrigatorio();
    }

    @Test
    public void DeveApresentarErroInformandoTempoEmMesesMinimo() {

        simulador.labelTempoQueQuerPoupar("0");
        simulador.selectMes();
        simulador.buttonSimularInvestimento();
        validaMensagemDeErroComMesesMinimo();
    }

    @Test
    public void DeveApresentarErroInformandoTempoEmAnoMinimo() {

        simulador.labelTempoQueQuerPoupar("0");
        simulador.buttonSelectTempo();
        simulador.selectAno();
        simulador.buttonSimularInvestimento();
        validaMensagemDeErroComAnoMinimo();
    }

    @Test
    public void DeveApresentarErroInformandoTempoEmAnoMaximo() {

        simulador.labelTempoQueQuerPoupar("100");
        simulador.buttonSelectTempo();
        simulador.selectAno();
        simulador.buttonSimularInvestimento();
        validaMensagemDeErroComAnoMaximo();
    }

    @Test
    public void DeveLimparFormularioPreenchido() {

        simulador.RadioParaVoce();
        simulador.labelValorAplicar("50.000,00");
        simulador.labelValorInvestir("100,00");
        simulador.labelTempoQueQuerPoupar("15");
        simulador.buttonSelectTempo();
        simulador.selectAno();
        simulador.buttonLimparFormulario();
        Assert.assertTrue(simulador.getAplicarValor().isEmpty());
        Assert.assertTrue(simulador.getInvestirValor().isEmpty());
        Assert.assertTrue(simulador.getITempoQueQuerPoupar().isEmpty());
    }

   @After
    public void closePage() {

        driver.endSession();
    }

    public void validaMensagemErroInvestirComValorMinimo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mensagemErroInvestir));
        Assert.assertEquals("Valor mínimo de 20.00", driver.getDriver().findElement(mensagemErroInvestir).getText());
    }

    public void validaMensagemErroInvestirComValorMaximo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mensagemErroInvestir));
        Assert.assertEquals("Máximo de 9999999.00", driver.getDriver().findElement(mensagemErroInvestir).getText());
    }

    public void validaMensagemErroAplicarComValorMinimo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mensagemErroAplicar));
        Assert.assertEquals("Valor mínimo de 20.00", driver.getDriver().findElement(mensagemErroAplicar).getText());
    }

    public void validaMensagemErroAplicaromValorMaximo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mensagemErroAplicar));
        Assert.assertEquals("Máximo de 9999999.00", driver.getDriver().findElement(mensagemErroAplicar).getText());
    }

    public void validaResultadoSimulacao() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(resultadoSimulacao));
        Assert.assertNotNull(resultadoSimulacao);
    }

    public void validaMensagemDeErroComMesesMinimo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mensagemErroTempo));
        Assert.assertEquals("Valor esperado não confere", driver.getDriver().findElement(mensagemErroTempo).getText());
    }

    public void validaMensagemDeErroTempoObrigatorio() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mensagemErroTempo));
        Assert.assertEquals("Obrigatório", driver.getDriver().findElement(mensagemErroTempo).getText());
    }

    public void validaMensagemDeErroComAnoMinimo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mensagemErroTempo));
        Assert.assertEquals("Valor esperado não confere", driver.getDriver().findElement(mensagemErroTempo).getText());
    }

    public void validaMensagemDeErroComAnoMaximo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mensagemErroTempo));
        Assert.assertEquals("Valor esperado não confere", driver.getDriver().findElement(mensagemErroTempo).getText());
    }

}