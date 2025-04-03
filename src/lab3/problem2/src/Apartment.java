package lab3.problem2.src;


public class Apartment {
    private String ApartNum;
    private Building building;
    private Double rent;

    Apartment(String Apartnum, Double rent, Building building){
        this.ApartNum = Apartnum;
        this.rent = rent;
        this.building = building;
    }

    public Double getRent() {
        return rent;
    }

    public void setRent(Double rent) {
        this.rent = rent;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public String getApartNum() {
        return ApartNum;
    }

    public void setApartNum(String apartNum) {
        ApartNum = apartNum;
    }
}
