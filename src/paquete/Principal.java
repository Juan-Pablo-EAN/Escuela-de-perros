package paquete;

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
    static String raz;

    public static void main(String[] args) {
        int i = 0;
        int eleccion = 0;
        int eleccion2 = 0;
        int eleccion3 = 0;

        do {
            eleccion = Integer.parseInt((String) JOptionPane.showInputDialog(null,
                    "Menu de Opciones\n\n" + "1. Ingresar un nuevo perro\n"
                    + "2. Mostrar los datos de los perros\n"
                    + "3. Eliminar un perro\n"
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
                codigo();
            } else if (eleccion == 3) {
                eliminar();
            } else if (eleccion == 4) {
                atributos();
            } else if (eleccion == 5) {
                raza();
            } else if (eleccion == 6) {
                localidad();
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

    public static void eliminar() {
        int codnull = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el código del perro a eliminar"));
        //crear el metodo para eliminar el perro
    }

    public static void codigo() {
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Escribe el código del perro"));
        int j = 0;
        for (j = 0; j <= perros.length; j++) {
            int codigo = perros[j].getCodigo();
            if (cod == codigo) {
                JOptionPane.showMessageDialog(null, "Nombre: " + perros[j].getNombreP() + "\n"
                        + "Raza: " + perros[j].getRaza() + "\n"
                        + "Localidad: " + perros[j].getLocalidad() + "\n"
                        + "Dueño: " + perros[j].getNombreD() + "\n"
                        + "Cedula del dueño: " + perros[j].getCedula() + "\n");
                return;
            }
        }
    }

    public static void raza() {
        String raza2 = "";
        int elec = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Escoge la raza\n" + "(Escribe el número que corresponda)\n"
                + "1. Pitbul\n"
                + "2. Labrador\n"
                + "3. Golden Retriber\n"
                + "4. Chihuahua\n"
                + "5. Pastor aleman\n"
                + "6. Beagle\n"
                + "7. Poodle"));
        int r = 0;
        switch (elec) {
            case 1:
                raz = "Pitbul";
                break;
            case 2:
                raz = "Labrador";
                break;
            case 3:
                raz = "Golden Retriber";
                break;
            case 4:
                raz = "Pastor aleman";
                break;
            case 5:
                raz = "Pitbul";
                break;
            case 6:
                raz = "Beagle";
                break;
            case 7:
                raz = "Poodle";
                break;

        }
        while (r <= perros.length) {

            try {
                raza2 = perros[r].getRaza();
                if (raz.equals(raza2)) {
                    JOptionPane.showMessageDialog(null, "Raza " + perros[r].getRaza() + ":\n\n"
                            + perros[r].getNombreP());
                    return;
                }
                r++;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "La raza que elegiste no pertenece a la escuela");
                return;
            }
        }
    }

    public static void localidad() {
        String local = "";
        int loc = Integer.parseInt(JOptionPane.showInputDialog("Escoge la localidad del perro" + "\n"
                + "(Escribe el número que corresponda)\n\n"
                + "1. Usaquen\n"
                + "2. Chapinero\n"
                + "3. Santa Fe\n"
                + "4. Suba\n"
                + "5. Engativa\n"
                + "6. Teusaquillo\n"
                + "7. Barrios Unidos\n"));

        switch (loc) {
            case 1:
                local = "Usaquen";
                break;
            case 2:
                local = "Chapinero";
                break;

            case 3:
                local = "Santa Fe ";
                break;

            case 4:
                local = "Suba";
                break;

            case 5:
                local = "Engativa";
                break;

            case 6:
                local = "Teusaquillo";
                break;

            case 7:
                local = "Barrios Unidos";
                break;

            default:
                JOptionPane.showMessageDialog(null, "El numero ingresado no corresponde a ninguna localidad. ");
                break;

        }
        int t = 0;
        while (t <= perros.length) {
            try {
                String lo = perros[t].getLocalidad();
                if (lo.equals(local)) {
                    JOptionPane.showMessageDialog(null, "Localidad " + lo + "\n\n"
                            + perros[t].getNombreP() + "\n");
                }
                t++;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "La localidad que elegiste no pertenece a la escuela");
                return;
            }
        }
    }

    public static void atributos() {
        for (int i = 0; i < indice; i++) {
            JOptionPane.showMessageDialog(null, perros[i]);
        }
    }
}
