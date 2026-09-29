
public class ApoliceAutoFactory implements ApoliceFactory {
    @Override
    public Apolice criarApolice() {
        return new ApoliceAuto(20000, "cnh aaaaa", "outro documento");
    }

}
