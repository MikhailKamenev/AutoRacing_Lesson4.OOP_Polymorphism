import Drivers.BusDriver;
import Drivers.Driver;
import Drivers.TruckDriver;
import Transport.Automobile;
import Transport.Bus;
import Transport.Car;
import Transport.Car.RingTime;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        //Упрощенное приложение для автогонок

        Automobile honda = new Automobile("Honda", "Civic", 2.0);
        RingTime hondaTimes = honda.new RingTime(222.22, 208.02, 219.47);
        honda.compareToBestRingTime(hondaTimes);
        honda.maxSpeed();
        System.out.println(honda);
        Automobile toyota = new Automobile("Toyota", "Corolla", 1.6);
        Automobile mazda = new Automobile("Mazda", "Axella", 1.5);
        Automobile nissan = new Automobile("Nissan", "Almera", 1.6);
        Bus neoplan = new Bus("Neoplan", "Megaliner", 12);
        RingTime neoplanTimes = neoplan.new RingTime(335.43, 365.76, 332.59);
        System.out.println(neoplanTimes.getBestRingTime());
        neoplan.compareToBestRingTime(neoplanTimes);
        Bus ikarus = new Bus("Ikarus", "290", 13.6);
        Bus yutong = new Bus("Yutong", "ZK6128H", 12.8);
        Bus scania = new Bus("Scania", "Touring", 12.8);
        Truck man = new Truck("Man", "TGX", 15.6);
        RingTime manTimes = man.new RingTime(298.78, 302.24, 300.01);
        man.compareToBestRingTime(manTimes);
        System.out.println(manTimes.getBestRingTime());
        Truck mercedes = new Truck("Mercedes", "Actros", 15.6);
        Truck iveco = new Truck("Iveco", "Stralis", 16);
        Truck kamaz = new Truck("Kamaz", "Dakar", 15.6);
        Driver<Automobile> petrovich = new Driver<>("Петрович", 53);
        BusDriver<Bus> mihalich = new BusDriver<>("Михалыч", 56);
        TruckDriver<Truck> sergeevich = new TruckDriver<>("Сергеич", 55);

        sergeevich.startMoving(man);
        sergeevich.stopMoving(man,manTimes);
        sergeevich.printInfoTruckDriver(man);

        petrovich.startMoving(honda);
        petrovich.stopMoving(honda,hondaTimes);
        petrovich.printInfoDriver(honda);

        mihalich.startMoving(neoplan);
        mihalich.stopMoving(neoplan,neoplanTimes);
        mihalich.printInfoDriver(neoplan);

    }
}