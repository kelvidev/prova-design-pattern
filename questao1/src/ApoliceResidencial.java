public class ApoliceResidencial implements Apolice {

    public double valor;
    public String id;
    public String cpf;

    public ApoliceResidencial(double valorImovel,String id, String cpf) {
        this.valor = valorImovel;
        this.id = id;
        this.cpf = cpf;
    }

    @Override
    public double calcPremio() {
        double premio = valor * 0.015; 

        return premio / 12; 
    }

    @Override
    public void resumo() {
        System.out.println("linha" + "residencial");
        System.out.println("Valor do imóvel:" + valor);
        System.out.println("identidade:" + id);
        System.out.println("cpf:" + cpf);
    }

}
