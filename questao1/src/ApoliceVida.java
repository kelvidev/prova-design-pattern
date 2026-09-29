public class ApoliceVida implements Apolice {


    public double capitalSegurado;
    public String id;
    public String cpf;

    public ApoliceVida(double capitalSegurado, String id, String cpf) {

        this.capitalSegurado = capitalSegurado;
        this.cpf = cpf;
        this.id = id;
    }


    @Override
    public double calcPremio() {
        double premio = (capitalSegurado * 0.003) /12;
        return premio;
    }

    @Override
    public void resumo() {
        System.out.println("linha" + "vida ");
        System.out.println("- Capital segurado: " + capitalSegurado);
        System.out.println("identidade" + id);
        System.out.println("cpf" + cpf);
        System.out.println("- Prêmio mensal: " + calcPremio());
    }

}
