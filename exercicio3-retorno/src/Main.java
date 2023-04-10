public class Main {
    public static void main(String[] args) throws Exception {
        
        double areaQuadradao = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadradao);
        
        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("Área do retângulo: " + areaRetangulo);
        
        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
}
