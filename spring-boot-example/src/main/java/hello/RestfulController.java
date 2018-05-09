package hello;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class RestfulController {
    
    @RequestMapping("/rest")
    public Trade index() {
    	
    	Trade t = new Trade();
    	t.setCountry("HK");
    	t.setDealnumber("SPT181009999");
    	t.setAmount(2.3456);
    	
        return t;
    }
    
    @RequestMapping(value = "/rest/{dealnumber:[\\d]+}", method = RequestMethod.GET)
    public Trade getTrade(@PathVariable String dealnumber) {
   
      	Trade t = new Trade();
    	t.setCountry("HK");
    	t.setDealnumber(dealnumber);
    	t.setAmount(2.3456);
    	
        return t;
    }
    
}
