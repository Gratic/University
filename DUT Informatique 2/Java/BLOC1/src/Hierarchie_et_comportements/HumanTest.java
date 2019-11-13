package Hierarchie_et_comportements;


import static org.junit.Assert.*;

public class HumanTest {

    @org.junit.Test
    public void TestStudent_work()
    {
        Student s = new Student("Alexis", "Strappazzon");
        assertEquals("Dormir au fond de l'amphi.", s.work());
    }

    @org.junit.Test
    public void TestTeacher_work()
    {
        Teacher t = new Teacher("Alexis", "Strappazzon");
        assertEquals("Corrige des copies.", t.work());
    }

    @org.junit.Test
    public void TestStudentGamer_play()
    {
        StudentGamer sg = new StudentGamer("Alexis", "Strappazzon");
        assertEquals("rage quit", sg.play());
    }

    @org.junit.Test
    public void TestTeacherGamer_play()
    {
        TeacherGamer tg = new TeacherGamer("Alexis", "Strappazzon");
        assertEquals("prof OP", tg.play());
    }
}