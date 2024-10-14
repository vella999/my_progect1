public class Motorcycle extends Vehicle {
    String hasSidecar;

    public Motorcycle(String hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getDescription() {
       return super.getDescription() + " Есть ли коляска: "+hasSidecar;
    }
}
