import java.util.*;


// Log class to represent each log entry
class Log {
    private int logId;
    private String accountNumber;
    private String actionType;
    private double amount;
    private String timestamp;
    private String status;
    
    public Log(int logId, String accountNumber, String actionType, double amount, 
               String timestamp, String status) {
        this.logId = logId;
        this.accountNumber = accountNumber;
        this.actionType = actionType;
        this.amount = amount;
        this.timestamp = timestamp;
        this.status = status;
    }
    
    public int getLogId() {
        return logId;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getActionType() {
        return actionType;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public String getTimestamp() {
        return timestamp;
    }
    
    public String getStatus() {
        return status;
    }
    
    @Override
    public String toString() {
        return "LogID: " + logId + 
               ", Account: " + accountNumber + 
               ", Action: " + actionType + 
               ", Amount: " + amount + 
               ", Time: " + timestamp + 
               ", Status: " + status;
    }
}

// LogSystem class with the required features
class LogSystem {
    private List<Log> allLogs;
    private HashMap<String, List<Log>> logsByAccount;
    private int nextLogId;
    
    public LogSystem() {
        allLogs = new ArrayList<>();
        logsByAccount = new HashMap<>();
        nextLogId = 1;
    }
    
    // Feature 1: Add Log
    public void addLog(String accountNumber, String actionType, double amount, 
                       String timestamp, String status) {
        Log newLog = new Log(nextLogId, accountNumber, actionType, amount, timestamp, status);
        
        allLogs.add(newLog);
        
        if (!logsByAccount.containsKey(accountNumber)) {
            logsByAccount.put(accountNumber, new ArrayList<>());
        }
        logsByAccount.get(accountNumber).add(newLog);
        
        nextLogId++;
        
        System.out.println("\n✓ Log added successfully!");
        System.out.println(newLog);
    }
    
    // Feature 2: Get Logs by Account
    public List<Log> getLogsByAccount(String accountNumber) {
        if (logsByAccount.containsKey(accountNumber)) {
            return logsByAccount.get(accountNumber);
        }
        return new ArrayList<>();
    }
}

// Main class
public class BankLogSystem {
    public static void main(String[] args) {
        LogSystem system = new LogSystem();
        Scanner scanner = new Scanner(System.in);
    
        
        while (true) {
            displayMenu();
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    addNewLog(system, scanner);
                    break;
                case 2:
                    viewLogsByAccount(system, scanner);
                    break;
                case 3:
                    System.out.println("\nThank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }
            
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
        }
    }
    
    private static void displayMenu() {
        
        System.out.println("1. Add New Log");
        System.out.println("2. View Logs by Account");
        System.out.println("3. Exit");
    }
    
    private static void addNewLog(LogSystem system, Scanner scanner) {
        System.out.println("\n--- ADD NEW LOG ---");
        
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        
        System.out.println("\nSelect Action Type:");
        System.out.println("1. DEPOSIT");
        System.out.println("2. WITHDRAW");
        System.out.println("3. TRANSFER");
        System.out.println("4. LOGIN");
        System.out.println("5. FAILED_LOGIN");
        System.out.print("Choice: ");
        int actionChoice = scanner.nextInt();
        scanner.nextLine();
        
        String actionType = "";
        switch (actionChoice) {
            case 1: actionType = "DEPOSIT"; break;
            case 2: actionType = "WITHDRAW"; break;
            case 3: actionType = "TRANSFER"; break;
            case 4: actionType = "LOGIN"; break;
            case 5: actionType = "FAILED_LOGIN"; break;
            default: actionType = "UNKNOWN";
        }
        
        double amount = 0;
        if (actionChoice >= 1 && actionChoice <= 3) {
            System.out.print("Enter Amount: ");
            amount = scanner.nextDouble();
            scanner.nextLine();
        }
        
        System.out.print("Enter Timestamp (yyyy-mm-dd hh:mm): ");
        String timestamp = scanner.nextLine();
        
        System.out.println("\nSelect Status:");
        System.out.println("1. SUCCESS");
        System.out.println("2. FAILED");
        System.out.print("Choice: ");
        int statusChoice = scanner.nextInt();
        scanner.nextLine();
        
        String status = (statusChoice == 1) ? "SUCCESS" : "FAILED";
        
        system.addLog(accountNumber, actionType, amount, timestamp, status);
    }
    
    private static void viewLogsByAccount(LogSystem system, Scanner scanner) {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        
        List<Log> logs = system.getLogsByAccount(accountNumber);
        
        if (logs.isEmpty()) {
            System.out.println("\nNo logs found for account: " + accountNumber);
        } else {
            System.out.println("Logs for Account: " + accountNumber);
            for (Log log : logs) {
                System.out.println(log);
            }
        
            System.out.println("Total logs: " + logs.size());
        }
    }
}