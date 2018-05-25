
package soap.pkg4;

import javax.xml.ws.Endpoint;


public class SOAP4 {

   
    public static void main(String[] args) {
      
        Endpoint ep = Endpoint.create(new PersonServiceImpl());
                ep.publish("http://localhost:8080/yesildeniz");
                
         
                
        
    }
    
}
