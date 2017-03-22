package net.udp;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by vgrinyov.
 *
 * The implementation of client which call server
 */
public class EchoClient {
    // UDP port to which service is bound
    private static final int SERVICE_PORT = 23;
    // Max size of packet
    private static final int BUFSIZE = 256;

    public static void main(String args[]) throws IOException {
        if (args.length != 1)
        {
            System.err.println ("Syntax - java EchoClient hostname");
            return;
        }
        String hostname = args[0];
// Get an InetAddress for the specified hostname
        InetAddress addr = null;
        try
        {
// Resolve the hostname to an InetAddr
            addr = InetAddress.getByName(hostname);
        }
        catch (UnknownHostException uhe)
        {
            System.err.println ("Unable to resolve host");
            return;
        }
        try
        {
// Bind to any free port
            DatagramSocket socket = new DatagramSocket();
// Set a timeout value of two seconds
            socket.setSoTimeout (2 * 1000);
            for (int i = 1 ; i <= 10; i++)
            {
// Copy some data to our packet
                String message = "Packet number " + i ;
                char[] cArray = message.toCharArray();
                byte[] sendbuf = new byte[cArray.length];
                for (int offset = 0; offset <
                        cArray.length ; offset++)
                {
                    sendbuf[offset] = (byte)
                            cArray[offset];
                }
// Create a packet to send to the UDPserver
                DatagramPacket sendPacket = new
                        DatagramPacket(sendbuf,
                        cArray.length, addr, SERVICE_PORT);
                System.out.println ("Sending packet to " +
                        hostname);
// Send the packet
                socket.send (sendPacket);
                long startCountTime = System.currentTimeMillis();
                System.out.print ("Waiting for packet.... ");
// Create a small packet for receiving UDP packets
                byte[] recbuf = new byte[BUFSIZE];
                DatagramPacket receivePacket = new
                        DatagramPacket(recbuf, BUFSIZE);
// Declare a timeout flag
                boolean timeout = false;
// Catch any InterruptedIOException that is thrown
// while waiting to receive a UDP packet
                try
                {
                    socket.receive (receivePacket);
                }
                catch (InterruptedIOException ioe)
                {
                    timeout = true;
                }
                if (!timeout)
                {
                    long finishCountTime = System.currentTimeMillis();
                    System.out.println ("packet received!");
                    System.out.println ("Details : " +
                            receivePacket.getAddress());
                    System.out.println("time delay - " + (finishCountTime - startCountTime));
// Obtain a byte input stream to read the
// UDP packet
                    ByteArrayInputStream bin = new
                            ByteArrayInputStream (
                            receivePacket.getData(), 0,
                            receivePacket.getLength() );
// Connect a reader for easier access
                    BufferedReader reader = new
                            BufferedReader (
                            new InputStreamReader( bin ) );
                    // Loop indefinitely
                    for (;;)
                    {
                        String line = reader.readLine();
// Check for end of data
                        if (line == null)
                            break;
                        else
                            System.out.println (line);
                    }
                }
                else
                {
                    System.out.println ("packet lost!");
                }
// Sleep for a second, to allow user to see packet
                try
                {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) { }
            }
        }
        catch (IOException ioe)
        {
            System.err.println ("Socket error " + ioe);
        }
    }
}
