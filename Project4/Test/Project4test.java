package Project4.Test;

import Project4.DragonsCaveJunit;
import Project4.GuesstheNumberJunit;
import org.jetbrains.annotations.TestOnly;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Project4test {


    @Test
    public void testmenu()
    {
        DragonsCaveJunit g = new DragonsCaveJunit();
        String result = g.getmenu (1);

        assertEquals("Here is treasure", result);
    }

    @Test
    public void testprint()
    {
        GuesstheNumberJunit g=new GuesstheNumberJunit();
        String res =g.printline("Steve");
        assertEquals("Username is: SteveI am thinking of a number between 1 and 20",res);
    }

}
