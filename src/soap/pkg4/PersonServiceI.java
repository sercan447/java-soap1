
package soap.pkg4;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface PersonServiceI {
   
   @WebMethod
   Person getPerson(Integer id);
   
}
