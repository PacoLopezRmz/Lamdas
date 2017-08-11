
package defaultMethos;

public class TestDefault implements PersonaA, PersonaB{

    @Override
    public void hablar() {
        PersonaA.super.hablar(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public static void main(String[] args) {
        TestDefault test = new TestDefault();
        test.hablar();
    }
}
