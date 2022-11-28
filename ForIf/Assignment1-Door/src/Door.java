public class Door {
    float width;
    float height;
    boolean open;

    public Door(boolean open, float height, float width) {
        this.open = open;
        this.height = height;
        this.width = width;
    }

    public void openDoor(){
        this.open = true;
        System.out.println("Opening door");
    }

    public void closeDoor(){
        this.open = false;
        System.out.println("Closing door");
    }

    public void printOpen(){
        if(this.open) {
            System.out.println("The door is open");
        } else {
            System.out.println("The door is closed");
        }
    }

    public float calculateSurface(){
        return this.width * this.height;
    }
}