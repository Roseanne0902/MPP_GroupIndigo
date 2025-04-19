package lab03.problem2;


import java.util.ArrayList;
import java.util.List;

public class Building {
    private String buildingnum;
    private Landlord landlord;
    private Double BuildingCost;
    private List<Apartment> Aparts = new ArrayList<>();

    Building(String buildingnum, Landlord landlord, Double cost){
        this.buildingnum = buildingnum;
        this.landlord = landlord;
        this.BuildingCost = cost;
    }

    public void addApartment(String apartnum, Double rent){
        Apartment apart = new Apartment(apartnum, rent, this);
        Aparts.add(apart);
    }

    public String getBuildingnum() {
        return buildingnum;
    }

    public void setBuildingnum(String buildingnum) {
        this.buildingnum = buildingnum;
    }

    public Landlord getLandlord() {
        return landlord;
    }

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }

    public List<Apartment> getAparts() {
        return Aparts;
    }

    public void setAparts(List<Apartment> aparts) {
        Aparts = aparts;
    }

    public Double getBuildingCost() {
        return BuildingCost;
    }

    public void setBuildingCost(Double buildingCost) {
        BuildingCost = buildingCost;
    }
}
