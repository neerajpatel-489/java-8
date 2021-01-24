import com.neeraj.functional.SayName;
import com.neeraj.functional.Sayable;

public class Main {
    public static void main(String[] args){
        System.out.println("HELLO JAVA 8");

        Sayable sayable = ()->{
            return "Hello Java Function";
        };

        System.out.println("Say able output =>"+ sayable.say());

        SayName sayName = (name)->{
            return "HELLO "+name;
        };

        System.out.println("Say Name out =>"+sayName.sayName("NEERAJ"));

    }
}
