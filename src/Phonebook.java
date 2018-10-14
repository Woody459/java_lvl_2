
import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    public String name;
    public String number;
   static Map<String, String> map = new HashMap<>();

    public Phonebook(){

    }


    public void add(String name, String number_){

if (map.containsKey(name) ){
    this.number = number_ +  "\n" + map.get(name);
}
else {
    this.number = number_;
}


map.put(name, this.number);
    }
    public void get(String name_){

        System.out.println(name_ + ": \n"+ map.get(name_));


    }
}
