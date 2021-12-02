package Homework7;

public class Animals {

    private String color;
    private String nickname;
    private String subClass;
    private int weight;
    private String Voice;

    public Animals(String color, String nickname, String subClass, int weight, String Voice) {
        this.nickname = color;
        this.nickname = color;
        this.weight = weight;
        this.Voice = Voice;
    }

    @Override

    public String toString() {
        return nickname + Voice;
    }
}
