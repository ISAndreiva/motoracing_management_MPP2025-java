package internal.andreiva.concursmotociclism.server;

import internal.andreiva.concursmotociclism.service.ObservableServiceInterface;
import java.net.Socket;

public class ConcurrentServer extends AbstractServer
{
    private final ObservableServiceInterface service;

    public ConcurrentServer(int port, ObservableServiceInterface service)
    {
        super(port);
        this.service = service;
    }

    public ConcurrentServer(ObservableServiceInterface service)
    {
        super();
        this.service = service;
    }

    @Override
    protected void handleClient(Socket client)
    {
        var thread = new Thread(new ClientWorker(service, client));
        thread.start();
    }
}
