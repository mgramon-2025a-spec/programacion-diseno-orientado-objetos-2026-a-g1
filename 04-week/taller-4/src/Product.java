//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Product {
    private String Code;
    private String Name;
    private Double Price;



    public String getCode(){
        return this.Code;
    }

    public void  setCode(String CodeInput){
        this.Code = CodeInput;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public void ImprimirDatos(){
        System.out.println("Código: "+this.Code);
        System.out.println("Nombre: "+this.Name);
        System.out.println("Precio: "+this.Price);
    }
}