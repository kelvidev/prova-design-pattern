public class Cliente {
    public void contratarApolice(ApoliceFactory factory) {
        Apolice apolice = factory.criarApolice();
        apolice.calcPremio();
        apolice.resumo();
    }
    
}
