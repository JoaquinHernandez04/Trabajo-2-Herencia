package EjercicioEntregable9;


public class Empleado {

    private String dni;
    private String nombre;
    private String domicilio;
    private String fechaIngreso;
    private String categoria;
    final double sueldoBasico = 650000;

    public Empleado(String dni, String nombre, String domicilio, String fechaIngreso, String categoria) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.fechaIngreso = fechaIngreso;
        this.categoria = categoria;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    

    public class Vendedor extends Empleado {
        private int ventasMensuales;

        public Vendedor(String dni, String nombre, String domicilio, String fechaIngreso, int ventasMensuales) {
            super(dni, nombre, domicilio, fechaIngreso, "Vendedor");
            this.ventasMensuales = ventasMensuales;
        }

        public int getVentasMensuales() {
            return ventasMensuales;
        }

        public double calculosSueldoTotal() {
            double sueldoTotal = sueldoBasico + (ventasMensuales * 0.005);
            return sueldoTotal;
        }

        public void imprimirTicket() {
            System.out.println("==================================");
            System.out.println("           Ticket de Sueldo         ");
            System.out.println("==================================");
            System.out.println("Nombre:           " + getNombre());
            System.out.println("DNI:              " + getDni());
            System.out.println("Domicilio:        " + getDomicilio());
            System.out.println("Fecha de Ingreso: " + getFechaIngreso());
            System.out.println("Categoría:        " + getCategoria());
            System.out.println("----------------------------------");
            System.out.println("Ventas Mensuales: " + ventasMensuales);
            System.out.println("Sueldo Total:     " + calculosSueldoTotal());
            System.out.println("==================================");
        }
    }

    public class Administrativo extends Empleado {
        private boolean horasTrabajadas;
        
        public Administrativo(String dni, String nombre, String domicilio, String fechaIngreso,String categoria, Boolean horasTrabajadas) {
            super(dni, nombre, domicilio, fechaIngreso, "Administrativo");
            this.horasTrabajadas = horasTrabajadas;
        }


            public double calculoHorasTrabajadas() {
                
                if (horasTrabajadas == true) {
                    return sueldoBasico;
                }else {
                return sueldoBasico / 2;
                }
        }

        public void imprimirTicketAdministrativo() {
            System.out.println("==================================");
            System.out.println("           Ticket de Sueldo         ");
            System.out.println("==================================");
            System.out.println("Nombre:           " + getNombre());
            System.out.println("DNI:              " + getDni());
            System.out.println("Domicilio:        " + getDomicilio());
            System.out.println("Fecha de Ingreso: " + getFechaIngreso());
            System.out.println("Categoría:        " + getCategoria());
            System.out.println("----------------------------------");
            System.out.println("Horas trabajadas: " + horasTrabajadas);
            System.out.println("Sueldo Total:     " + calculoHorasTrabajadas());
            System.out.println("==================================");
        }

        
}
public class Repartidor extends Empleado {
    private int EnviosRealizados;
    public Repartidor(String dni, String nombre, String domicilio, String fechaIngreso, String categoria, int EnviosRealizados) {
        super(dni, nombre, domicilio, fechaIngreso, categoria);
        this.EnviosRealizados = EnviosRealizados;  
    }

    public double calculoHorasTrabajadasRepartidor() {
            return sueldoBasico + (EnviosRealizados * 500);    
}

public void imprimirTicketRepartidor() {
    System.out.println("==================================");
    System.out.println("           Ticket de Sueldo         ");
    System.out.println("==================================");
    System.out.println("Nombre:           " + getNombre());
    System.out.println("DNI:              " + getDni());
    System.out.println("Domicilio:        " + getDomicilio());
    System.out.println("Fecha de Ingreso: " + getFechaIngreso());
    System.out.println("Categoría:        " + getCategoria());
    System.out.println("----------------------------------");
    System.out.println("Envios realizados: " + EnviosRealizados);
    System.out.println("Sueldo Total:     " + calculoHorasTrabajadasRepartidor());
    System.out.println("==================================");
}
}
}
