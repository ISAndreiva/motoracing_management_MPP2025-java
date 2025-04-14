package internal.andreiva.concursmotociclism;


import internal.andreiva.concursmotociclism.client.ProxyService;
import internal.andreiva.concursmotociclism.gui.GuiViewFactory;
import internal.andreiva.concursmotociclism.service.ObservableServiceInterface;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main
{
    public static void main(String[] args)
    {
        var properties = new Properties();
        try
        {
            properties.load(new FileReader("client.properties"));
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        ObservableServiceInterface service = null;
        if (properties.getProperty("server.port").isEmpty() || properties.getProperty("server.host").isEmpty())
        {
            service = new ProxyService();
        }
        else
        {
            service = new ProxyService(properties.getProperty("server.host"), Integer.parseInt(properties.getProperty("server.port")));
        }

        GuiViewFactory.setService(service);
        GuiViewFactory.launch();
    }
}
