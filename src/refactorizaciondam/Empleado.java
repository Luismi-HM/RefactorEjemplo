package refactorizaciondam;

public class Empleado extends PersonaBase implements Trabajable {
    protected int codEmpleado;
    protected double salarioBase;

    public Empleado(String nombre, String dni, int idEmpleado, double salarioBase) {
        super(nombre, dni);
        this.codEmpleado = idEmpleado;
        this.salarioBase = salarioBase;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " | ID: "
                + codEmpleado + " | Salario: " + calcularSalario());
    }

    public void ficharEntrada(int hora, int min) {
        System.out.println(nombre + "ha fichado a las " + hora + " - " + min);
    }

}