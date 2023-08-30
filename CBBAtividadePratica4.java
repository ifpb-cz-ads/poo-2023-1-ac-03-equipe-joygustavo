
/*Crie um programa que elabore o orçamento de uma construtora
para o cálculo do valor total de construção de uma piscina. O valor
total será dado pela cubagem da piscina (metros cúbicos) multiplicada por R$100,00,
que é o preço do metro cúbico construído de piscina. Faça a simulação dos cálculos no
programa para ver se está tudo funcionando corretamente. */

public class CBBAtividadePratica4 {
    public static void main(String[] args) {
        double precoPorMetro = 100;
        int comprimento = 10;
        int altura = 5;
        int largura = 2;

        int metroCubico = comprimento * altura * largura;

        double precoFinal = (double)precoPorMetro * metroCubico;

        System.out.println("O preço final eh:" +precoFinal);
    }
}
