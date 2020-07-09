package desafio;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.DriveManager;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class APITeste {

    @Before
    public void setUp() {

    }

    @Test
    public void deveValidarRetornoDeSimulacao() throws IOException {
        String response = getResponseEfetuarChamadaAPI();
        Assert.assertEquals(
                "{\"id\":1,\"meses\":[\"112\",\"124\",\"136\",\"148\"],\"valor\":[\"2.802\",\"3.174\",\"3.564\",\"3.971\"]}",
                response
        );
    }

    private String getResponseEfetuarChamadaAPI() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador").build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }



    @After
    public void closePage() {

    }
}
