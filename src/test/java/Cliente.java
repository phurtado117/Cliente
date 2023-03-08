public class Cliente {

        private String name;
        private String NoAccount;
        private double password;
        private double balance;


        public Cliente() {
        }

        //Constructor con parámetros
        public Cliente(String name, String NoAccount, double password, double balance) {
            this.name = name;
            this.NoAccount = NoAccount;
            this.password = password;
            this.balance = balance;

        }

        public Cliente(final Cliente c) {
            name = c.name;
            NoAccount = c.NoAccount;
            password = c.password;
            balance = c.balance;
        }

        //getters y setters
        public void setName(String s) {
            name= s;
        }

        public void setNoAccount(String s) {
            NoAccount = s;
        }

        public void setPassword(double n) {
            password = 0.0;
        }

        public void setBalance(double n) {
            balance = 0.0;
        }

        public String getName() {
            return name;
        }

        public String getNoAccount() {
            return NoAccount;
        }

        public double getPassword() {
            return password;
        }

        public double getBalance() {
            return balance;
        }


        public String toString(){
            System.out.println("Datos del cliente");
            System.out.println("name:"+getName());
            System.out.println("password:"+getPassword());
            return "";
        }



}






