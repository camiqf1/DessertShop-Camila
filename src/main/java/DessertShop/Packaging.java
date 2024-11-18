package DessertShop;

public interface Packaging {
    // Getter for packaging
    String getPackaging();

    // Setter for packaging
    void setPackaging(String packaging);

    //interface
    interface Packable {

        //Abstract method for get and set packaging
        String getPackaging = "";
        void setPackaging(String packaging); 
    }
    

}// end of interface
