    /*c.
    Create a subclass of Car class and name it as Ford. The Ford class has the following fields and methods
    Creati o sub clasa a clasei Care, numita Ford. Clasa Ford are urmatoarele campuri si metode:
	◦intyear;
	◦intmanufacturerDiscount;
	◦doublegetSalePrice();//FromthesalepricecomputedfromCarclass,subtractthemanufacturerDiscount.

    */


    public class Ford extends Car {


        private int year;
    private int manufacturerDiscount;



    public Ford ( int Speed, double regularPrice, String color , int year){

        super( Speed, regularPrice , color );
        this.year= year;
        this.manufacturerDiscount= manufacturerDiscount;


    }

        public Ford(int speed, double regularPrice, String color) {
            super( speed, regularPrice, color);
        }


        public double getSalePrice(){ return ( super.getSalePrice() - manufacturerDiscount);}

    }
