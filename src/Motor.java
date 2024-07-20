import java.util.ArrayList;
import java.util.Scanner;

public class Motor {
    private int id_motor;
    private int potencia;
    private static ArrayList<Motor> motores = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public Motor(int id_motor, int potencia) {
        this.id_motor = id_motor;
        this.potencia = potencia;
    } // construtor de motor

    // getters e setters id_motor
    public int getId_motor() {
        return id_motor;
    }

    public void setId_motor(int id_motor) {
        this.id_motor = id_motor;
    }

    // getters e setters potencia
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    // imprimir motores

    public String toString() {
        return "[Motor: id_motor = " + id_motor + ", potencia = " + potencia + "]";
    }

    public static void adicionarMotor() {
        // RECEBENDO DADOS DO MOTOR
        System.out.print("\n");
        System.out.print("Digite o id do motor: ");
        int id_motor = sc.nextInt();
        System.out.print("Digite a potencia do motor: ");
        int potencia = sc.nextInt();

        // ADICIONANDO MOTOR A Arraylist
        motores.add(new Motor(id_motor, potencia));
        System.out.println("Motor adicionado com sucesso!\n");
    }

    // exibir todos os motores
    public static void exibirMotores() {
        System.out.println("Lista de motores:");
        for (Motor motor : motores) {
            System.out.println(motor);
        }
    }

    // pesquisar motor por id
    public static void pesquisarMotor() {
        System.out.print("Digite o id do motor que deseja pesquisar: ");
        int idParaPesquisar = sc.nextInt();
        Motor motorEncontrado = null;
        for (Motor motor : motores) {
            if (motor.getId_motor() == idParaPesquisar) {
                motorEncontrado = motor;
                break;
            }
        }

        if (motorEncontrado != null) {
            System.out.println("Motor encontrado: " + motorEncontrado);
        } else {
            System.out.println("Motor com id " + idParaPesquisar + " não encontrado.");
        }
    }
}
