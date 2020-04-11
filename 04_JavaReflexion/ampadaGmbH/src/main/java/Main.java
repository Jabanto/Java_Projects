import com.ampada.railservice.Service.RailService;

public class Main {

    public static void main(String[] args) {

        RailService service0 = new RailService("ABC");
        RailService service1 = new RailService("AD");
        RailService service2 = new RailService("ADC");
        RailService service3 = new RailService("AEBCD");
        RailService service4 = new RailService("AED");
        RailService service5 = new RailService();

        service0.getRouteDistance();
        service1.getRouteDistance();
        service2.getRouteDistance();
        service3.getRouteDistance();
        service4.getRouteDistance();
        service5.numberOfTrips("C");

    }

}
