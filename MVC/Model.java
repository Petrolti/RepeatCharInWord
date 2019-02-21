package test.MVC;
/** 
* Created Petrolti, 2019
* Build programm calculate characters for the patern Model-View-Controler
* This class Model - main logic module
*/
import java.util.HashMap;
import java.util.Set;

class Model extends HashMap {
    private HashMap <String,Integer> repeat; 						//creating an output store

    Model(String str) {												//constructor class`s
        repeat = r(str);											//initialisation output store
    }

    private HashMap r (String strR){								//metod calculate simbols from input word
        repeat = new HashMap<String,Integer>(0);					//zero-length map initialization 
        for(int i = 0; i < strR.length(); i++){						//in loop view all simbols input word
            int score = 1;
            String S = strR.substring(i,i+1);						//each character is selected from the input word for analysis
            if(repeat.containsKey(S)) score = repeat.get(S)+1; 		//if map contains character level up score
            repeat.put(S,score);									//write the result of counting repeated characters
        }
        return repeat;
    }

    @Override
    public Set keySet() {
        return repeat.keySet();
    }

    @Override
    public Object get(Object key) {
        return repeat.get(key);
    }

    @Override
    public Set<Entry> entrySet() {
        return super.entrySet();
    }
}
