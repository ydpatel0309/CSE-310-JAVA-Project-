import java.sql.Date;
import java.time.LocalDate;

interface EmerencyService
{
    void Ambulance();
    void Police();
    void Fire();
}
abstract class Service 
{
    String name;
    long Monumber;
    String address;
    
    void Notifaction()
    {
        System.out.println(LocalDate.now());
        System.out.println("Your call is now being Recorded");
    }
    void status()
    {

    }

    class Police extends Service implements EmerencyService
    {

    }


    class EmerencyCallService
    {
        public static void main()
         {
            
        }

    }

}
