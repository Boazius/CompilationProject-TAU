package TYPES;

public class TYPE_STRING extends TYPE {
    /**************************************/
    /* USUAL SINGLETON IMPLEMENTATION ... */
    /**************************************/
    private static TYPE_STRING instance = null;

    /*****************************/
    /* PREVENT INSTANTIATION ... */

    /*****************************/
    protected TYPE_STRING() {
        this.name = "string";
    }

    /******************************/
    /* GET SINGLETON INSTANCE ... */

    /******************************/
    public static TYPE_STRING getInstance() {
        if (instance == null) {
            instance = new TYPE_STRING();
        }
        return instance;
    }

    public String getType() {
        return "TYPE_STRING";
    }
}
