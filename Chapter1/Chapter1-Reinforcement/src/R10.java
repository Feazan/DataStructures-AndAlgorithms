/**
 * Solution for Data Structures and Algorithms 6th edition --
 * Reinforcement R-1.10
 *
 * Question asks for class to be named Flower, however I named it R10
 * for Reinforcement 10
 *
 *
 * @author Feazan Yaseen
 */
public class R10
{
    // Instance variables
    private String name;
    private int petals;
    private float price;

    // Default Constructor
    public R10()
    {
        name = "";
        petals = 0;
        price = 0;
    }

    /**
     * Parametrized Constructor
     *
     * @param flowerName - String
     * @param flowerPetals - int
     * @param flowerPrice - float
     */
    public R10(String flowerName, int flowerPetals, float flowerPrice)
    {
        this.name = flowerName;
        this.petals = flowerPetals;
        this.price = flowerPrice;
    }

    /**
     * getName() method to return name
     *
     * @return name - the name of the flower
     */
    public String getName()
    {
        return name;
    }


    /**
     * getPetals() method to return number of petals
     *
     * @return petals - the number of petals
     */
    public int getPetals()
    {
        return petals;
    }

    /**
     * getPrice() method to return price
     *
     * @return price - the price of the flower
     */
    public float getPrice()
    {
        return price;
    }

    /**
     * setName() method to set flower name
     *
     * @param newName - String - the name of the flower
     */
    public void setName(String newName)
    {
        this.name = newName;
    }

    /**
     * setPetals() method to set number of flower petals
     *
     * @param newPetals - int - number of petals
     */
    public void setPetals(int newPetals)
    {
        this.petals = newPetals;
    }

    /**
     * setPrice() method to set new flower price
     *
     * @param newPrice - float - set new price of flower
     */
    public void setPrice(float newPrice)
    {
        this.price = newPrice;
    }
}