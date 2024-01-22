public class Main {
    public static void main(String[] args) {

      ChocolateBoiler chocolateBoiler= ChocolateBoiler.getChocolateBoiler(false,false);
      chocolateBoiler.fill();
      chocolateBoiler.boil();
      chocolateBoiler.drain();

    }
}