import java.util.ArrayList;
import java.util.List;
import java.lang.InterruptedException;

public class PharmaceuticalsMultithreadingExample {
    
    public static void main(String[] args) {
        List<MedicineBottle> productionLine = new ArrayList<>();
        List<MedicineBottle> packagingLine = new ArrayList<>();
        
        Thread productionThread = new Thread(new ProductionRunnable(productionLine));
        Thread packagingThread = new Thread(new PackagingRunnable(productionLine, packagingLine));
        
        System.out.println("Starting production...");
        productionThread.start();
        packagingThread.start();
        
        // Wait for the threads to finish
        try {
            productionThread.join();
            packagingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Print the final output
        System.out.println("Production complete.");
        System.out.println("Produced " + productionLine.size() + " bottles.");
        System.out.println("Packaged " + packagingLine.size() + " bottles.");
    }
    
    public static class MedicineBottle {
        // This class represents a medicine bottle
    }
    
    public static class ProductionRunnable implements Runnable {
        private List<MedicineBottle> productionLine;
        
        public ProductionRunnable(List<MedicineBottle> productionLine) {
            this.productionLine = productionLine;
        }
        
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                // Produce a new medicine bottle
                MedicineBottle bottle = new MedicineBottle();
                
                // Add the bottle to the production line
                synchronized (productionLine) {
                    productionLine.add(bottle);
                    productionLine.notifyAll();
                }
                
                System.out.println("Produced bottle " + (i+1));
                
                // Sleep for some time
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
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
            for (int i = 0; i < 10; i++) {
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
                System.out.println("Packaged bottle " + (i+1));
            }
        }
    }
}

