package subsistema.cep;

public class CepApi {

    private static CepApi cepApi = new CepApi();
    private CepApi() {}
    public static CepApi getInstance() {
        return cepApi;
    }
    public String recuperarCidade(String cep) {
        return "Recife";
    }
    public String recuperarEstado(String cep) {
        return "PE";
    }
}
