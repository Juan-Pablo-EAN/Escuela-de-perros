/*public class Principal {
	final static int numero = 0;
	Perro [] perros = new Perro[numero];
	static int codigo;
	static String nombreP;
	static String raza;
	static String localidad;
	static int cedula;
	static String nombreD;
	
	public static void main(String args[]) {
		int opcion = 0;
		
		opcion = Integer.parseInt(JOpcionPane.showInputDialog(null, ""));
	}
}*/
package paquete;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Principal {

    final static int num = 20;
    static Perro[] perros = new Perro[num];
    static int indice = 0;
    static int n = 0;
    static String nombreP = "";
    static int codigo = 0;
    static String raza = "";
    static String localidad = "";
    static int cedula = 0;
    static String nombreD;
    static int cedula1 = 0;
    static String nombre1 = "";
    static int cedula2 = 0;

    /*
	 * static int cantidadC = 0; static int cantidadD = 0; static int cantidadDo =
	 * 0; static int cantidadO = 0; static int cantidadA = 0; static int cantidadJ =
	 * 0; static int cantidadCa = 0; static int cantidadDom = 0;
     */
    public static void main(String[] args) {
        int i = 0;
        int eleccion = 0;
        int eleccion2 = 0;
        int eleccion3 = 0;

        do {
            eleccion = Integer.parseInt((String) JOptionPane.showInputDialog(null,
                    "Menu de Opciones\n\n" + "1. Ingresar un nuevo perro\n"
                    + "2. Mostrar los datos de los perros\n"
                    + "3. Eliminar un perro\n" //averiguar como eliminar un objeto
                    + "4. Mostrar los nombres de los perros de una persona\n"
                    + "5. Mostrar nombre y cantidad de perros según la raza\n"
                    + "6. Mostrar nombre y cantidad de perros según la localidad\n"
                    + "7. Salir\n"));
            if (eleccion == 1) {
                cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su número de cedula"));
                nombreD = JOptionPane.showInputDialog(null, "Ingrese su nombre");
                do {
                    n = Integer.parseInt((String) JOptionPane.showInputDialog("Número de perros que va a ingresar"));
                } while (n < 0 || n > num);

                for (i = 1; i <= n; i++) {
                    cedula1 = cedula;
                    nombre1 = nombreD;

                    codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo del perro " + i));
                    nombreP = JOptionPane.showInputDialog(null, "Nombre del perro " + i);
                    eleccion2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Raza del perro " + nombreP + "\n" + "(Escribe el número que corresponda)\n"
                            + "1. Pitbul\n"
                            + "2. Labrador\n"
                            + "3. Golden Retriber\n"
                            + "4. Chihuahua\n"
                            + "5. Pastor aleman\n"
                            + "6. Beagle\n"
                            + "7. Poodle"));
                    if (eleccion2 == 1) {
                        raza = "Pitbul";
                    } else if (eleccion2 == 2) {
                        raza = "Labrador";
                    } else if (eleccion2 == 3) {
                        raza = "Golden Retriber";
                    } else if (eleccion2 == 4) {
                        raza = "Chihuahua";
                    } else if (eleccion2 == 5) {
                        raza = "Pastor aleman";
                    } else if (eleccion2 == 6) {
                        raza = "Beagle";
                    } else if (eleccion2 == 7) {
                        raza = "Poodle";
                    } else {
                        JOptionPane.showMessageDialog(null, "La elección que escogiste es incorrecta",
                                "", JOptionPane.YES_NO_OPTION);
                    }
                    eleccion3 = Integer.parseInt((String) JOptionPane.showInputDialog(null,
                            "Localidad del perro " + nombreP + "(Escribe el número que corresponda)\n"
                            + "1. Usaquen\n"
                            + "2. Chapinero\n"
                            + "3. Santa Fe\n"
                            + "4. Suba\n"
                            + "5. Engativa\n"
                            + "6. Teusaquillo\n"
                            + "7. Barrios Unidos\n"));
                    if (eleccion3 == 1) {
                        localidad = "Usaquen";
                    } else if (eleccion3 == 2) {
                        localidad = "Chapinero";
                    } else if (eleccion3 == 3) {
                        localidad = "Santa Fe";
                    } else if (eleccion3 == 4) {
                        localidad = "Suba";
                    } else if (eleccion3 == 5) {
                        localidad = "Engativa";
                    } else if (eleccion3 == 6) {
                        localidad = "Teusaquillo";
                    } else if (eleccion3 == 7) {
                        localidad = "Barrios Unidos";
                    } else {
                        JOptionPane.showMessageDialog(null, "La elección que escogiste es incorrecta",
                                "", JOptionPane.YES_NO_OPTION);
                    }
                    arreglo();

                }
            } else if (eleccion == 2) {
                atributos();
            } else if (eleccion == 3) {
                //totales();
            } else if (eleccion == 4) {
                propietario();
            } else if (eleccion == 5) {
                //cambiar();
            } else if (eleccion == 6) {

            } else if (eleccion == 7) {
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "La elección que escogiste es incorrecta", "Supermercado Fontibón",
                        JOptionPane.YES_NO_OPTION);
            }
        } while (eleccion != 7);
    }

    public static void arreglo() {
        Perro p;
        p = new Perro();

        p.setCodigo(codigo);
        p.setNombreP(nombreP);
        p.setRaza(raza);
        p.setLocalidad(localidad);
        p.setCedula(cedula1);
        p.setNombreD(nombre1);
        perros[indice] = p;
        indice++;
    }

    public static void propietario() {
        int cedul2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Cedula del dueño:"));
        int cedul = 0;
        for (int j = 0; j < perros.length; j++) {
            cedul = perros[j].getCedula();
            if (cedul2 == cedul) {
                String nomDog = perros[j].getNombreP();
                String nomDu = perros[j].getNombreD();
                JOptionPane.showMessageDialog(null, "Los perros de " + nomDu + " son: " + nomDog);
            } else if (cedul2 != cedul) {
                JOptionPane.showMessageDialog(null, "Cedula incorrecta");
            }
        }
    }

    public static void atributos() {
        for (int i = 0; i < indice; i++) {
            JOptionPane.showMessageDialog(null, perros[i]);
        }
    }

    /* public static void cuantos() {
        if ("Jefe".equals(posicion)) {
            cantidadJ++;
        } else if ("Ayudante".equals(posicion)) {
            cantidadA++;
        } else if ("Cajero".equals(posicion)) {
            cantidadCa++;
        } else if ("Domiciliario".equals(posicion)) {
            cantidadDom++;
        }
    }

    public static void posiciones() {
        JOptionPane.showMessageDialog(null, "Empleados jefes: " + cantidadJ + "\n" + "Empleados ayudantes: " + cantidadA
                + "\n" + "Empleados cajeros: " + cantidadCa + "\n" + "Empleados domiciliarios: " + cantidadDom + "\n");
    }

    public static void contador() {
        if ("Caja".equals(departamento)) {
            cantidadC += salario;
        } else if ("Distribución".equals(departamento)) {
            cantidadD += salario;
        } else if ("Domicilios".equals(departamento)) {
            cantidadDo += salario;
        } else if ("Oficina".equals(departamento)) {
            cantidadO += salario;
        }
    }

    public static void totales() {
        JOptionPane.showMessageDialog(null,
                "Salario total en Caja es: $" + cantidadC + "\n" + "Salario total en Distribución es: $" + cantidadD
                + "\n" + "Salario total en Domicilios es: $" + cantidadDo + "\n"
                + "Salario total en Oficina es: $" + cantidadO + "\n");
    }
     */
}
