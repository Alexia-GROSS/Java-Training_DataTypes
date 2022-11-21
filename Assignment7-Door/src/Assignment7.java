public class Assignment7 {
    public static void main(String[] args) {
        Door door = new Door(true, 26, 79);
        door.openDoor();
        door.printOpen();
        door.closeDoor();
        door.printOpen();
        door.openDoor();
        door.printOpen();
        System.out.println(door.calculateSurface());
    }
}
