

public class BmExercicio3 {
    public static void main(String[] args) {
        double item1 =  2.95;
        double item2 = 3.50;
        double custoTotal= item1 + item2;
        double taxa = 0.825;
        
        System.out.println("Item 1 custa:" + item1);
        System.out.println("Item 2 custa:" + item2);
        System.out.println("A soma dos itens é:" +custoTotal);

        double taxaCalculada = (custoTotal * taxa) + custoTotal;

        System.out.println("Taxa calculada: "+ taxaCalculada);
        double novoCusto = ((item1 * taxaCalculada)+ item1)+((item2 * taxaCalculada)+item2);
        System.out.println("Novo Custo: " + novoCusto);
        boolean muitoCaro = (novoCusto <= 10) ? false : true;
        System.out.println(muitoCaro);
        
    }
}
