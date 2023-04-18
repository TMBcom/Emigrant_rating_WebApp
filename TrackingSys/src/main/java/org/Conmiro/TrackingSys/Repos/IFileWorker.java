package org.Conmiro.TrackingSys.Repos;

import ch.qos.logback.core.net.server.Client;
import org.Conmiro.TrackingSys.Models.ClientModel;


import java.util.List;
import java.util.Map;

public interface IFileWorker {

    public List<ClientModel> getClientData();
    public ClientModel findClientById(Integer id);
    public void add(ClientModel ClientData);
    public void update(ClientModel ClientData);
    public void delete(Integer id);

    }

