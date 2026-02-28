public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setCode("1010");
        product1.ImprimirDatos();

        System.out.println("");
        Product product2 = new Product();
        product2.setName("Arroz");
        product2.setPrice(4200.0);
        product2.ImprimirDatos();

        System.out.println("");
        Product product3 = new Product();
        product3.setCode("12321");
        product3.setName("Chocolatina");
        product3.setPrice(1500.0);
        product3.ImprimirDatos();

        // Comprar prctos
        int cantidad = 10;
        Double totaPagar=0.0;

        totaPagar = cantidad* product3.getPrice();
        System.out.println("Por "+cantidad+" "+ product3.getName()+" deberá pagar: "+totaPagar);
    }
}
