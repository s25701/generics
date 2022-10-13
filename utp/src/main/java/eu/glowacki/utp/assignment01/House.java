package main.java.eu.glowacki.utp.assignment01;

public class House implements IDeeplyCloneable<House>, IAggregable<House, Integer> {

    private String realestate;
    private int construction;

    public House() {
    }

    public House(String realestate, int construction) {
        this.realestate = realestate;
        this.construction = construction;

    }

    @Override
    public Integer aggregate(Integer intermediateResult) {
        if (intermediateResult == null) {
            return construction;
        }
        if (construction > intermediateResult) {
            return intermediateResult;
        } else {
            return construction;
        }
    }

    @Override
    public House deepClone() {
        House newHouse = new House(this.realestate, this.construction);
        return newHouse;
    }

    public void setRealestate(String realestate) {
        this.realestate= realestate;
    }

    public void setConstruction(int construction) {
        this.construction = construction;
    }


    public String getRealestate() {
        return realestate;
    }

    public int getConstruction() {
        return construction;
    }

}
