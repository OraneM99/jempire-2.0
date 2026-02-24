public class Village {
    private int wood = 0;
    private int stone = 0;
    private int food = 100;
    private int iron = 0;
    private int gold = 50;

    public Village(int wood, int stone, int food, int iron, int gold) {
        this.wood = wood;
        this.stone = stone;
        this.food = food;
        this.iron = iron;
        this.gold = gold;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getStone() {
        return stone;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getIron() {
        return iron;
    }

    public void setIron(int iron) {
        this.iron = iron;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
