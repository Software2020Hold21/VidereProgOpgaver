package Lektion6;

public class TennisSpiller implements Runnable{
    TennisSpiller modstander;
    String navn;
    boolean harBolden;

    public TennisSpiller(String navn, boolean harBolden) {
        this.navn = navn;
        this.harBolden = harBolden;
    }

    public void run() {
        try{
            double chance = Math.random();
            if (chance<0.80){
                //Venter
                long waitingTime = (int) (Math.random()*2000);
                Thread.sleep(waitingTime);

                //Giver modstanderen bolden
                this.harBolden=false;
                System.out.println(navn + " skyder bolden over nettet.");
                modstander.modtagBold();
                modstander.run();
            } else{
                System.out.println(navn + " skyder i nettet!");
            }

        } catch (InterruptedException e){

        }



    }

    public void setModstander(TennisSpiller modstander){
        this.modstander = modstander;
    }

    public void modtagBold(){
        this.harBolden = true;
    }


}
