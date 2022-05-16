public abstract class Eggs
{
    final public void prepareEggs()
    {
        boilWater();
        addEggs();
        cutEggs();
        addMasala();
        RegularOrFried();
        addStuffings();
        serve();
    }

    public void boilWater()
    {
        System.out.println("Boiling water ...");
    }
    public void addEggs()
    {
        System.out.println("Adding Eggs to boiled Water...");
    }

    public void cutEggs()
    {
        System.out.println("Cutting Eggs into pieces...");
    }

    public void addMasala()
    {
        System.out.println("Adding paper salt...");
    }

    abstract void RegularOrFried();

    public void addStuffings()
    {
        System.out.println("Add Stuffings of tomato and onion...");
    }
    public void serve()
    {
        System.out.println("Serve Eggs with coriander...");
    }
}
