package uk.co.asepstrath.bank;

import java.util.List;
import java.util.UUID;

/** Fictional, repeatable data for running the application without an API. */
final class DemoData {
    static void populate(List<Account> accounts, List<Transactions> transactions,
                         List<Business> businesses) {
        String alex = "11111111-1111-4111-8111-111111111111";
        String jamie = "22222222-2222-4222-8222-222222222222";
        accounts.add(new Account(UUID.fromString(alex), "Alex Morgan", 1500, true));
        accounts.add(new Account(UUID.fromString(jamie), "Jamie Taylor", 850, false));
        businesses.add(new Business("grocer", "Demo Corner Grocer", "Groceries", false));
        businesses.add(new Business("cafe", "Demo Coffee House", "Eating Out", false));
        businesses.add(new Business("travel", "Demo City Travel", "Transport", false));
        businesses.add(new Business("flagged", "Demo Flagged Trading", "Shopping", true));
        transactions.add(new Transactions("2026-09-01 09:00:00", 1200, "employer", "demo-001", alex, "DEPOSIT"));
        transactions.add(new Transactions("2026-09-02 10:30:00", 42.75, alex, "demo-002", "grocer", "PAYMENT"));
        transactions.add(new Transactions("2026-09-03 12:00:00", 8.50, alex, "demo-003", "cafe", "PAYMENT"));
        transactions.add(new Transactions("2026-09-04 08:00:00", 25, alex, "demo-004", "travel", "PAYMENT"));
        transactions.add(new Transactions("2026-09-05 14:00:00", 75, alex, "demo-005", jamie, "TRANSFER"));
        transactions.add(new Transactions("2026-09-06 15:00:00", 40, alex, "demo-006", "cashpoint", "WITHDRAWAL"));
        transactions.add(new Transactions("2026-09-07 11:00:00", 19.99, alex, "demo-007", "flagged", "PAYMENT"));
        transactions.add(new Transactions("2026-09-08 10:00:00", 32.10, jamie, "demo-008", "grocer", "PAYMENT"));
        transactions.add(new Transactions("2026-09-09 12:00:00", 12, jamie, "demo-009", "cafe", "PAYMENT"));
    }
}
