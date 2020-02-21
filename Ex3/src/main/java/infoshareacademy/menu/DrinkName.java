package infoshareacademy.menu;

public enum DrinkName {
        NONE("none", 0),
        COLA("cola", 3.5f),
        JUICE("juice",  2.2f),
        BEER("beer", 5);

        private String name;
        private float price;

        DrinkName(String name, float price) {
            this.name = name;
            this.price = price;
        }

        public String getDrinkName() { return name; }

        public float getPrice() { return price; }

        @Override
        public String toString() {
                return name;
        }
}
