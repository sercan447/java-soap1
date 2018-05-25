
package soap.pkg4;

import java.util.HashMap;
import java.util.Map;


public class PersonUtil {
    private static Map mapi =  new HashMap();
    
    static{
        mapi.put(1, new Person(1,"A"));
        mapi.put(2, new Person(2,"B"));
        mapi.put(3, new Person(3,"C"));
        mapi.put(4, new Person(4,"D"));
        mapi.put(5, new Person(5,"E"));
       
    }
    
    private PersonUtil(){
    }
    
    public static Person getPerson(Integer id){
        return (Person) mapi.get(id);
    }
    
    
}
