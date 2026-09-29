public class ResidencialFactory implements ApoliceFactory {
    @Override
    public Apolice criarApolice() {
        return new ApoliceResidencial(500000, "algumidentificador","algumidentificador" );
    }

}
