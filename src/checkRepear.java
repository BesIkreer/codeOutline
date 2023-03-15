public interface checkRepear {
    static void check(ServicedEquipment car, ServicedEquipment bicycle, ServicedEquipment truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                checkRepear.updateTyre();
            }
            checkRepear.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                checkRepear.updateTyre();
            }
            checkRepear.checkEngine();
            checkRepear.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                checkRepear.updateTyre();
            }
        }
    }


     static void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
