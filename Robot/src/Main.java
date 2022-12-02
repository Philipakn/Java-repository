public class Main {

    public static void main(String[]args){

        Robot r1 = new Robot("Samsung","Blue",200);
        getRob(r1);
        Robot r2 = new Robot("Tesla","Green",250);
        getRob(r2);
        Robot r3 = new Robot("Huawei","Purple",300);
        getRob(r3);
        MiniBot m = new MiniBot("Tesla","Yellow",400,"Version_1.0");
        getMiniBot(m);
        Robot k = new MiniBot("Philip","Grey",740,"Version_1.02");
        getMiniBot((MiniBot) k);
    }

    static void getRob(Robot rob){

        System.out.println("These are the phone details:");
        rob.getName();
        rob.getColor();
        rob.getWeight();
    }

    static void getMiniBot(MiniBot rob){

        System.out.println("These are the phone details:");
        rob.getName();
        rob.getColor();
        rob.getWeight();
        rob.getModel();
        rob.getYear();
    }
}
