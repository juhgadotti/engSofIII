public class Singleton {

    private static Singleton fila = null;
    public static String documento;

    private Singleton() {
    }

    public static Singleton getFila() {
        if (fila == null)
            fila = new Singleton();

        return fila;
    }
    
    public void ImprimeDocumento(){
        System.out.println("Imprimindo documento: " + documento);
    }
    
    public void RemoveDocumento(){
        System.out.println("Removendo documento da fila...");
    }
    
    public void RemoveTodosDocumentos(){
        System.out.println("Removendo todos os documentos da fila...");
    }
}
