package Controlador;

import Modelo.Empleado;
import javax.swing.JOptionPane;

public class ListaDoble {

    //Atributos 
    Empleado ptr;

    //Constructor de la lista;
    public ListaDoble() {
        ptr = null;
    }

    //Crear empleado 
    public Empleado crearEmpleado(String codigo, String nombre, int horas, double tarifa) {
        Empleado nuevo = new Empleado(codigo, nombre, horas, tarifa);
        return nuevo;
    }

    //metodo agregar
    public void agregar(Empleado nuevo) {
        Empleado z;
        if (ptr == null) {
            ptr = nuevo;
        } else {
            z = ptr;
            while (z.getSig() != null) {
                z = z.getSig();
            }
            z.setSig(nuevo);
            nuevo.setAnt(z);
        }
    }

    //listar
    public String listar() {
        Empleado q;
        String salida = "";
        if (ptr != null) {
            q = ptr;
            while (q != null) {
                salida = salida + "El Codigo es: " + q.getCodigo()
                        + "\nEl nombre es: " + q.getNombre()
                        + "\nLas horas trabajadas son: " + q.getHoras()
                        + "\nLa tarifa del empleado es: " + q.getTarifa()
                        + "\nEl pago para el empleado es: " + q.getPago()
                        + "\n\n";
                q = q.getSig();
            }
        } else {
            salida = "La lista esta vacia";
        }
        return salida;
    }

    //Buscar empleado
    public Empleado buscar(String codigo) {
        Empleado p = null, q = null;
        if (ptr != null) {
            q = ptr;
            while (q != null) {
                if (q.getCodigo().equals(codigo)) {
                    p = q;
                    q = null;
                } else {
                    q = q.getSig();
                }
            }
            return (p);
        } else {
            return (null);
        }
    }

    //Eliminar
    public void eliminarEmpleado(String codigo) {
        Empleado z, p, q;
        if (ptr != null) {
            if (ptr.getCodigo().equals(codigo)) {
                p = ptr.getSig();
                if (p == null) {
                    ptr = p;

                } else {
                    ptr = p;
                    ptr.setAnt(null);
                }
                JOptionPane.showMessageDialog(null, "El empleado ha sido eliminado!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            } else {
                z = buscar(codigo);
                if (z != null) {
                    if (z.getSig() != null) {
                        p = z.getAnt();
                        q = z.getSig();
                        z.setAnt(null);
                        z.setSig(null);
                        p.setSig(q);
                        q.setAnt(p);
                        JOptionPane.showMessageDialog(null, "El empleado ha sido eliminado!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        p = z.getAnt();
                        z.setAnt(null);
                        p.setSig(null);
                        JOptionPane.showMessageDialog(null, "El empleado ha sido eliminado!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El empleado no se encuentra en la lista!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacia!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //modificar
    public void modificarEmpleado(Empleado p, String nombre, int horas, double tarifa) {
        p.setNombre(nombre);
        p.setHoras(horas);
        p.setTarifa(tarifa);
        p.setPago(horas * tarifa);
    }

    // verificar si es un codigo
    public boolean Escodigo(String cad) {
        if (cad.matches("[0-9]*")) {
            return (true);
        } else {
            return (false);
        }
    }

    //Es un entero para las horas
    public boolean Esentero(String cad) {
        if (cad.matches("[0-9]*")) {
            return (true);
        } else {
            return (false);
        }
    }
  //Verifica si es un número decimal
    public boolean Esdecimal(String cad) {
        if (cad.matches("[0-9]*['.']?[0-9]")) {
            return (true);
        } else {
            return (false);
        }
    }

    //Convertir de coma a punto
    public String convertir_coma(String tarifa) {
        String cad = "";
        int lc = tarifa.length(), i = 0;
        while (i < lc) {
            if (tarifa.charAt(i) == ',') {
                cad = cad + ".";
            } else {
                cad = cad + Character.toString(tarifa.charAt(i));
            }
            i++;
        }
        return (cad);
    }
    //Verfica si es un nombre o apellido

    public boolean Esnombre(String cad) {
        boolean sw = true;
        int lc = cad.length(), i = 0;
        char simbolo;
        while ((i < lc) && (sw)) {
            simbolo = cad.charAt(i);
            if (!(Character.isLetter(simbolo) || Character.isWhitespace(simbolo))) {
                sw = false;
            }
            i++;
        }
        return (sw);
    }
    //Indica si la lista esta vacia o no vacia

    public boolean esvacia() {
        if (ptr == null) {
            return (true);
        } else {
            return (false);
        }
    }

    public Empleado getpuntero() {
        return (ptr);
    }
    //Devuelve el tamaño de la lista

    public int contarregistros() {
        Empleado q = ptr;
        int n = 0;
        if (ptr != null) {
            while (q != null) {
                n++;
                q = q.getSig();
            }
            return (n);
        } else {
            return (n);
        }
    }
}
