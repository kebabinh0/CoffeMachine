import java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {

        Scanner scanner= new Scanner(System.in);



        System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");


        System.out.print("Write how many ml of water the coffee machine has: ");
        int water_resources=scanner.nextInt();
        System.out.print("Write how many ml of milk the coffee machine has: ");
        int milk_resources=scanner.nextInt();
        System.out.print("Write how many grams of coffee beans the coffee machine has: ");
        int beans_resources=scanner.nextInt();

        System.out.print("Write how many cups of coffee you will need: ");
        int cups=scanner.nextInt();


        int cups_made;
        int additional_cups;
        Boolean additional_flag=false;

        for (cups_made=0;cups_made<cups;cups_made++)
        {
            water_resources-=200;
            milk_resources-=50;
            beans_resources-=15;

            if(water_resources<0 || milk_resources <0 || beans_resources <0)
            {
                System.out.println("No, I can make only "+ cups_made +" cup(s) of coffee");
                break;
            }
        }

        for(additional_cups=0;water_resources>0 && milk_resources>0 && beans_resources>0;additional_cups++)
        {
            water_resources-=200;
            milk_resources-=50;
            beans_resources-=15;

            if(water_resources<0 || milk_resources <0 || beans_resources <0)
                additional_cups--;

        }



        if(additional_cups>0)
        {
            System.out.println("Yes, I can make that amount of coffee (and even " + additional_cups + " more than that)");
            additional_flag=true;
        }

        if(additional_flag==false)
            System.out.println("Yes, I can make that amount of coffee");


    }
}