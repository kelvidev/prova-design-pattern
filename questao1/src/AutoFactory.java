public class AutoFactory implements ApoliceFactory {
    @Override
    public Apolice criarApolice() {
        return new ApoliceAuto(10000, "aaaaaaaa", "bbbbbbbbb");
    }

}
