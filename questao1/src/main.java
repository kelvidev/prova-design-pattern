public class main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        ApoliceFactory vidaFactory = new VidaFactory();
        cliente.contratarApolice(vidaFactory);

        ApoliceFactory residencialFactory = new ResidencialFactory();
        cliente.contratarApolice(residencialFactory);

        ApoliceFactory ApoliceAuto = new ApoliceAutoFactory();
        cliente.contratarApolice(ApoliceAuto);


    }

}
