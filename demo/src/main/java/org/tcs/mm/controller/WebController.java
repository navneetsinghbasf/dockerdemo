package org.tcs.mm.controller;


import java.util.ArrayList;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tcs.mm.repo.VehicleConfigRepository;
import org.tcs.mm.vo.VehConfig;


/** 
 * version : 1.0
 * This class loads Vehicle configuration Controller
 *  
 *  
 *  
 **/

@RestController
public class WebController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	VehicleConfigRepository repository;
	
	@RequestMapping("/save")
    public String process(){	
	
		
        repository.save(new VehConfig("Vehicle1" , "api-dev.devicewise.com", "api-dev.device.com", "airtelgprs.com", 120, 99.99, 11.11, 11.11, 11.11, "919958364169" ,"DL9CAP8950", 120, 120, "356362050910763", 0x18));
        repository.save(new VehConfig("Vehicle2" , "api-dev.devrcewise.com", "api-dkv.device.com", "airtelgfrs.com", 130, 99.99, 11.51, 11.61, 11.21, "919958364149" ,"DL9CAP8950", 120, 120, "356362050910763", 0x12));
        repository.save(new VehConfig("Vehicle3" , "api-dev.devecewise.com", "api-dgv.device.com", "airtelgqrs.com", 140, 99.99, 11.21, 11.71, 11.31, "919958364159" ,"DL9CAP8950", 120, 120, "356362050910763", 0x15));
        repository.save(new VehConfig("Vehicle4" , "api-dev.devgcewise.com", "api-div.device.com", "airtelgsrs.com", 150, 99.99, 11.31, 11.81, 11.41, "919958364189" ,"DL9CAP8950", 120, 120, "356362050910763", 0x16));
        
        return "Done";
    }
       
       
	@RequestMapping("/findall")   
    public ArrayList<VehConfig> findAll(){       
        ArrayList<VehConfig> list = new ArrayList<VehConfig>();
           
        for(VehConfig veh : repository.findAll()){            
            list.add(veh);
            logger.info("Fetching the vehName in Database"+veh.getVehName());
        }  
       
        return list;
    }
       
    
    @RequestMapping("/findbyvehName")
    public VehConfig fetchDataByLastName(@RequestParam("vehName") String vehName){
           
        VehConfig veh= repository.findByvehName(vehName);
        System.out.println("----------->"+veh);
            System.out.println("******");
            logger.info("Fetching the configuration details for vehName"+veh);
            return veh;
    }
    
    @PutMapping("/saveConfig")    
    public ResponseEntity<Object> saveConfigData(@RequestBody VehConfig veh) {
    	logger.info("Fetching the configuration details for the vehicle"+veh);
    	System.out.println(veh);
    	System.out.println(veh.getAlert()+veh.getpIpaddr());
    	System.out.println("Hello");    	
    	repository.save(veh);
		return ResponseEntity.status(HttpStatus.OK).build();
    }
    
    @PostMapping("/newConfig")
    public ResponseEntity<Object> newConfigData(@RequestBody VehConfig veh) {
    	System.out.println(veh);
    	logger.info("Fetching the configuration details for NewVehName"+veh);
    	if(veh.getVehName()==""||veh.getpIpaddr()==""||veh.getsIpaddr()==""||veh.getAPN()==""||
    			veh.getSleepTime()==null||veh.getOverSpeedLimit()==null||veh.getHarseAccThreshold()==null || veh.getRashTurnThreshold()==null||
    			veh.getHarseAccThreshold()==null || veh.getSmsCenterNumber()==null || veh.getVehRegNumber()=="" || veh.getFrqDataTrans()==null ||
    			veh.getTmeDuration()==null || veh.getImei()=="" )
    	{
    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    	}
    	else
    	{    		
    	  repository.save(new VehConfig(veh.getVehName(),veh.getpIpaddr(),veh.getsIpaddr(),veh.getAPN(),veh.getSleepTime(),veh.getOverSpeedLimit(),veh.getHarseAccThreshold(),
    			  veh.getRashTurnThreshold(), veh.getHarseAccThreshold(), veh.getSmsCenterNumber(),veh.getVehRegNumber(), veh.getFrqDataTrans(),veh.getTmeDuration(),
    			  veh.getImei(),veh.getAlert()));
		  return ResponseEntity.status(HttpStatus.CREATED).build();
    	}
    }
    
    @DeleteMapping("/deleteConfig")
    public ResponseEntity<Object> deleteConfigData(@RequestParam("vehName") String vehName) {
    	System.out.println(vehName);
    	logger.info("Log the vehicle to be removed"+vehName);
    	if(vehName=="")
    	{
    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();	
    	}
    	else
    	{
    	  repository.deleteById(vehName);
    	  return ResponseEntity.status(HttpStatus.OK).build();
    	}
    }   
   

}
