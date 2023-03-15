public class ServiceStation implements checkRepear {
    public static void main(String[] args) {
        ServicedEquipment car1 = new Car("car1", 4);
        ServicedEquipment car3 = new Car("car3", 4);

        ServicedEquipment truck1 = new Truck("truck1", 6);
        ServicedEquipment truck2 = new Truck("truck2", 8);

        Bicycle bicycle1 = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServicedEquipment[] servicedEquipments = new ServicedEquipment[5];
        servicedEquipments[0] = new Car("car5", 4);
        servicedEquipments[1] = new Bicycle("bibi", 2);

        checkRepear.check(car1, null, null);
        checkRepear.check(null, null, truck1);
        checkRepear.check(null, bicycle2, null);
        checkRepear.check(servicedEquipments[0], null, null);
        checkRepear.check(null, servicedEquipments[1], null);


    }
}