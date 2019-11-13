package Musique;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String title;
    private int year;
    private String group;
    private List<Morceau> morceaux;

    public Album(String title, int year, String group, List<Morceau> morceaux) {
        this.title = title;
        this.year = year;
        this.group = group;
        this.morceaux = morceaux;
    }

    public int numberOfMorceaux()
    {
        return morceaux.size();
    }

    public int totalLength()
    {
        int length = 0;
        for(Morceau m : getMorceaux())
        {
            length += m.getLength();
        }

        return length;
    }

    public List<String> allStyles()
    {
        List<String> styles = new ArrayList<String>();
        for(Morceau m : getMorceaux())
        {
            for(String s : m.getStyles())
            {
                if(!styles.contains(s))
                    styles.add(s);
            }
        }

        return styles;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<Morceau> getMorceaux() {
        return morceaux;
    }

    public void setMorceaux(List<Morceau> morceaux) {
        this.morceaux = morceaux;
    }
}
