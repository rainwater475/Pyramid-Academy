package genspark.assignments.HumansVsGnomes;

public class Goblinz {

    Goblinz()
    {

    }



public char move()
{
    double doubleRandomNumber = Math.random() * 5;
    int randomNumber = (int)doubleRandomNumber; char move=' ';

    System.out.println("randomNumber = " + randomNumber);

    if (randomNumber==0)
    {
        move=' ';
    }
    else if (randomNumber==1)
    {
        move='U';
    }
    else if (randomNumber==2)
    {
        move='R';
    }
    else if (randomNumber==3)
    {
        move='L';
    }
    else if(randomNumber==4)
    {
        move='D';
    }
    return move;
}



}
