import com.neeraj.functional.SayName;
import com.neeraj.functional.Sayable;

public class Main {
    public static void main(String[] args){
        System.out.println("HELLO JAVA 8");

        //lambda without return statement
        System.out.println("Lambda with return statement and {}");
        Sayable sayable = ()->{
            return "Hello Java Function";
        };

        System.out.println("Say able output =>"+ sayable.say());

        SayName sayName = (name)->{
            return "HELLO "+name;
        };
        System.out.println("Say Name out =>"+sayName.sayName("NEERAJ"));
        System.out.println("============================================================");
        //lambda without return statement
        System.out.println("Lambda without return statement and {}");

        Sayable sayable1 = ()-> "Hello Java Function";

        System.out.println("Say able output =>"+ sayable1.say());

        SayName sayName1 = (name)->"HELLO "+name;

        System.out.println("Say Name out =>"+sayName1.sayName("NEERAJ"));

    }
}
