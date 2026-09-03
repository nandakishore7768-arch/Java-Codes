enum status{
    Running, Failed, Success, Pending
}

public class Main2{
    public static void main(String[] args){
        status s = status.Success;
        // System.out.println(s);
        // System.out.println(s.ordinal());

        status[] s1 = status.values();
        for(status i: s1){
            // System.out.println(i);
            // System.out.println(i.ordinal());
        }

        switch(s){
            case Running:
                System.out.println("All good");
                break;

            case Pending:
                System.out.println("Operation in process");
                break;

            case Failed:
                System.out.println("Operation Failed, please try again");
                break;

            case Success:
                System.out.println("Operation Successfully executed");
                break;
        }

        if (s == status.Running){
            System.out.println("All good");
        }
        else if(s == status.Pending){
            System.out.println("Operation in process");
        }
        else if(s == status.Failed){
            System.out.println("Operation Failed, please try again");
        }
        else if (s == status.Success){
            System.out.println("Operation Successfully executed");
        }
    }
}