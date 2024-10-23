package object1;

public class Chair {
    private String material;
    private String color;
    private int legs;

    public Chair(String material, String color, int legs) {
        this.material = material;
        this.color = color;
        this.legs = legs;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public static void main(String[] args){
        Chair chair1 = new Chair("wood", "yellow", 4);
        Chair chair2 = new Chair("metal", "silver", 1);

        Chair[] chairs = new Chair[2];

        chairs[0] = chair1;
        chairs[1] = chair2;

        System.out.println(chair1.legs);
        System.out.println(chairs[1].material);
    }

}