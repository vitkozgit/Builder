public class Main {
    public static void main(String[] args) {
        // Now creating object with its all parameters is very easy!!!

        SportCar alfaRomeo =
                new SportCar.Builder("Alfa Romeo",2017).setColor("Red").
                        setMaxSpeed(350).setOwner("Vitali Kozak").setUsed(true).setWeight(1200.5).build();

        System.out.println(alfaRomeo.getBrand() + ", " + alfaRomeo.getId() + ", " + alfaRomeo.getColor() + ", " +
            alfaRomeo.getMaxSpeed() + ", " + alfaRomeo.getOwner() + ", " + alfaRomeo.isUsed() + ", " +
                alfaRomeo.getWeight());
    }
}
