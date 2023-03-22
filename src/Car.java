public class Car {
        private String model, brand, color;
        private int year, quantity;
        private double price;

        public Car(String model, String brand, int year, double price, String color, int quantity) {
            this.model = model;
            this.brand = brand;
            this.year = year;
            this.price = price;
            this.color = color;
            this.quantity = quantity;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getBrand(){
            return brand;
        }

        public void setBrand(String brand){
            this.brand = brand;
        }

        public String getColor(){
            return color;
        }

        public void setColor(String color){
            this.color = color;
        }

        public int getYear(){
            return year;
        }

        public void setYear(int year){
            this.year = year;
        }

        public int getQuantity(){
            return quantity;
        }

        public void setQuantity(int quantity){
            this.quantity = quantity;
        }

        public double getPrice(){
            return price;
        }

        public void setPrice(double price){
            this.price = price;
        }

        public void delivery(int numberOfCars) {
            this.quantity += numberOfCars;
        }

        public void sell(int numberOfCars) {
            if (numberOfCars <= this.quantity) {
                this.quantity -= numberOfCars;
            } else {
                System.out.println("Error: Not enough cars in stock.");
            }
        }

        public String toString() {
            return "Model=" + model + ", Brand=" + brand + ", Year=" + year + ", Price=" + price
                    + ", Color=" + color + ", Quantity=" + quantity + "]";
        }

    }


