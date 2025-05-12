public class Media {
    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2.0;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();
        System.out.println("Média: " + calcularMedia(n1, n2));
        sc.close();
    }
}