public class Main {
    public static void main(String[] args) {
        int childrenPriceTicket;
        int teenPriceTicket;
        int olderPriceTicket;

        Person children = new Person(3, "Zoe");
        Person teen = new Person(10, "Camille");
        Person older = new Person(63, "Mathilde");

        Zoo zoo = new Zoo();

        childrenPriceTicket = zoo.calculatePrice(children);
        teenPriceTicket = zoo.calculatePrice(teen);
        olderPriceTicket = zoo.calculatePrice(older);

        System.out.println("Child : " + childrenPriceTicket + "; Teen : " + teenPriceTicket + "; Older : " + olderPriceTicket );
    }
}
