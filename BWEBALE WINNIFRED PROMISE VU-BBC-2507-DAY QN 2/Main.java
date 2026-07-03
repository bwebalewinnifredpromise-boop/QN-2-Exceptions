public class Main {
    public static void main(String[] args) {
        System.out.println("====== QUESTION TWO EXECUTABLE DRIVER ======\n");

        //  1. Testing Part (a) Snippet Flow 
        System.out.println("--- Testing Part (a): Return Value Overriding ---");
        int partAResult = testPartA();
        System.out.println("Value finally printed by the caller: " + partAResult);
        System.out.println();


        //  2. Testing Part (b): Risky Method Execution 
        System.out.println("--- Testing Part (b): risky(0) Execution ---");
        int riskyZeroResult = risky(0);
        System.out.println("Returned value for risky(0): " + riskyZeroResult);
        System.out.println();

        System.out.println("--- Testing Part (b): risky(2) Execution ---");
        int riskyTwoResult = risky(2);
        System.out.println("Returned value for risky(2): " + riskyTwoResult);
        System.out.println();


        //  3. Testing Part (c): Custom Checked Exception Handling 
        System.out.println("--- Testing Part (c): Custom InsufficientFundsException ---");
        PaymentSystem system = new PaymentSystem();
        
        try {
            System.out.println("Attempting a safe withdrawal of UGX 2,000...");
            system.withdraw(2000.0);
            
            System.out.println("Attempting an unsafe withdrawal of UGX 10,000 (Should trigger error)...");
            system.withdraw(10000.0); 
        } catch (InsufficientFundsException e) {
            System.out.println("Caught Custom Checked Exception: " + e.getMessage());
        }
        System.out.println();


        //  4. Testing Part (d): Try-With-Resources Safe File Handling 
        System.out.println("--- Testing Part (d): Try-With-Resources File Safe Utility ---");
        ResourceFix cleaner = new ResourceFix();
        // Passing a non-existent file to intentionally trigger the safe catch block
        cleaner.readFileSafe("non_existent_telemetry_log.txt");
    }

    // Part (a) Source Method implementation for direct validation
    public static int testPartA() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }

    // Part (b) Source Method implementation exactly as requested
    public static int risky(int x) {
        System.out.println("1");
        try {
            if (x == 0) {
                return x;
            }
            System.out.println("2");
            return x * 2;
        } finally {
            System.out.println("3");
        }
    }
}

