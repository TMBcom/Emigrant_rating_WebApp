package org.ZGTech.EmigrantRatingWebApp.Controllers;


import org.ZGTech.EmigrantRatingWebApp.Models.TempModelClass;
import org.ZGTech.EmigrantRatingWebApp.Repos.ITempRepoClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainControllerClass {
    @Autowired
    ITempRepoClass repo;
@PostMapping("/addPerson")
    public void addPerson(@RequestBody TempModelClass person){
    repo.save(person);
}

}
