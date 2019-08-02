package lesson_6.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server {
    private Vector<ClientHandler> clients;
    private ServerSocket server = null;
    private Socket socket = null;

    public Server() {
        clients = new Vector<>();

        try {
            server = new ServerSocket(8189);
            System.out.println("Сервер запущен!");

            while (true) {
                socket = server.accept();
                setClients(clients);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void broadcastMsg(String msg) {
        for (ClientHandler o: getClients()) {
            o.sendMsg(msg);
        }
    }

    public Vector<ClientHandler> getClients() {
        return clients;
    }

    private void setClients(Vector<ClientHandler> clients) {
        this.clients = clients;
        clients.add(new ClientHandler(this, socket));
    }
}
