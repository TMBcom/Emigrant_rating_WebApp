package org.ZGTech.EmigrantRatingWebApp.Repos;

import org.ZGTech.EmigrantRatingWebApp.Models.TempModelClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ITempRepoClass extends JpaRepository <TempModelClass, Long> {

}
