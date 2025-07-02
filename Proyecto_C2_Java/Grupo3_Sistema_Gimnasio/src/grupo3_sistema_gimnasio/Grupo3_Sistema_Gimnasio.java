/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupo3_sistema_gimnasio;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Grupo3_Sistema_Gimnasio {

    /**
     * @param args the command line arguments
     */
    /// CREAMOS CLASE PREDETERMINADAS Y LA NUEVA CLASE

    private static Actividad nuevaActividad;
    private static Actividad Yoga = new Actividad("Yoga", "Horario 6:00", 6, 0);
    private static Actividad Crossfit = new Actividad("Crossfit", "Horario 7:00", 7, 0);
    private static Actividad Zumba = new Actividad("Zumba", "Horario 8:00", 8, 0);
    private static Actividad Pilates = new Actividad("Pilates", "Horario 17:00", 13, 0);
    private static Actividad funcionales = new Actividad("funcionales", "Horario 18:00", 7, 0);
    private static Actividad Boxeo = new Actividad("Boxeo", "Horario 19:00", 11, 0);
    private static Socio socio1 = new Socio("Juan", 1252, true);
    private static Socio socio3 = new Socio("Matias", 3828, false);

    /// INICILIZAMOS TODOS LOS OBJETOS

    public static Socio getSocio3() {
        return socio3;
    }

    public static void setSocio3(Socio socio3) {
        Grupo3_Sistema_Gimnasio.socio3 = socio3;
    }

    public static Socio getSocio1() {
        return socio1;
    }

    public static void setSocio1(Socio socio1) {
        Grupo3_Sistema_Gimnasio.socio1 = socio1;
    }

    public static Actividad getNuevaActividad() {
        return nuevaActividad;
    }

    public static void setNuevaActividad(Actividad nuevaActividad) {
        Grupo3_Sistema_Gimnasio.nuevaActividad = nuevaActividad;
    }

    public static Actividad getYoga() {
        return Yoga;
    }

    public static void setYoga(Actividad Yoga) {
        Grupo3_Sistema_Gimnasio.Yoga = Yoga;
    }

    public static Actividad getCrossfit() {
        return Crossfit;
    }

    public static void setCrossfit(Actividad Crossfit) {
        Grupo3_Sistema_Gimnasio.Crossfit = Crossfit;
    }

    public static Actividad getZumba() {
        return Zumba;
    }

    public static void setZumba(Actividad Zumba) {
        Grupo3_Sistema_Gimnasio.Zumba = Zumba;
    }

    public static Actividad getPilates() {
        return Pilates;
    }

    public static void setPilates(Actividad Pilates) {
        Grupo3_Sistema_Gimnasio.Pilates = Pilates;
    }

    public static Actividad getFuncionales() {
        return funcionales;
    }

    public static void setFuncionales(Actividad funcionales) {
        Grupo3_Sistema_Gimnasio.funcionales = funcionales;
    }

    public static Actividad getBoxeo() {
        return Boxeo;
    }

    ///INICIALIZAMOS
    //
    public static void setBoxeo(Actividad Boxeo) {
        Grupo3_Sistema_Gimnasio.Boxeo = Boxeo;
    }

    public static void main(String[] args) {
        ///MENU DE CREAR ACTIVIDAD, MOSTRAR ESTADO DE ACTIVIDADES Y EDITAR LAS ACTIVIDADES

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar al menu?");

        boolean estadoMenu = (opcion == JOptionPane.YES_OPTION);

        cabinasInsonorizadas cabinas = new cabinasInsonorizadas();
        auditorioFitness auditorio = new auditorioFitness();
        espaciosRecreativos recreativos = new espaciosRecreativos();

        while (estadoMenu) {

            int option2 = Integer.parseInt(JOptionPane.showInputDialog("¿Que Deseas Editar?\n"  /// CREAMOS LA VARIABLE PARA EL SWITCH
                    + "1. Clases Disponibles\n"
                    + "2. Editar Clases\n"
                    + "3. Crear Clase \n"
                    + "4. Registrasr a un socio en una clase \n"
                    + "5. Sala de Pesas \n"
                    + "6. Cabinas Insonorizadas \n"
                    + "7. Auditorio Fitness \n"
                    + "8. Espacios Recreativos \n"
                    + "9. Salir"));

            switch (option2) {
                case 1:
                    JOptionPane.showMessageDialog(null, "ESTA SON LA CLASES DISPONIBLES DE LA MAÑANA:  \n"
                            + Yoga.toString() + "  \n"
                            + Crossfit.toString() + "  \n"
                            + Zumba.toString() + "  \n"
                            + "ESTA SON LA CLASES DISPONIBLES DE LA NOCHE:  \n"
                            + Pilates.toString() + "  \n"
                            + funcionales.toString() + "  \n"
                            + Boxeo.toString());
                    break;

                case 6:
                    /// MENU PARA CABINAS INSONORIZADAS
                    boolean seguirCabinas = true;
                    while (seguirCabinas) {
                        int opCabina = Integer.parseInt(JOptionPane.showInputDialog(" CABINAS INSONORIZADAS \n"
                                + "1. Registrar Entrada \n"
                                + "2. Registrar Salida \n"
                                + "3. Ver Disponibilidad \n"
                                + "4. Salir"));
                        switch (opCabina) {
                            case 1:
                                cabinas.registrarEntrada(socio1);
                                break;
                            case 2:
                                cabinas.registrarSalida(socio1);
                                break;
                            case 3:
                                cabinas.verDisponibilidad();
                                break;
                            case 4:
                                seguirCabinas = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "La opcion no es valida");
                        }
                    }
                    break;

                case 7:
                    /// MENU PARA AUDITORIO FITNESS
                    boolean seguirAuditorio = true;
                    while (seguirAuditorio) {
                        int opAuditorio = Integer.parseInt(JOptionPane.showInputDialog(" AUDITORIO FITNESS \n"
                                + "1. Registrar Entrada \n"
                                + "2. Registrar Salida \n"
                                + "3. Ver Asistencia \n"
                                + "4. Salir"));
                        switch (opAuditorio) {
                            case 1:
                                auditorio.registrarEntrada(socio1);
                                break;
                            case 2:
                                auditorio.registrarSalida(socio1);
                                break;
                            case 3:
                                auditorio.verAsistencia();
                                break;
                            case 4:
                                seguirAuditorio = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "La opcion no es valida");
                        }
                    }
                    break;

                case 8:
                    /// MENU PARA ESPACIOS RECREATIVOS
                    boolean seguirRecreativos = true;
                    while (seguirRecreativos) {
                        int opRecreativo = Integer.parseInt(JOptionPane.showInputDialog(" ESPACIOS RECREATIVOS \n"
                                + "1. Registrar Entrada \n"
                                + "2. Registrar Salida \n"
                                + "3. Ver Capacidad \n"
                                + "4. Salir"));
                        switch (opRecreativo) {
                            case 1:
                                recreativos.registrarEntrada(socio1);
                                break;
                            case 2:
                                recreativos.registrarSalida(socio1);
                                break;
                            case 3:
                                recreativos.verCapacidad();
                                break;
                            case 4:
                                seguirRecreativos = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "La opcion no es valida");
                        }
                    }
                    break;

                // Los demás case (2 al 5 y 9) se mantienen como los tenías.
            }

            // consultamos si desea seguir editando
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea ingresar de nuevo al MENU");
            estadoMenu = (respuesta == JOptionPane.YES_OPTION);
        }
    }
}
