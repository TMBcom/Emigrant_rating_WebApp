package org.Conmiro.TrackingSys.Service;

import org.Conmiro.TrackingSys.Models.ClientModel;

import java.util.List;

public interface IClientService {
    void create(ClientModel client);

    List<ClientModel> readAll();

    ClientModel read(int id);

    void update(ClientModel client);

    void delete(int id);

}
