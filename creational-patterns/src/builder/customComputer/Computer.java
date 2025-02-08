package builder.customComputer;

/**
 * @Author: Soe Ye Aung
 * @Date: 4/2/25
 * @Time: 11:19 pm
 */
public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;

    // Getters...

    public static class Builder {
        private final Computer computer = new Computer();

        public Builder cpu(String cpu) {
            computer.cpu = cpu;
            return this;
        }

        public Builder ram(String ram) {
            computer.ram = ram;
            return this;
        }

        public Builder storage(String storage) {
            computer.storage = storage;
            return this;
        }

        public Builder gpu(String gpu) {
            computer.gpu = gpu;
            return this;
        }

        public Computer build() {
            return computer;
        }
    }

    public static void main(String[] args) {
        // Usage
        Computer gaming = new Computer.Builder()
                .cpu("AMD Ryzen 9")
                .ram("32GB")
                .storage("2TB SSD")
                .gpu("RTX 4090")
                .build();
    }
}


