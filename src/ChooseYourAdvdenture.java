/*
Make a "Choose Your Own Adventure" game. It should feature at least 5  options after the first level prompts, at least
 two options for each of the second-level prompts, at least two options for each of the third-level prompts, and add at
  least two options for two of the fourth-level prompts for a total of a minimum of twenty two possible destinations.
   If you finish please add more options to the first level and follow the same structure.

Once they reach the end of the decision tree, tell the user whether they survived or not. For example, in the first
 sample output below,

You die of starvation... eventually
statement informs the user that they did not survive the game.
 */


import java.util.Scanner;

public class ChooseYourAdvdenture {

    public static void main(String[] args) {


        String firstLevPrompt = "";
        String secondLevPrompt;
        String thirdLevPrompt;
        String fourthLevPrompt;
        String fifthLevPrompt;

        System.out.println("Please choose where you would like to go..");
        System.out.println("Kitchen,Upstairs,Patio, Living Room or Basement");

        Scanner input = new Scanner(System.in);
        firstLevPrompt = input.next();
        secondLevPrompt = input.nextLine();
        thirdLevPrompt = input.nextLine();
        fourthLevPrompt = input.nextLine();
       // fifthLevPrompt = input.next();

        if (firstLevPrompt == "kitchen"){
            System.out.print("nice" + firstLevPrompt);
        }

        switch(firstLevPrompt.toLowerCase()){

            case "kitchen":
                System.out.println("Do you want to open \"Refrigerator\" or \"Cabinet\" ? ");
                switch(secondLevPrompt.toLowerCase()){
                    case "refrigerator" :
                        System.out.println("Inside refrigerator, you can see milk and food. Do you want to drink \"Drink trange milk\" or \"Eat leftovers\" ? ");
                        switch (thirdLevPrompt.toLowerCase()){
                            case "drink strange milk" :
                                System.out.println("It's strange");
                                break;

                            case "eat leftovers" :
                                System.out.println("How does this left over food taste?");
                                break;
                        }

                        break;

                    case "cabinet" :
                        System.out.println("Do you want to \"Eat can of beans\" or \"Take a plate\" ?");
                        switch (thirdLevPrompt.toLowerCase()) {
                            case "eat can of beans":
                                System.out.println("Enjoy your beans");
                                break;

                            case "take a plate":
                                System.out.println("Take your nice plate");
                                break;
                        }
                        break;

                }
                break;

            case "Upstairs":
                System.out.println("Do you want to go to \"Bedroom\" or \"Bathroom\" ?");
                switch (secondLevPrompt.toLowerCase()){
                    case "bedroom":
                        System.out.println("Do you want to \"Lay on bed\"or \"Open the drawer\" ?");
                        switch (thirdLevPrompt.toLowerCase()){
                            case "lay on bed":
                                System.out.println("Ok Take some rest");
                                break;
                            case "open the drawer":
                                System.out.println("Why drawer??");
                                break;
                        }
                        break;
                    case "bathroom":
                        System.out.println("Do you want to \"Look in mirror\" or \"Use the toilet\" ?");
                        switch (thirdLevPrompt.toLowerCase()){
                            case "look in mirror":
                                System.out.println("It is a nice mirror");
                                break;
                            case "use the toilet":
                                System.out.println("Clean after use");
                                break;
                        }
                        break;
                }
                break;

            case "Patio":
                System.out.println("Do you want to \"Go to the pool\" or \"Open shade\" ?");
                switch (secondLevPrompt.toLowerCase()){
                    case "go to the pool":
                        System.out.println("Do you want to \"Clean the pool\" or \"Swim in the pool\" ?");
                        switch (thirdLevPrompt.toLowerCase()){
                            case "clean the pool":
                                System.out.println("Thank you ...It really needs to be cleaned");
                                break;
                            case "swim in the pool":
                                System.out.println("Enjoy swimming");
                                break;
                        }
                        break;
                    case "open shade":
                        System.out.println("Do you want to \"Take an ax\" or \"Take a hammer\" ?");
                        switch (thirdLevPrompt.toLowerCase()){
                            case "take an ax":
                                System.out.println("Do ypu want to \"Chop a tree\" or \"Throw the ax\" ?");
                                switch (fourthLevPrompt.toLowerCase()){
                                    case "chop a tree":
                                        System.out.println("Be careful while chopping");
                                        break;
                                    case "throw the ax":
                                        System.out.println("Why do you want to throw the ax??");
                                        break;
                                }
                                break;
                            case "take a hammer":
                                System.out.println("What do you want to do with a hammer? \"Hammer a nail\" or \"Break the hammer\" ?");
                                switch (fourthLevPrompt.toLowerCase()){
                                    case "hammer a nail":
                                        System.out.println("Be careful while hammering a nail");
                                        break;
                                    case "break the hammer":
                                        System.out.println("Why do you want to break the hammer?");
                                        break;
                                }
                                break;
                        }
                        break;
                }

                break;

            case "Living Room":
                System.out.println("Do you want to \"Turn on the TV\" or \"Sit on the couch\" ?");
                switch (secondLevPrompt.toLowerCase()){
                    case "turn on the TV":
                        System.out.println("Do you want to \"Change the channel\" or \"Stay on the first channel\"?");
                        switch (thirdLevPrompt.toLowerCase()){
                            case "change the channel":
                                System.out.println("Do you want to \"Increase the volume\" or \"Decrease the volume\" ?");
                                switch (fourthLevPrompt.toLowerCase()){
                                    case "increase the volume":
                                        System.out.println("Please don't increase the volume. It is alrady too loud.");
                                        break;
                                    case "decrease the volume":
                                        System.out.println("That's a great idea.");
                                        break;
                                }
                                break;
                            case "stay on the first channel":
                                System.out.println("Do you want to \"Go open the door\" or \"Ignore the door\" ?");
                                switch (fourthLevPrompt.toLowerCase()){
                                    case "go open the door":
                                        System.out.println("Thanks for opening the door");
                                        break;
                                    case "ignore the door":
                                        System.out.println("Please don't igonre the door");
                                        break;
                                }
                                break;
                        }
                        break;
                    case "sit on the couch":
                        System.out.println("Do you want to \"Look out the window\" or \"Start to eat\" ?");
                        switch (thirdLevPrompt.toLowerCase()){
                            case "look out the window":
                                System.out.println("It is a nice weather outside...");
                                break;
                            case "start to eat":
                                System.out.println("You look so hungry???");
                                break;
                        }
                        break;
                }
                break;

            case "Basement":
                System.out.println("Do you want to \"Turn on the lights\" or \"Walk in the dark\" ?");
                switch (secondLevPrompt.toLowerCase()){
                    case "turn on the lights":
                        System.out.println("Do you want to \"Turn the laundry on\" or \"Turn the lights off\" ?");
                        switch (thirdLevPrompt.toLowerCase()){
                            case "turn the laundry on":
                                System.out.println("Thanks for turning the laundry on");
                                break;
                            case "turn the lights off":
                                System.out.println("Please don't turn off the lights");
                                break;
                        }
                        break;
                    case "walk in the dark":
                        System.out.println("Do you want to \"Open a chest\" or \"Open a closet\" ?");
                        switch (thirdLevPrompt.toLowerCase()){
                            case "open a chest":
                                System.out.println("Why do want to open a chest?");
                                break;
                            case "open a closet":
                                System.out.println("Why do you open a closet?");
                                break;
                        }
                        break;
                }
                break;
        }
    }
}
