/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.umanizales.listase.modelo;

/**
 *
 * @author Nicolas Trujillo
 */
public class ListaDE {
    private NodoDE cabeza;
    //Otros metodos
    
    public ListaDE() {    
    }     

    public NodoDE getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoDE cabeza) {
        this.cabeza = cabeza;
    }
    
    /**
     * Método para adicionar un nodo
     * 
        - Si tiene perros
            llamar a un ayudante
            recorrer todos los perros , mirando si tienen otro ammarrado
            cuando llegue al perro libre (No ammarrado a otro)
            amarra el nuevo perro

        si no tiene perros
           El perro entrante Es la cabeza
     */
    public void adicionarNodo(Perro dato)
    {
        if(cabeza!=null)
        {
            NodoDE temp = cabeza;
            while (temp.getSiguiente()!=null)
            {
                temp= temp.getSiguiente();
            }
            //PArado en el ultimo
            temp.setSiguiente(new NodoDE(dato));
        }
        else
        {
            cabeza = new NodoDE(dato);
        }
    }
    
    
    /**
     * Método que sirve para contar la cantidad de elementos de la Lista SE  
     * @return int cantidad de elementos
     */
//    public int contarNodos()  //cabeza
//    {
//        if(cabeza!=null)
//        {
//            Nodo temp= cabeza;
//            int cont=1;
//            while(temp.getSiguiente()!=null) //Mientras el lazo este lleno
//            {
//                temp = temp.getSiguiente(); // Ayudante pase al siguiente perro
//                cont++;
//            }
//            return cont;
//        }
//        else
//        {
//            return 0;
//        }
//    }
    
    /**
     * Método que adiciona un nodo al inicio
     * @param dato Dato a agregar     * 
     */
    public void adicionarAlInicio(Perro dato)
    {
        if(cabeza!=null)
        {
            //Si ya hay datos
            NodoDE temp = new NodoDE(dato);
            temp.setSiguiente(cabeza);
            cabeza.setAnterior(temp);
            cabeza = temp;
        }
        else
        {
            cabeza = new NodoDE(dato);
        }
    }
    
    public void eliminarPorPosicion(int posicion)
    {
        if(cabeza!=null)
        {
            if(posicion ==1)
            {
                cabeza = cabeza.getSiguiente();
                if(cabeza != null)
                {
                    cabeza.setAnterior(null);
                }
            }
            else
            {
                NodoDE temp= cabeza;
                int contador=1;
                while(contador != posicion -1)
                {
                    temp = temp.getSiguiente();
                    contador++;
                }
                //Estoy parado en ela anterior del que hay que eliminar
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                if(temp.getSiguiente()!= null)
                {
                    temp.getSiguiente().setAnterior(temp);
                }
            }
        }
    }
    
    public void eliminar(Perro dato)
    {
        if(cabeza!=null)
        {
            NodoDE temp = cabeza;
            while(temp.getDato().getNumero()!= dato.getNumero())
            {
                temp= temp.getSiguiente();                
            }
            if(temp== cabeza)
            {
                cabeza = cabeza.getSiguiente();
                if(cabeza!= null)
                {
                    cabeza.setAnterior(null);
                }
                else
                {
                    temp.getAnterior().setSiguiente(temp.getSiguiente());
                    if(temp.getSiguiente()!= null)
                    {
                        temp.getSiguiente().setAnterior(temp.getAnterior());
                    }
                }
            }
        }
    }
    
    /**
     * Método que permite intercambiar los datos de los extremos de la lista     * 
     */
//    public void intercambiarExtremos()
//    {
//        if(cabeza!=null)
//        {
//           Nodo temp = cabeza;
//           while(temp.getSiguiente()!=null)
//           {
//               temp = temp.getSiguiente();
//           }
//           /// Parado en el último nodo
//           Perro perrotemp = cabeza.getDato();
//           cabeza.setDato(temp.getDato());
//           temp.setDato(perrotemp);           
//        }
//    }
    
    
//    public void invertir() {
//        if (cabeza != null) {
//            ListaSE listaTemporal = new ListaSE();
//            Nodo temp = cabeza;
//            while (temp != null)//Recorre de principio a fin
//            {
//                listaTemporal.adicionarNodoAlInicio(temp.getDato());
//                temp = temp.getSiguiente();//Ayudante pase al siguiente perro
//            }
//            cabeza = listaTemporal.getCabeza();
//        }
//    }
    
//    public void eliminarPerro(short numero ) 
//    {
//        if(cabeza !=null)
//        {
//            if(cabeza.getDato().getNumero()==numero)
//            {
//                cabeza=cabeza.getSiguiente();
//                return;
//            }
//            else
//            {
//                Nodo temp=cabeza;
//                while(temp.getSiguiente()!=null)
//                {
//                    if(temp.getSiguiente().getDato().getNumero()== numero)
//                    {
//                        //el que sigue es el que hay que eliminar
//                        temp.setSiguiente(temp.getSiguiente().getSiguiente());
//                        return;
//                    }
//                    temp = temp.getSiguiente();
//                }
//                
//            }
//        }
//        
//    }
    
    /**
     * Metodo para encontrar un perro por posicion
     * @param posicion recive la poasicion a buscar
     * @return Perro información del nodo encontrado
     */
    
//    public Perro encontrarxPosicion(int posicion){
//        
//        if(cabeza!=null)
//        {
//            Nodo temp = cabeza;
//            int cont = 1;
//            while(posicion!=cont)
//            {
//                temp = temp.getSiguiente();
//                cont++;
//            }
//            //Estamos parados en el que estabamos buscando
//            return temp.getDato();
//        }
//        
//        return null;
//    }
}
