package org.Conmiro.TrackingSys.Repos;

import org.Conmiro.TrackingSys.Models.ClientModel;


import java.util.List;


public interface IFileWorker {

    List<ClientModel> getClientData();
    ClientModel findClientById(Integer id);
    void add(ClientModel ClientData);
    void update(ClientModel ClientData);
    void delete(Integer id);

    }

