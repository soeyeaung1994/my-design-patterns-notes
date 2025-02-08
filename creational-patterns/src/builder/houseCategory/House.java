package builder.houseCategory;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 11:21 am
 */
public class House {
    private final String type;
    private final int floors;
    private final int bedrooms;
    private final int bathrooms;
    private final boolean hasGarage;
    private final boolean hasGarden;
    private final double squareFootage;
    private final String roofStyle;

    private House(Builder builder) {
        this.type = builder.type;
        this.floors = builder.floors;
        this.bedrooms = builder.bedrooms;
        this.bathrooms = builder.bathrooms;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.squareFootage = builder.squareFootage;
        this.roofStyle = builder.roofStyle;
    }

    @Override
    public String toString() {
        return STR."House{type='\{type}', floors=\{floors}, bedrooms=\{bedrooms}, bathrooms=\{bathrooms}, hasGarage=\{hasGarage}, hasGarden=\{hasGarden}, squareFootage=\{squareFootage}, roofStyle='\{roofStyle}'}";
    }

    // Builder class
    public static class Builder {

        private final String type;
        private int floors = 1;
        private int bedrooms = 2;
        private int bathrooms = 1;
        private boolean hasGarage = false;
        private boolean hasGarden = false;
        private double squareFootage = 1200;
        private String roofStyle = "အမြင့်";

        public Builder(String type) {
            this.type = type;
        }

        public Builder floors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder bedrooms(int bedrooms) {
            this.bedrooms = bedrooms;
            return this;
        }

        public Builder bathrooms(int bathrooms) {
            this.bathrooms = bathrooms;
            return this;
        }

        public Builder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder hasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Builder squareFootage(double squareFootage) {
            this.squareFootage = squareFootage;
            return this;
        }

        public Builder roofStyle(String roofStyle) {
            this.roofStyle = roofStyle;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    public static void main(String[] args) {
        // Usage
        House bungalow = new House.Builder("ဘန်ဂလို")
                .floors(1)
                .bedrooms(3)
                .bathrooms(2)
                .hasGarden(true)
                .squareFootage(2000)
                .build();
        System.out.println(bungalow);
    }
}


