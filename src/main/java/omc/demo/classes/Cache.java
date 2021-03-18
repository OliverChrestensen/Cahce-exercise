package omc.demo.classes;

import java.util.HashMap;
import java.util.Map;


public class Cache extends HashMap{
public Map<String,String> cache = new HashMap<>();




    public String get(String key) {
       return this.cache.get(key);
    }


    public void keySet(String key,String value) {
        this.cache.put(key,value);
    }

    @Override
    public boolean containsKey(Object key) {
        return super.containsKey(key);
    }

    @Override
    public Object remove(Object key) {
        return super.remove(key);
    }

    public void setTTL(Object key){

    }

}





