package lab3.problem2;


import java.util.ArrayList;
import java.util.List;

public class Landlord {
    private String name;
    private List<Building> building = new ArrayList<>();

    Landlord(String name){
        this.name = name;
    }

    public void addBuilding(String buildnum, Double cost){
        Building build = new Building(buildnum, this, cost);
        building.add(build);
    }

    public List<Building> getListBuilding(){
        return building;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Building> getBuilding() {
        return building;
    }

    public void setBuilding(List<Building> building) {
        this.building = building;
    }

    public Double calculateProfit(){
        Double sum = 0.0;
        Double cost = 0.0;
        for (Building build:building){
            cost+=build.getBuildingCost();
            for (Apartment apart:build.getAparts()){
                sum+=apart.getRent();
            }
        }
        return sum-cost;
    }
}
