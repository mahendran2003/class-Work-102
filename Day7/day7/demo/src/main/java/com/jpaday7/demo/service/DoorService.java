package com.jpaday7.demo.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.jpaday7.demo.model.Door;
import com.jpaday7.demo.repository.DoorRepo;

@Service
public class DoorService {
    public DoorRepo doorRepo;

    public DoorService(DoorRepo doorRepo) {
        this.doorRepo = doorRepo;
    }
    
    public Door post(Door door)
    {
        return doorRepo.save(door);
    }
    public List<Door> getting()
    {
        return doorRepo.findAll();
    }

    public Door getbyId(int doorId)
    {
        return doorRepo.findById(doorId).orElse(null);
    }
    
    public List<Door> getacc(String accessType)
    {
        return doorRepo.findByAccessType(accessType);
    }
}
