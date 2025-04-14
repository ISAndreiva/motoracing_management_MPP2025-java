package internal.andreiva.concursmotociclism.gui;

import internal.andreiva.concursmotociclism.service.ObservableServiceInterface;
import internal.andreiva.concursmotociclism.service.ServiceInterface;

public class AbstractGuiController
{
    protected ObservableServiceInterface service;
    public void setService(ObservableServiceInterface service)
    {
        this.service = service;
    }
}
