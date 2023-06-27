package tyres;

public class Tyre {
    private String terrain;

    private String tyreType;

    public Tyre(String terrain, String tyreType) {
        this.terrain = terrain;

        this.tyreType = tyreType;
    }

    public String getTerrain() {
        return terrain;
    }



    public String getTyreType() {
        return tyreType;
    }
}
