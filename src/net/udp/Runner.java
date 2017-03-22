package net.udp;

/**
 * Created by vgrinyov.
 */
public class Runner {
    public static void main(String[] args) {
        EchoServer server = new EchoServer();
        server.serviceClients();
    }
}
