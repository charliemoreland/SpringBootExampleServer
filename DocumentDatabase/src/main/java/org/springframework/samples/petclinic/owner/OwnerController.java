
package org.springframework.samples.petclinic.owner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
class OwnerController {

    @Autowired
    OwnerRepository ownersRepository;

    private final Logger logger = LoggerFactory.getLogger(OwnerController.class);

    @RequestMapping(method = RequestMethod.POST, path = "/doc/new")
    public String saveOwner(Owners owner) {
        ownersRepository.save(owner);
        return "New Owner "+ owner.getdocName() + " Saved";
    }
     // function just to create dummy data
    @RequestMapping(method = RequestMethod.GET, path = "/doc/create")
    public String createDummyData() {
        Owners o1 = new Owners(1, "tutorial", "Doe", "/doc/1", 11);
        Owners o2 = new Owners(2, "Coms309", "Doe", "/doc/2", 11);
        Owners o3 = new Owners(3, "Essay", "Pleb", "/doc/3", 77);
        Owners o4 = new Owners(4, "Homework", "Champion", "/doc/4", 2);
        ownersRepository.save(o1);
        ownersRepository.save(o2);
        ownersRepository.save(o3);
        ownersRepository.save(o4);
        return "Successfully created dummy documents";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/docs")
    public List<Owners> getAllOwners() {
        logger.info("Entered into Controller Layer");
        List<Owners> results = ownersRepository.findAll();
        logger.info("Number of Records Fetched:" + results.size());
        return results;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/doc/{docId}")
    public Optional<Owners> findOwnerById(@PathVariable("docId") int id) {
        logger.info("Entered into Controller Layer");
        Optional<Owners> results = ownersRepository.findById(id);
        return results;
    }
    @RequestMapping(method = RequestMethod.DELETE, path = "/doc/delete/{docId}")
    public String deleteOwnerById(@PathVariable("docId") int id) {
        Optional<Owners> results = ownersRepository.findById(id);
        ownersRepository.deleteById(id);
        return results.get().getdocName()+" Has been deleted";
    }
}
