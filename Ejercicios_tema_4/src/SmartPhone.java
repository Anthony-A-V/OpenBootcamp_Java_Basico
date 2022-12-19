public class SmartPhone extends SmartDevice {
    String sistemaOperativo;
    String procesador;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String color, String sistemaOperativo, String procesador) {
        super(marca, modelo, color);
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", procesador='" + procesador + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
