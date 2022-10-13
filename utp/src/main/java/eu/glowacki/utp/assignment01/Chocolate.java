package main.java.eu.glowacki.utp.assignment01;

public class Chocolate implements IDeeplyCloneable<Chocolate>, IAggregable<Chocolate, Integer> {

    private String choco;
    private int production;

    public Chocolate() {
    }

    public Chocolate(String choco, int production) {
        this.choco = choco;
        this.production = production;

    }

    @Override
    public Integer aggregate(Integer intermediateResult) {
        if (intermediateResult == null) {
            return production;
        }
        if (production > intermediateResult) {
            return intermediateResult;
        } else {
            return production;
        }
    }

    @Override
    public Chocolate deepClone() {
        Chocolate newChocolate = new Chocolate(this.choco, this.production);
        return newChocolate;
    }

    public void setChoco(String choco) {
        this.choco = choco;
    }

    public void setProduction(int production) {
        this.production = production;
    }


    public String getChoco() {
        return choco;
    }

    public int getProduction() {
        return production;
    }

}


