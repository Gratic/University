package Musique;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class AlbumTest {
    @Test
    public void MorceauTest_Constructor()
    {
        Morceau m = new Morceau(1, "Titre", 133, new ArrayList<String>(Arrays.asList("Rock", "Trance")));

        assertEquals(1, m.getNumber());
        assertEquals("Titre", m.getTitle());
        assertEquals(133, m.getLength());
    }

    @Test
    public void MorceauTest_getTitle()
    {
        Morceau m = new Morceau(1, "Titre2", 133, new ArrayList<String>(Arrays.asList("Rock", "Trance")));

        assertEquals("Titre2", m.getTitle());
    }

    @Test
    public void MorceauTest_setTitle()
    {
        Morceau m = new Morceau(1, "Titre2", 133, new ArrayList<String>(Arrays.asList("Rock", "Trance")));
        m.setTitle("test");
        assertEquals("test", m.getTitle());
    }

    @Test
    public void MorceauTest_getLength()
    {
        Morceau m = new Morceau(1, "Titre2", 133, new ArrayList<String>(Arrays.asList("Rock", "Trance")));

        assertEquals(133, m.getLength());
    }

    @Test
    public void MorceauTest_setLength()
    {
        Morceau m = new Morceau(1, "Titre2", 133, new ArrayList<String>(Arrays.asList("Rock", "Trance")));
        m.setLength(120);
        assertEquals(120, m.getLength());
    }

    @Test
    public void MorceauTest_getStyles()
    {
        Morceau m = new Morceau(1, "Titre2", 133, new ArrayList<String>(Arrays.asList("Rock", "Trance")));

        assertEquals(new ArrayList<String>(Arrays.asList("Rock", "Trance")), m.getStyles());
    }

    @Test
    public void MorceauTest_setStyles()
    {
        Morceau m = new Morceau(1, "Titre2", 133, new ArrayList<String>(Arrays.asList("Rock", "Trance")));

        List<String> styles = new ArrayList<String>();
        styles.add("Dubstep");
        m.setStyles(styles);
        assertEquals(styles, m.getStyles());
    }

    @Test
    public void AlbumTest_Constructor()
    {
        List<Morceau> morceaux = new ArrayList<Morceau>();
        morceaux.add(new Morceau(1, "Titre1", 60, new ArrayList<String>(Arrays.asList("Rock"))));
        morceaux.add(new Morceau(2, "Titre2", 120, new ArrayList<String>(Arrays.asList("Rock", "Electro"))));
        Album a = new Album("AlbumTitre", 2001, "Prop", morceaux);

        assertEquals("AlbumTitre", a.getTitle());
        assertEquals(2001, a.getYear());
        assertEquals("Prop", a.getGroup());
    }

    @Test
    public void AlbumTest_getTitle()
    {
        List<Morceau> morceaux = new ArrayList<Morceau>();
        morceaux.add(new Morceau(1, "Titre1", 60, new ArrayList<String>(Arrays.asList("Rock"))));
        morceaux.add(new Morceau(2, "Titre2", 120, new ArrayList<String>(Arrays.asList("Rock", "Electro"))));
        Album a = new Album("AlbumTitre", 2001, "Prop", morceaux);

        assertEquals("AlbumTitre", a.getTitle());
    }

    @Test
    public void AlbumTest_setTitle()
    {
        List<Morceau> morceaux = new ArrayList<Morceau>();
        morceaux.add(new Morceau(1, "Titre1", 60, new ArrayList<String>(Arrays.asList("Rock"))));
        morceaux.add(new Morceau(2, "Titre2", 120, new ArrayList<String>(Arrays.asList("Rock", "Electro"))));
        Album a = new Album("AlbumTitre", 2001, "Prop", morceaux);
        a.setTitle("oui");
        assertEquals("oui", a.getTitle());
    }

    @Test
    public void AlbumTest_getYear()
    {
        List<Morceau> morceaux = new ArrayList<Morceau>();
        morceaux.add(new Morceau(1, "Titre1", 60, new ArrayList<String>(Arrays.asList("Rock"))));
        morceaux.add(new Morceau(2, "Titre2", 120, new ArrayList<String>(Arrays.asList("Rock", "Electro"))));
        Album a = new Album("AlbumTitre", 2001, "Prop", morceaux);

        assertEquals(2001, a.getYear());
    }

    @Test
    public void AlbumTest_setYear()
    {
        List<Morceau> morceaux = new ArrayList<Morceau>();
        morceaux.add(new Morceau(1, "Titre1", 60, new ArrayList<String>(Arrays.asList("Rock"))));
        morceaux.add(new Morceau(2, "Titre2", 120, new ArrayList<String>(Arrays.asList("Rock", "Electro"))));
        Album a = new Album("AlbumTitre", 2001, "Prop", morceaux);
        a.setYear(2000);
        assertEquals(2000, a.getYear());
    }

    @Test
    public void AlbumTest_getGroup()
    {
        List<Morceau> morceaux = new ArrayList<Morceau>();
        morceaux.add(new Morceau(1, "Titre1", 60, new ArrayList<String>(Arrays.asList("Rock"))));
        morceaux.add(new Morceau(2, "Titre2", 120, new ArrayList<String>(Arrays.asList("Rock", "Electro"))));
        Album a = new Album("AlbumTitre", 2001, "Prop", morceaux);

        assertEquals("Prop", a.getGroup());
    }

    @Test
    public void AlbumTest_setGroup()
    {
        List<Morceau> morceaux = new ArrayList<Morceau>();
        morceaux.add(new Morceau(1, "Titre1", 60, new ArrayList<String>(Arrays.asList("Rock"))));
        morceaux.add(new Morceau(2, "Titre2", 120, new ArrayList<String>(Arrays.asList("Rock", "Electro"))));
        Album a = new Album("AlbumTitre", 2001, "Prop", morceaux);
        a.setGroup("Non");
        assertEquals("Non", a.getGroup());
    }

    @Test
    public void AlbumTest_getMorceaux()
    {
        List<Morceau> morceaux = new ArrayList<Morceau>();
        morceaux.add(new Morceau(1, "Titre1", 60, new ArrayList<String>(Arrays.asList("Rock"))));
        morceaux.add(new Morceau(2, "Titre2", 120, new ArrayList<String>(Arrays.asList("Rock", "Electro"))));
        Album a = new Album("AlbumTitre", 2001, "Prop", morceaux);

        assertEquals(morceaux, a.getMorceaux());
    }

    @Test
    public void AlbumTest_setMorceaux()
    {
        List<Morceau> morceaux = new ArrayList<Morceau>();
        morceaux.add(new Morceau(1, "Titre1", 60, new ArrayList<String>(Arrays.asList("Rock"))));
        morceaux.add(new Morceau(2, "Titre2", 120, new ArrayList<String>(Arrays.asList("Rock", "Electro"))));
        Album a = new Album("AlbumTitre", 2001, "Prop", morceaux);

        List<Morceau> morceaux2 = new ArrayList<Morceau>();
        morceaux2.add(new Morceau(1, "Titre1", 60, new ArrayList<String>(Arrays.asList("Rock"))));
        morceaux2.add(new Morceau(2, "Titre2", 120, new ArrayList<String>(Arrays.asList("Rock", "Electro"))));

        a.setMorceaux(morceaux2);

        assertEquals(morceaux2, a.getMorceaux());
    }

    @Test
    public void AlbumTest_MorceauxNumber()
    {
        List<Morceau> morceaux = new ArrayList<Morceau>();
        morceaux.add(new Morceau(1, "Titre1", 60, new ArrayList<String>(Arrays.asList("Rock"))));
        morceaux.add(new Morceau(2, "Titre2", 120, new ArrayList<String>(Arrays.asList("Rock", "Electro"))));
        Album a = new Album("AlbumTitre", 2001, "Prop", morceaux);

        assertEquals(2, a.numberOfMorceaux());
    }

    @Test
    public void AlbumTest_TotalLength()
    {
        List<Morceau> morceaux = new ArrayList<Morceau>();
        morceaux.add(new Morceau(1, "Titre1", 60, new ArrayList<String>(Arrays.asList("Rock"))));
        morceaux.add(new Morceau(2, "Titre2", 120, new ArrayList<String>(Arrays.asList("Rock", "Electro"))));
        Album a = new Album("AlbumTitre", 2001, "Prop", morceaux);

        assertEquals(180, a.totalLength());
    }

    @Test
    public void AlbumTest_AllStyles()
    {
        List<Morceau> morceaux = new ArrayList<Morceau>();
        morceaux.add(new Morceau(1, "Titre1", 60, new ArrayList<String>(Arrays.asList("Rock"))));
        morceaux.add(new Morceau(2, "Titre2", 120, new ArrayList<String>(Arrays.asList("Rock", "Electro"))));
        Album a = new Album("AlbumTitre", 2001, "Prop", morceaux);

        List<String> styles = new ArrayList<String>();
        styles.add("Rock");
        styles.add("Electro");

        assertEquals(styles, a.allStyles());
    }

}