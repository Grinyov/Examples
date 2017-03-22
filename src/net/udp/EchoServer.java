package net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by vgrinyov.
 *
 * The implementation of server which emulate host with open telnet using 23 port
 */
public class EchoServer {

        // UDP port to which service is bound
        private static final int SERVICE_PORT = 23;
        // Max size of packet, large enough for almost any client
        private static final int BUFSIZE = 4096;
        // Socket used for reading and writing UDP packets
        private DatagramSocket socket;
        public EchoServer()
        {
            try
            {
// Bind to the specified UDP port, to listen
// for incoming data packets
                socket = new DatagramSocket( SERVICE_PORT );
                System.out.println ("Server active and listen on port " +
                        socket.getLocalPort() );
            }
            catch (Exception e)
            {
                System.err.println ("Unable to bind port");
            }
        }
        public void serviceClients() {
// Create a buffer large enough for incoming packets
            byte[] buffer = new byte[BUFSIZE];
            for (; ; ) {
                try {
// Create a DatagramPacket for reading
// UDP packets
                    DatagramPacket packet = new DatagramPacket
                            (buffer, BUFSIZE);
// Receive incoming packets
                    socket.receive(packet);
                    System.out.println("Packet received from " +
                            packet.getAddress() + ":" +
                            packet.getPort() +
                            " of length " + packet.getLength());
// Echo the packet back - address and port
// are already set for us !
                    socket.send(packet);

                } catch (IOException ioe) {
                    System.err.println("Error : " + ioe);
                }
            }
        }
}
