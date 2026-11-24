import java.util.Scanner;

public class Nokia5510 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========= NOKIA 5510 ==========");
        System.out.println("1. PHONE BOOK");
        System.out.println("2. MESSAGES");
        System.out.println("3. CHAT");
        System.out.println("4. CALL REGISTER");
        System.out.println("5. TONES");
        System.out.println("6. SETTINGS");
        System.out.println("7. CALL DIVERT");
        System.out.println("8. MUSIC");
        System.out.println("9. GAMES");
        System.out.println("10. CALCULATOR");
        System.out.println("11. REMINDERS");
        System.out.println("12. CLOCK");
        System.out.println("13. PROFILES");
        System.out.println("14. SERVICES");
        System.out.println("15. SIM SERVICES");

        System.out.print("Choose an option: ");
        int choice = input.nextInt();

        switch (choice) {

            case 1:
                System.out.println("======== PHONE BOOK OPTION ======");
                System.out.println("1. SEARCH");
                System.out.println("2. SERVICE NOS.");
                System.out.println("3. ADD NAME");
                System.out.println("4. ERASE");
                System.out.println("5. EDIT");
                System.out.println("6. COPY");
                System.out.println("7. ASSIGN TONE");
                System.out.println("8. EDIT B'CARD");
                System.out.println("9. OPTIONS");
                System.out.println("10. SPEED DIALS");
                System.out.println("11. VOICE TAGS");

                System.out.print("Choose an option: ");
                int phoneChoice = input.nextInt();

                if (phoneChoice == 9) {
                    System.out.println("OPTIONS MENU");
                    System.out.println("1. MEMORY IN USE");
                    System.out.println("2. TYPE OF VIEW");
                    System.out.println("3. MEMORY STATUS");
                }
                break;

            case 2:
                System.out.println("MESSAGES MENU");
                System.out.println("1. Write messages");
                System.out.println("2. Inbox");
                System.out.println("3. Outbox");
                System.out.println("4. Picture messages");
                System.out.println("5. Templates");
                System.out.println("6. Smileys");
                System.out.println("7. Message settings");
                System.out.println("8. Info service");
                System.out.println("9. Voice mailbox number");
                System.out.println("10. Service command editor");
                break;

            case 3:
                System.out.println("CHAT SENDING!");
                break;

            case 4:
                System.out.println("CALL REGISTER MENU");
                System.out.println("1. Missed calls");
                System.out.println("2. Received calls");
                System.out.println("3. Dialled numbers");
                System.out.println("4. Erase recent call list");
                System.out.println("5. Show call duration");
                System.out.println("6. Show call costs");
                System.out.println("7. Call cost settings");
                System.out.println("8. Prepaid credit");

                System.out.print("Choose an option: ");
                int callChoice = input.nextInt();

                switch (callChoice) {
                    case 5:
                        System.out.println("CALL DURATION OPTIONS");
                        System.out.println("1. Last call duration");
                        System.out.println("2. All calls' duration");
                        System.out.println("3. Received calls' duration");
                        System.out.println("4. Dialled calls' duration");
                        System.out.println("5. Clear timers");
                        break;

                    case 6:
                        System.out.println("CALL COST OPTIONS");
                        System.out.println("1. Last call cost");
                        System.out.println("2. All calls' cost");
                        System.out.println("3. Clear counters");
                        break;

                    case 7:
                        System.out.println("ALL COST SETTINGS");
                        System.out.println("1. Call cost limit");
                        System.out.println("2. Show costs in");
                        break;
                }
                break;

            case 5:
                System.out.println("TONES MENU");
                System.out.println("1. Ringing tone");
                System.out.println("2. Ringing volume");
                System.out.println("3. Incoming call alert");
                System.out.println("4. Message alert tone");
                System.out.println("5. Keypad tones");
                System.out.println("6. Warning tones");
                System.out.println("7. Vibrating alert");
                System.out.println("8. Screen saver");
                break;

            case 6:
                System.out.println("SETTINGS MENU");
                System.out.println("1. Call settings");
                System.out.println("2. Phone settings");
                System.out.println("3. Security settings");
                System.out.println("4. Restore factory settings");

                System.out.print("Choose an option: ");
                int settingsChoice = input.nextInt();

                switch (settingsChoice) {
                    case 1:
                        System.out.println("CALL SETTINGS OPTIONS");
                        System.out.println("1. Automatic redial");
                        System.out.println("2. Speed dialling");
                        System.out.println("3. Call waiting options");
                        System.out.println("4. Own number sending");
                        System.out.println("5. Phone line in use");
                        System.out.println("6. Automatic answer");
                        break;

                    case 2:
                        System.out.println("PHONE SETTINGS OPTIONS");
                        System.out.println("1. Language");
                        System.out.println("2. Cell info display");
                        System.out.println("3. Welcome note");
                        System.out.println("4. Network selection");
                        System.out.println("5. Confirm SIM service actions");
                        break;

                    case 3:
                        System.out.println("SECURITY SETTINGS OPTIONS");
                        System.out.println("1. PIN code request");
                        System.out.println("2. Call barring service");
                        System.out.println("3. Fixed dialling");
                        System.out.println("4. Closed user group");
                        System.out.println("5. Security level");
                        System.out.println("6. Change access codes");
                        break;

                    case 4:
                        System.out.println("Factory settings restored");
                        break;

                    default:
                        System.out.println("Invalid settings option.");
                }
                break;

            case 7:
                System.out.println("Call divert settings is already activated");
                break;

            case 8:
                System.out.println("MUSIC MENU");
                System.out.println("1. Music player");
                System.out.println("2. Radio");
                System.out.println("3. Recorder");
                System.out.println("4. Track list");
                break;

            case 9:
                System.out.println("NO GAMES ALLOWED, OGA GO READ DIETEL!");
                break;

            case 10:
                System.out.println("CALCULATING 2 + 2");
                System.out.println("Answer: " + (2 + 2));
                break;

            case 11:
                System.out.println("REMINDER SET FOR MONDAY 7:00 AM");
                break;

            case 12:
                System.out.println("CLOCK MENU");
                System.out.println("1. Alarm clock");
                System.out.println("2. Clock settings");
                System.out.println("3. Date setting");
                System.out.println("4. Stopwatch");
                System.out.println("5. Countdown timer");
                System.out.println("6. Auto update of date and time");
                break;

            case 13:
                System.out.println("PROFILES");
                break;

            case 14:
                System.out.println("SERVICES");
                break;

            case 15:
                System.out.println("SIM SERVICES");
                break;

            default:
                System.out.println("Invalid choice.");
        }

        input.close();
    }
}