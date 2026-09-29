public class ApoliceAuto implements Apolice {

    public double valorVeiculo;
    public String cnh;
    public String crlv;

    public ApoliceAuto(double valorveiculo, String cnh, String crlv) {
        this.valorVeiculo = valorveiculo;
        this.cnh = cnh;
        this.crlv = crlv;
    }

    @Override
    public double calcPremio() {
        double premio = valorVeiculo * 0.08;
        return premio / 12; 
    }

    @Override
    public void resumo() {
        System.out.println("Valor" + valorVeiculo);
        System.out.println("Prêmio mensal" + calcPremio());
        System.out.println("cnh" + cnh);

    }

}
