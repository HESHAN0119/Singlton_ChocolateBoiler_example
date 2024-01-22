public class ChocolateBoiler {

    private Boolean empty;
    private Boolean boiled;
    private ChocolateBoiler(boolean empty,boolean boiled) {
        this.empty= empty;
        this.boiled=boiled;
    }
    private static ChocolateBoiler chocolateBoilerIns;

    public static ChocolateBoiler getChocolateBoiler(boolean empty, boolean boiled){
        if (chocolateBoilerIns==null){
            System.out.println("create instance");
            chocolateBoilerIns= new ChocolateBoiler(empty,boiled);
        }
        return chocolateBoilerIns;
    }

    public void fill(){
        if (isEmpty()){
            empty=false;
            boiled=false;
            System.out.println("boiler is filled");

        }

    }

    public void drain(){
        if (!isEmpty()&&isboied()){
            empty=true;
            System.out.println("boiler was empty");
        }

    }

    public void boil(){
        if (!isEmpty()&&!isboied()){
            System.out.println("boiler was boiled");
            boiled=true;



        }
    }



    public boolean isEmpty(){
        return empty;
    }

    public boolean isboied(){
        return boiled;
    }



}
