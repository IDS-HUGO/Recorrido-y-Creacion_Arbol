import java.util.Scanner;
public class Arbol_binario{

    public void visualizarMenu(){
        
        int opcion, valor;
        Scanner entrada = new Scanner(System.in);
        Nodo raiz = new Nodo();
        do{
            System.out.println("1)Crear arbol\n 2)Imprimir recorridos");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el valor de un nodo");
                    valor = entrada.nextInt();
                    raiz.setDato(valor);
                    crearArbol(raiz);
                    break;
                case 2:
                    Recorrido r =  new Recorrido();
                    System.out.println("Preorden");
                    r.preorden(raiz);
                    System.out.println("Inorden");
                    r.inorden(raiz);
                    System.out.println("Postorden");
                    r.postorden(raiz);
                    break;
            }
        }while (opcion!=3);
    
    }
    public void crearArbol(Nodo nodo){
        int valor, respuesta;
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Existe nodo por la izquierda de  " + nodo.getDato()+": (1)SI   (2)NO?");
        respuesta = entrada.nextInt();

        if (respuesta ==1) {
            System.out.println("Ingrese el valor del nodo");
            valor = entrada.nextInt();
            Nodo subizq = new Nodo(valor);
            nodo.setIzq(subizq);
            crearArbol(subizq);
        }

        System.out.println("Existe un nodo por la derecha  " + nodo.getDato()+": (1)SI   (2)NO?");
        respuesta = entrada.nextInt();
        if (respuesta ==1) {
            System.out.println("Ingresa el valor del nodo");
            valor = entrada.nextInt();
            Nodo subder = new Nodo(valor);
            nodo.setDer(subder);
            crearArbol(subder);
        }
    }
    }