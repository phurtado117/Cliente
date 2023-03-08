
public class Testcliente {

    public static void main(String[] args) {

            Cliente cliente = new Cliente("Pablo Alfonso Hurtado", "12345678901234567890", 12345678, 350);

         cliente.toString();
        //mostrar los datos de cuenta1
        System.out.println("Datos del cliente");
        System.out.println("Nombre del titular: " + cliente.getName());
        System.out.println("Número de cuenta: " + cliente.getNoAccount());
        System.out.println("La contraseña es: " + cliente.getPassword());
        System.out.println("Su saldo es: " + cliente.getBalance());


        }



}




