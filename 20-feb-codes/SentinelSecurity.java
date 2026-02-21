public class SentinelSecurity {
    // Static method for authentication [cite: 268, 271]
    public static boolean checkCredentials(String user, String pass) {
        return user.equals("Admin") && pass.equals("SecurePass123");
    }

    // Non-static method for permissions [cite: 284, 285]
    public void grantPermission(int securityLevel, boolean isAuthenticated) {
        if (!isAuthenticated) { 
            System.out.println("ACCESS DENIED: Credentials Invalid.");
        } else if (securityLevel >= 80) { 
            System.out.println("LEVEL " + securityLevel + " ACCESS GRANTED: Full System Control.");
        } else { 
            System.out.println("LEVEL " + securityLevel + " ACCESS GRANTED: Read-Only Access."); 
        }
    }

    // Overloaded log processing [cite: 300, 301]
    public int processLog(int logCount) {
        int sum = 0;
        for (int i = 1; i < logCount; i++) { 
            if (i % 2 != 0) sum += i;
        }
        return sum;
    }

    public void processLog(String logType) { 
        System.out.println(logType + " LOG: System is running smoothly."); 
    }

    public static void main(String[] args) {
        SentinelSecurity sys = new SentinelSecurity();

        // Scenario 1 & 2: Wrong credentials [cite: 309, 313]
        boolean status = checkCredentials("Admin", "wrong"); 
        sys.grantPermission(95, status); 

        // Scenario 3 & 4: Correct credentials [cite: 317, 321]
        status = checkCredentials("Admin", "SecurePass123"); 
        sys.grantPermission(95, status); 

        // Scenario 5: Low level [cite: 325]
        sys.grantPermission(50, status); 

        // Scenario 6: Log Average [cite: 329]
        int sum = sys.processLog(100); 
        System.out.println(sum / 2.0); // Resulting in 1250.0 [cite: 332, 343]

        // Scenario 7: String log [cite: 334]
        sys.processLog("DEBUG");
    }
}