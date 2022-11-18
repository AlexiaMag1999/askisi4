public class homeappliancesstore {

    class Fridge {
        int length;
        int high;
        int depth;
        String manufactor = "";
        String model = "";
        String type = "Fridge";
        String energy = "";

        String id1="Eggyisi 10 xronia";
        String id2="Exei katapsixtis";
        String id3="Paragei pagakia";
        String id4="Periexei psi3ti neroy";
        String id5="Mporeis na diamorfoseis ta rafia opws to thes esy";

        void fridge(){
            System.out.println("Ta stoixia tis syskeyhs einai:");
            System.out.println("Typo:  "+type);
            System.out.println("Kataskeyasti:  "+manufactor);
            System.out.println("Onoma syskeyhs:  "+model);
            System.out.println("Kanatalvsh Energeias;  "+energy);
            System.out.println("Mikos: "+length);
            System.out.println("Ypsos: "+high);
            System.out.println("Bathos: "+depth);

            System.out.println("Idiotites:");
            System.out.println("1."+id1);
            System.out.println("2."+id2);
            System.out.println("3."+id3);
            System.out.println("4."+id4);
            System.out.println("5."+id5);
        }
    }

    class WashingMachine {
        int length;
        int high;
        int depth;
        String manufactor = "";
        String model = "";
        String type = "Washing Machine";
        String energy = "";

        String id1="Eggyisi 10 xronia";
        String id2="idiothta amesis kleidomatos/3ekleidomatos";
        String id3="10 kila xoritikotita";
        String id4="15 programmata";
        String id5="wifi";

        void washingmachine(){
            System.out.println("Ta stoixia tis syskeyhs einai:");
            System.out.println("Typo:  "+type);
            System.out.println("Kataskeyasti:  "+manufactor);
            System.out.println("Onoma syskeyhs:  "+model);
            System.out.println("Kanatalvsh Energeias;  "+energy);
            System.out.println("Mikos: "+length);
            System.out.println("Ypsos: "+high);
            System.out.println("Bathos: "+depth);

            System.out.println("Idiotites:");
            System.out.println("1."+id1);
            System.out.println("2."+id2);
            System.out.println("3."+id3);
            System.out.println("4."+id4);
            System.out.println("5."+id5);
        }
    }

    class Oven {
        int length;
        int high;
        int depth;
        String manufactor = "";
        String model = "";
        String type = "Oven";
        String energy = "";

        String id1="Eggyisi 5 xronia";
        String id2="4 esties";
        String id3="Meiktos (Aerio/Reyma)";
        String id4="Build in broiler";
        String id5="Megalh xoritikothta";

        void oven(){
            System.out.println("Ta stoixia tis syskeyhs einai:");
            System.out.println("Typo:  "+type);
            System.out.println("Kataskeyasti:  "+manufactor);
            System.out.println("Onoma syskeyhs:  "+model);
            System.out.println("Kanatalvsh Energeias;  "+energy);
            System.out.println("Mikos: "+length);
            System.out.println("Ypsos: "+high);
            System.out.println("Bathos: "+depth);

            System.out.println("Idiotites:");
            System.out.println("1."+id1);
            System.out.println("2."+id2);
            System.out.println("3."+id3);
            System.out.println("4."+id4);
            System.out.println("5."+id5);
        }
    }

    class AirCondition {
        int length;
        int high;
        int depth;
        String manufactor = "";
        String model = "";
        String type = "Air Condition";
        String energy = "";

        String id1="Eggyisi 7 xronia";
        String id2="Programma diakopis otan ftasei thn epithimiti thermokrasia";
        String id3="Energopoihsh meso Wifi";
        String id4="Psifiakos";
        String id5="Diafores methodi diadoshs toy aera";

        void aircondition(){
            System.out.println("Ta stoixia tis syskeyhs einai:");
            System.out.println("Typo:  "+type);
            System.out.println("Kataskeyasti:  "+manufactor);
            System.out.println("Onoma syskeyhs:  "+model);
            System.out.println("Kanatalvsh Energeias;  "+energy);
            System.out.println("Mikos: "+length);
            System.out.println("Ypsos: "+high);
            System.out.println("Bathos: "+depth);

            System.out.println("Idiotites:");
            System.out.println("1."+id1);
            System.out.println("2."+id2);
            System.out.println("3."+id3);
            System.out.println("4."+id4);
            System.out.println("5."+id5);
        }
    }

    public static void main(String args[]) {
        String Eteria = "";
        String Dieythinsi = "";
        int Ypalili;

        if (Eteria == null) {
        }
        if (Dieythinsi == null) {
        }

        if (args.length == 3) {
            System.out.println("To onoma eterias einai:");
            System.out.println(args[0]);
            System.out.println();

            System.out.println("H dieythinsi tis eterias einai:");
            System.out.println(args[1]);
            System.out.println();

            System.out.println("O arithmos twn ypalillvn einai:");
            System.out.println(args[2]);
        }
    }
}


