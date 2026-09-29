public class VidaFactory implements ApoliceFactory {
    @Override
    public Apolice criarApolice() {
        return new ApoliceVida(100000, "algum identificador", "algum identificador");
    }

}
