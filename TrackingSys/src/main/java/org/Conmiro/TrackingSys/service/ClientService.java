package org.Conmiro.TrackingSys.service;

import org.Conmiro.TrackingSys.models.ClientModel;

public interface ClientService {
    void create(ClientModel client);

    List<ClientModel> readAll();

    ClientModel read(int id);

    boolean update(ClientModel client, int id);

    boolean delete(int id);
}
