package Musique;

import java.util.List;

public class Morceau {
    private int number;
    private String title;
    private int length;
    private List<String> styles;

    public Morceau(int number, String title, int length, List<String> styles) {
        this.number = number;
        this.title = title;
        this.length = length;
        this.styles = styles;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List<String> getStyles() {
        return styles;
    }

    public void setStyles(List<String> styles) {
        this.styles = styles;
    }
}
