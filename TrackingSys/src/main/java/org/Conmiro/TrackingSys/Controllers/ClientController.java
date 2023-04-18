package org.Conmiro.TrackingSys.Controllers;

import org.Conmiro.TrackingSys.Models.ClientModel;
import org.Conmiro.TrackingSys.Service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    private final IClientService clientService;

    @Autowired
    public ClientController(IClientService IClientService){
        this.clientService = IClientService;
    }

    @PostMapping(value = "/clients")
    public ResponseEntity<?> create(@RequestBody ClientModel client){
        clientService.create(client);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/clients")
    public List<ClientModel> read(){
        final List<ClientModel> clients = clientService.readAll();

//        return clients != null && !clients.isEmpty()
//                ? new ResponseEntity<>(clients, HttpStatus.OK)
//                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return clients;
    }

    @GetMapping(value = "/clients/{id}")
    public ResponseEntity<ClientModel> read(@PathVariable(name = "id") int id){
        final ClientModel client = clientService.read(id);
        return client != null
                ? new ResponseEntity<>(client, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/clients/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody ClientModel client){
        clientService.update(client);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }

    @DeleteMapping(value = "/clients/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id,  @RequestBody ClientModel client){
        clientService.delete(id);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }
}
