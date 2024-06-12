public class Notebook {
        int weight;
        int price;
        int year;

        public Notebook(int weight, int price, int year) {
                this.weight = weight;
                this.price = price;
                this.year = year;
        }
        public void checkPrice() {
                if (this.price < 600) {
                        System.out.println("This notebook is very cheap.");
                } else if (this.price >= 600 && this.price < 1000) {
                        System.out.println("The price is good.");
                } else {
                        System.out.println("This notebook is expensive.");
                }
        }
        public void checkWeight() {
                if (this.weight < 600) {
                        System.out.println("This notebook is very light.");
                } else if (this.weight >= 600 && this.weight <= 1200) {
                        System.out.println("The weight is good.");
                } else {
                        System.out.println("This notebook is very heavy.");
                }

        }
        public void checkWorthIt() {
                if (this.price < 600 && this.year > 2020) {
                        System.out.println("Shut up and take my money!");
                } else if (this.price >= 600 && this.price <= 800 && this.year >= 2010 && this.year <= 2020) {
                        System.out.println("Worth it.");
                } else {
                        System.out.println("It is not worth to buy.");
                }

        }
}
