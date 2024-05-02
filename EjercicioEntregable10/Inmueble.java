package EjercicioEntregable10;

class Inmueble {
    protected int identificador;
    protected float area;
    protected String direccion;

    public Inmueble(int identificador, float area, String direccion) {
        this.identificador = identificador;
        this.area = area;
        this.direccion = direccion;
    }

    public void imprimir() {
    }

    public double calcularPrecioVenta() {
        return area * getPrecioMetroCuadrado();
    }

    protected double getPrecioMetroCuadrado() {
        return 0; // Por defecto, no hay implementación
    }
}

class InmuebleResidencial extends Inmueble {
    protected int numHabitaciones;
    protected int numBanos;

    public InmuebleResidencial(int identificador, float area, String direccion, int numHabitaciones, int numBanos) {
        super(identificador, area, direccion);
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }
}

class Casa extends InmuebleResidencial {
    private boolean conjuntoCerrado;
    private double valorAdministracion;
    private boolean tieneAreasComunes;

    public Casa(int identificador, float area, String direccion, int numHabitaciones, int numBanos,
            boolean conjuntoCerrado, double valorAdministracion, boolean tieneAreasComunes) {
        super(identificador, area, direccion, numHabitaciones, numBanos);
        this.conjuntoCerrado = conjuntoCerrado;
        this.valorAdministracion = valorAdministracion;
        this.tieneAreasComunes = tieneAreasComunes;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("==================================");
        System.out.println("           Ticket de Casa");
        System.out.println("==================================");
        System.out.println("Identificador: " + identificador);
        System.out.println("Area (m²): " + area);
        System.out.println("Dirección: " + direccion);
        System.out.println("Tipo: " + (conjuntoCerrado ? "Conjunto Cerrado" : "Independiente"));
        System.out.println("Número de Habitaciones: " + numHabitaciones);
        System.out.println("Número de Baños: " + numBanos);
        System.out.println("Valor Administración: $" + valorAdministracion);
        System.out.println("Incluye Area Comunes: " + (tieneAreasComunes ? "Sí" : "No"));
        System.out.println("Precio de Venta: $" + calcularPrecioVenta());
        System.out.println("==================================");
    }

    @Override
    protected double getPrecioMetroCuadrado() {
        return conjuntoCerrado ? 2500000 : 2000000;
    }
}

class Apartamento extends InmuebleResidencial {
    private boolean esMonoambiente;

    public Apartamento(int identificador, float area, String direccion, int numHabitaciones, int numBanos,
            boolean esMonoambiente) {
        super(identificador, area, direccion, numHabitaciones, numBanos);
        this.esMonoambiente = esMonoambiente;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("==================================");
        System.out.println("       Ticket de Apartamento");
        System.out.println("==================================");
        System.out.println("Identificador: " + identificador);
        System.out.println("Area (m²): " + area);
        System.out.println("Dirección: " + direccion);
        System.out.println("Tipo: " + (esMonoambiente ? "Monoambiente" : "Departamento Familiar"));
        System.out.println("Número de Habitaciones: " + numHabitaciones);
        System.out.println("Número de Baños: " + numBanos);
        System.out.println("Precio de Venta: $" + calcularPrecioVenta());
        System.out.println("==================================");
    }

    @Override
    protected double getPrecioMetroCuadrado() {
        return esMonoambiente ? 1000000 : 1800000;
    }
}

class InmuebleComercial extends Inmueble {
    public InmuebleComercial(int identificador, float area, String direccion) {
        super(identificador, area, direccion);
    }
}

class LocalComercial extends InmuebleComercial {
    private String localizacion;
    private String centroComercial;

    public LocalComercial(int identificador, float area, String direccion, String localizacion,
            String centroComercial) {
        super(identificador, area, direccion);
        this.localizacion = localizacion;
        this.centroComercial = centroComercial;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("==================================");
        System.out.println("      Ticket de Local Comercial");
        System.out.println("==================================");
        System.out.println("Identificador: " + identificador);
        System.out.println("Area (m²): " + area);
        System.out.println("Dirección: " + direccion);
        System.out.println("Localización: " + localizacion);
        System.out.println("Centro Comercial: " + centroComercial);
        System.out.println("Precio de Venta: $" + calcularPrecioVenta());
        System.out.println("==================================");
    }

    @Override
    protected double getPrecioMetroCuadrado() {
        return 3000000;
    }
}

class Oficina extends InmuebleComercial {
    public Oficina(int identificador, float area, String direccion) {
        super(identificador, area, direccion);
    }

    @Override
    protected double getPrecioMetroCuadrado() {
        return 2400000;
    }
}
