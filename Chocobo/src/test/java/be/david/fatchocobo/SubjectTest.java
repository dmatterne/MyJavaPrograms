package be.david.fatchocobo;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by stannisbaratheon on 24/06/16.
 */
class Subject {

    private Collaborator c;

    public  int subject(String s) {
        String r = c.doSomething(s);
        return r.length();
    }

    public void setC(Collaborator c) {
        this.c = c;
    }

}

public class SubjectTest{

    MockCollaborator m;
    private Subject s;

    @Before
    public void init() {
         m = new MockCollaborator();
         s = new Subject();
         s.setC(m);
    }


    @Test
    public void testThatSubjectWorks() {


        //int test = Subject.subject("Test",c);
        //assertEquals(11,test);
        s.subject("Test");
        assertTrue(m.isCalled);
    }


}

interface Collaborator {
    String doSomething(String s);
}

class RealCollaborator implements  Collaborator {

    public String doSomething(String s) {
        return s + s + "text";
    }
}

class MockCollaborator  implements Collaborator{

    public boolean isCalled = false;

    public String doSomething(String s) {
        isCalled = true;
        return s + s + "text";
    }
}