import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PharmaceuticalsMultithreadingExample {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of bottles to produce:");
        int numBottles = scanner.nextInt();
        
        List<MedicineBottle> productionLine = new ArrayList<>();
        List<MedicineBottle> packagingLine = new ArrayList<>();
        
        Thread productionThread = new Thread(new ProductionRunnable(productionLine, numBottles));
        Thread packagingThread = new Thread(new PackagingRunnable(productionLine, packagingLine));
        
        System.out.println("Starting production...");
        productionThread.start();
        packagingThread.start();
        
        // Print output while the threads are running
        while (productionThread.isAlive() || packagingThread.isAlive()) {
            System.out.println("Produced " + productionLine.size() + " bottles.");
            System.out.println("Packaged " + packagingLine.size() + " bottles.");
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // Print the final output
        System.out.println("Production complete.");
        System.out.println("Produced " + numBottles + " bottles.");
        System.out.println("Packaged " + packagingLine.size() + " bottles.");
    }
    
    public static class MedicineBottle {
        // This class represents a medicine bottle
    }
    
    public static class ProductionRunnable implements Runnable {
        private List<MedicineBottle> productionLine;
        private int numBottles;
        
        public ProductionRunnable(List<MedicineBottle> productionLine, int numBottles) {
            this.productionLine = productionLine;
            this.numBottles = numBottles;
        }
        
        @Override
        public void run() {
            int produced = 0;
            while (produced < numBottles) {
                // Produce a new medicine bottle
                MedicineBottle bottle = new MedicineBottle();
                
                // Add the bottle to the production line
                synchronized (productionLine) {
                    productionLine.add(bottle);
                    productionLine.notifyAll();
                }
                
                // Sleep for some time
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                produced++;
            }
        }
    }
    
    public static class PackagingRunnable implements Runnable {
        private List<MedicineBottle> productionLine;
        private List<MedicineBottle> packagingLine;
        
        public PackagingRunnable(List<MedicineBottle> productionLine, List<MedicineBottle> packagingLine) {
            this.productionLine = productionLine;
            this.packagingLine = packagingLine;
        }
        
        @Override
        public void run() {
            while (true) {
                // Wait for a bottle to be produced
                synchronized (productionLine) {
                    while (productionLine.isEmpty()) {
                        try {
                            productionLine.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // Get a bottle from the production line
                    MedicineBottle bottle = productionLine.remove(0);
                    
                    // Package the bottle
                    // ...
                    
                    // Add the packaged bottle to the packaging line
                    synchronized (packagingLine) {
                        packagingLine.add(bottle);
                    }
                }
            }
        }
    }
}
