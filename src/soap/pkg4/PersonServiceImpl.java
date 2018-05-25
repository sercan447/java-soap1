package soap.pkg4;

import javax.jws.WebService;

@WebService(endpointInterface = "soap.pkg4.PersonServiceI")
public class PersonServiceImpl implements PersonServiceI {

    @Override
    public Person getPerson(Integer id) {
        
        return PersonUtil.getPerson(id);
    }
    
    
}
