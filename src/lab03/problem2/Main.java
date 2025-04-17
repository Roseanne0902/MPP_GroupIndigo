package lab03.problem2;


public class Main {
    public static void main(String[] args) {
        Landlord landlord = new Landlord("Dahlia");
        landlord.addBuilding("B001", 200.78);
        landlord.addBuilding("B002", 123.98);
        landlord.addBuilding("B003", 500.00);

        for (Building build : landlord.getBuilding()) {
            if (build.getBuildingnum().equals("B001")) {
                build.addApartment("A001", 600.00);
                build.addApartment("A002", 1000.00);
            }
        }

        System.out.println("The profit that landlord " + landlord.getName() + " achieve for one month is "
                + landlord.calculateProfit());
    }
}