package builder.foodOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 11:37 am
 */
public class FoodOrder {
    private final String mainDish;
    private final String size;
    private final List<String> extras;
    private final String drinkType;
    private final boolean isSpicy;
    private final String specialInstructions;
    private final boolean isPackaged;

    private FoodOrder(Builder builder) {
        this.mainDish = builder.mainDish;
        this.size = builder.size;
        this.extras = builder.extras;
        this.drinkType = builder.drinkType;
        this.isSpicy = builder.isSpicy;
        this.specialInstructions = builder.specialInstructions;
        this.isPackaged = builder.isPackaged;
    }

    @Override
    public String toString() {
        return STR."FoodOrder{mainDish='\{mainDish}', size='\{size}', extras=\{extras}, drinkType='\{drinkType}', isSpicy=\{isSpicy}, specialInstructions='\{specialInstructions}', isPackaged=\{isPackaged}}";
    }

    public static class Builder {
        private final String mainDish;
        private String size = "အလတ်";
        private List<String> extras = new ArrayList<>();
        private String drinkType;
        private boolean isSpicy = false;
        private String specialInstructions;
        private boolean isPackaged = false;

        public Builder(String mainDish) {
            this.mainDish = mainDish;
        }

        public Builder addExtra(String extra) {
            this.extras.add(extra);
            return this;
        }

        public Builder drinkType(String drinkType) {
            this.drinkType = drinkType;
            return this;
        }

        public Builder isSpicy(boolean isSpicy) {
            this.isSpicy = isSpicy;
            return this;
        }

        public Builder specialInstructions(String specialInstructions) {
            this.specialInstructions = Builder.this.specialInstructions;
            return this;
        }

        public Builder isPackaged(boolean isPackaged) {
            this.isPackaged = isPackaged;
            return this;
        }

        public FoodOrder build() {
            return new FoodOrder(this);
        }

    }

    public static void main(String[] args) {
        // Usage
        FoodOrder lunchBox = new FoodOrder.Builder("ထမင်းဘူး")
                .addExtra("ကြက်သား")
                .addExtra("ဘဲဥ")
                .isSpicy(true)
                .isPackaged(true)
                .build();
        System.out.println(lunchBox);
    }
}


