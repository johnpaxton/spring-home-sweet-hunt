package org.anitab.spring.home_sweet_hunt.models;

public class UtilitiesDetails {
    private WhoPays water;
    private WhoPays sewage;
    private WhoPays electric;    
    private WhoPays garbage;
    private WhoPays internet;
    private WhoPays heat;
    private HeatingType heatType;
    private ACType acType;

    public UtilitiesDetails (){
    }

    public UtilitiesDetails(WhoPays water, WhoPays sewage, WhoPays electric, WhoPays garbage, WhoPays heat, HeatingType heatType, ACType acType) {
        this.water = water;
        this.sewage = sewage;
        this.electric = electric;
        this.garbage = garbage;
        this.internet = internet; 
        this.heat = heat;
        this.heatType = heatType;
        this.acType = acType;
    }

    public WhoPays getWater() {
        return water;
    }
    public void setWater(WhoPays water) {
        this.water = water;
    }

    public WhoPays getSewage() {
        return sewage;
    }
    public void setSewage(WhoPays sewage) {
        this.sewage = sewage;
    }       

    public WhoPays getElectric() {
        return electric;
    }
    public void setElectric(WhoPays electric) {
        this.electric = electric;
    }   

    public WhoPays getGarbage() {
        return garbage;
    }
    public void setGarbage(WhoPays garbage) {
        this.garbage = garbage;
    }       

    public WhoPays getInternet() {
        return internet;
    }
    public void setInternet(WhoPays internet) {
        this.internet = internet;
    }   

    public WhoPays getHeat() {
        return heat;
    }
    public void setHeat(WhoPays heat) {
        this.heat = heat;       
}

    public HeatingType getHeatType() {
        return heatType;
    }
    public void setHeatType(HeatingType heatType) {
        this.heatType = heatType;
    }

    public ACType getAcType() {
        return acType;
    }
    public void setAcType(ACType acType) {
        this.acType = acType;
    }   


@Override
public String toString() {
    return "UtilitiesDetails{" +
            "water=" + water +
            ", sewage=" + sewage +
            ", electric=" + electric +
            ", garbage=" + garbage +
            ", internet=" + internet +
            ", heat=" + heat +
            ", heatType=" + heatType +
            ", acType=" + acType +
            '}';    
    }
}