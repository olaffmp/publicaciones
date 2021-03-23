/*
Alumno: Olaff Medina Pe�a
Se prodra realzar un arrayList del tipo Object? Segun yo si es posible hacer un arrayList del tipo Object ya que anterior mente hemos hecho arrayList de obejtos de una clase
asi que supongo que es la misma dinamica por lo tanto si es posible
Pregunta de refelxion y de calificacion

*/

package publicacion;

import java.util.Scanner;
public class MenuPrincipal{

    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
        int opc, opc2; 
        int ctrlpub = 0;

        Object publicaciones [] = new Object[10]; //reservamos espacio
        
        do{
          System.out.println("[1] Dar de alta una publicacion");
          System.out.println("[2] Mostrar el contenido");
          System.out.println("[3] SALIR ");
          System.out.print("\nDel [1-3] Eliga la opcion: ");
          opc = leer.nextInt();
          
          switch(opc){
            case 1: //CASE 1 PRIMERA OPCION DEL MENU
               System.out.println("Que deseas dar de alta?");
               System.out.println("[1] Revista");
               System.out.println("[2] Periodico");
               System.out.println("[3] Libro");
               System.out.println("[4] REGRESAR");
               System.out.println("Del [1-4] ingrese la opcion: ");
               opc2=leer.nextInt();
               switch(opc2){
                  case 1: 
                      System.out.println("--- REVISTA: ---");
                      //Revista
                      String issn, titulo;
                      double precio; 
                      int numero, anio, numPag;
                      Revista revista = new Revista();
                      
                      leer.nextLine();
                      System.out.print("\n INGRESA ISSN: ");
                      issn=leer.nextLine();
                      
                      revista.setISSN(issn);//agregacion de la lectura del issn
                      
                      System.out.print("\nINGRESA EL TITULO: ");
                      titulo=leer.nextLine();
                      revista.setTitulo(titulo);
                      
                      
                      System.out.print("\nINGRESA EL PRECIO: ");
                      precio=leer.nextDouble();
                      revista.setPrecio(precio);
                      
                      //int
                      System.out.print("\nIngrese el numero de revista: ");
                      numero=leer.nextInt();
                      revista.setNumero(numero);
                      
                      //a�o es int
                      System.out.print("\nIngrese el anio: ");
                      anio=leer.nextInt();
                      revista.setAnio(anio);
                      
                      //num paginas int
                      System.out.print("\nIngrese el numero de paginas: ");
                      numPag=leer.nextInt();
                      revista.setNumpag(numPag);
                      
                      publicaciones[ctrlpub] = revista;
                      ctrlpub++;

                     break;
                  case 2: 
                     System.out.println("___INGRESO DE PERIODICO___");
                     String sec, tituloPeriodico, autor, editor;
                     double precioPeriodico;
                     int numeroPagPeriodico;
                     Periodico periodico = new Periodico();
                     leer.nextLine();
                   
                     System.out.print("\n INGRESA LA SECCION: ");
                     sec=leer.nextLine();
                     periodico.setSECCIONES(sec);
                     
                     
                     System.out.print("\n INGRESA LA EDICION: ");
                     editor=leer.nextLine();
                     periodico.setEditor(editor);
                     
                     publicaciones [ctrlpub] = periodico; //guarda el objeto en el arreglo
                     ctrlpub++;
                     
                  break;

                  case 3: 
                     System.out.println("- - - LIBRO - - -");
                     
                     String isbnLibro,tituloLibro,autorLibro,edicionLibro;
                     double precioLibro;
                     int numeroPagLibro;
                     Libro libro = new Libro();
                     leer.nextLine();
                   
                     System.out.print("\nISBN: ");
                     isbnLibro=leer.nextLine();
                     libro.setISBN(isbnLibro);
                     
                     System.out.print("\nTITULO: ");
                     tituloLibro=leer.nextLine();
                     libro.setTitulo(tituloLibro);
                     
                     System.out.print("\nAUTOR: ");
                     autorLibro=leer.nextLine();
                     libro.setAutor(autorLibro);
                     
                     System.out.print("\nEDICION: ");
                     edicionLibro=leer.nextLine();
                     libro.setEdicion(edicionLibro);
                     
                     System.out.print("\nPRECIO: ");
                     precioLibro=leer.nextDouble();
                     libro.setPrecio(precioLibro);
                     
                     System.out.print("\nNUM DE PAGINAS: ");
                     numeroPagLibro=leer.nextInt();
                     libro.setNumpag(numeroPagLibro);
                     
                     publicaciones [ctrlpub] = libro; //guarda el objeto en el arreglo
                     ctrlpub++;
                     
                  break;
               }//switch de 2da opcion
               break;
               
            case 2: //CASE 2 PRIMERA OPCION DEL MENU MOSTRAR EL CONTENIDO
               System.out.println("- - - MOSTRANDO DATOS DEL ARREGLO - - -");
                //Ahora mostramos el contenido del arreglo     

                //Mostrar el arreglo
              for(int i = 0; i < ctrlpub; i ++ ){
                   System.out.println("  " + publicaciones [i].getClass());
                    if(publicaciones[i] instanceof Revista) {
                         Revista rev = new Revista();
                         rev = (Revista)publicaciones[i];
                          System.out.println("----REVISTA----");
                          System.out.println("ISSN " + rev.getISSN());
                          System.out.println("TITULO: " + rev.getTitulo());
                          System.out.println("PRECIO: " + rev.getPrecio());
                          System.out.println("NUMERO DE REVISTA: " + rev.getNumero());
                          System.out.println("ANIO: " + rev.getAnio());
                          System.out.println("NUMERO PAGINAS:  " + rev.getNumpag());



      
                    }
                    else if (publicaciones[i] instanceof Libro ){
                        Libro lib = new Libro();
                        lib = (Libro)publicaciones[i];
                        System.out.println("---LIBRO---");
                        System.out.println("ISBN " + lib.getISBN());
                        System.out.println("TITULO: " + lib.getTitulo());
                        System.out.println("AUTOR: " + lib.getAutor());
                        System.out.println("PRECIO: " + lib.getPrecio());
                        System.out.println("EDICION: " + lib.getEdicion());
                        System.out.println("numero de paginas:  " + lib.getNumpag());
                    }
                     else if (publicaciones[i] instanceof Periodico ){
                        Periodico periodico = new Periodico();
                        periodico = (Periodico)publicaciones[i];
                        System.out.println("---PERIODICO---");
                        System.out.println("SECCIONES: " + periodico.getSECCIONES());
                        System.out.println("EDITOR: " + periodico.getEditor());
                      }

              }
      
               break;
            case 3: //CASE 3 PRIMERA OPCION DEL MENU
               
               System.out.println("Programado por: Olaff Medina");
                    
               break;

          }//switch Primera opcion
          
        }while(opc!=3);
   }//main
     
}//Menu Principal
   