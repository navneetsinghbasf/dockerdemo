package org.tcs.mm.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.tcs.mm.vo.VehConfig;


@Repository
public interface VehicleConfigRepository extends CrudRepository<VehConfig,String>
{	
		
    VehConfig findByvehName(String vehName); 
    
}
