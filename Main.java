public class Main
{
    public static void main(String args[])
    {
        System.out.println("------------Preparing Regular Eggs------------");
        Eggs re = new RegularEggs();
        re.prepareEggs();
        System.out.println("");
        System.out.println("-------------Preparing Fried Eggs-------------");
        Eggs fe = new FriedEggs();
        fe.prepareEggs();
    }
}
