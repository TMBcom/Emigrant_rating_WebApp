package org.Conmiro.TrackingSys.Service;

import org.Conmiro.TrackingSys.Models.ClientModel;
import org.Conmiro.TrackingSys.Repos.IFileWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class ClientService implements IClientService {
    @Autowired
    private IFileWorker clientDataRepository;
    @Async
    public void create(ClientModel client){
      clientDataRepository.add(client);
    }

    @Async
    public List<ClientModel> readAll(){
        return clientDataRepository.getClientData();
    }

    @Async
    public ClientModel read(int id){

        return clientDataRepository.findClientById(id);
    }

    @Async
    public void update(ClientModel client){
            clientDataRepository.update(client);
    }

    @Override
    public void delete(int id){

        clientDataRepository.delete(id);
    }
}
