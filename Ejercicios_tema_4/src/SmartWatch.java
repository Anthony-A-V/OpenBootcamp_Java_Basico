public class SmartWatch extends SmartDevice {
    String pantalla;
    String correa;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, String color, String pantalla, String material) {
        super(marca, modelo, color);
        this.pantalla = pantalla;
        this.correa = material;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "pantalla='" + pantalla + '\'' +
                ", correa='" + correa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
