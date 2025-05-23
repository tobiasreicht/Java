package amazon.Products;

public abstract class AbstractProduct implements Products {
    private String ID;
    private float price;
    private String Title;
    private String Description;

    public AbstractProduct(String ID, float price, String Title, String Description) {
        this.ID = ID;
        this.price = price;
        this.Title = Title;
        this.Description = Description;
    }


    public String getID() {
            return ID;
        }


        public float getPrice() {
            return price;
        }

        public String getTitle() {
            return Title;
        }

        public String getDescription() {
            return Description;
        }


    public String toString() {
        return ID + ": " + Title + " - " + Description + " (€" + price + ")";
    }

    }

