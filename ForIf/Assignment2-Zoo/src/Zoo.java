public class Zoo {

    public int calculatePrice(Person person){
        System.out.println(person.getAge());
        if(person.getAge() <= 5){
            return 0;
        } else if (person.getAge() <= 12) {
            return 5;
        } else {
            return 15;
        }
    }
}
