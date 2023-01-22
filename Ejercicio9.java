public class Ejercicio9 {
    public static void main(String[] args) {
        Trabajador unTrabajador  = new Trabajador();
        Cliente unCliente = new Cliente();

        
        unCliente.setEdad(33);
        unCliente.setNombre("Sebastian");
        unCliente.setTelefono("2994738130");
        unCliente.setCredito(900);

        unTrabajador.setEdad(36);
        unTrabajador.setNombre("Mabel");
        unTrabajador.setTelefono("No posee");
        unTrabajador.setSalario(1500.50f);
        
        
        System.out.println(unCliente);
        System.out.println(unTrabajador);

    }

}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;


    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getTelefono(){
        return this.telefono;
    }

    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public String toString(){
        return "Nombre: "+this.nombre+" Edad: "+this.edad+" Telefono: "+this.telefono;
    }
}
 class Cliente extends Persona{
    private int credito;

    public int getCredito(){
        return this.credito;
    }
    public void setCredito(int credito){
        this.credito=credito;
    }
    public String toString(){
        return "Cliente->Nombre: "+this.getNombre()+" Edad: "+this.getEdad()+" Telefono: "+this.getTelefono()+" Credito: "+this.credito;
    }
}

 class Trabajador extends Persona{
    private Float salario;

    public Float getSalario(){
        return this.salario;
    }
    public void setSalario(Float salario){
        this.salario=salario;
    }
    public String toString(){
        return "Trabajador->Nombre: "+this.getNombre()+" Edad: "+this.getEdad()+" Telefono: "+this.getTelefono()+" Salario: "+this.salario;
    }

}
