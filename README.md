
## Questão 01


 a) (F) - o valor 300 é maior que o intervalo de valores permitido para a variável byte, que vai de -128 a 127.
b) (V) - o nome da variável começa com um símbolo válido ($), e o valor atribuído está dentro do intervalo permitido para short (-32768 a 32767).
c) (F) - a variável é do tipo inteiro (int), mas está sendo atribuído um valor decimal (2.5). É necessário usar um sufixo para indicar que o valor é do tipo float ou double.
d) (V) - a variável é do tipo double e o valor atribuído é um número inteiro.
e) (F) - o valor 25 é um valor inteiro, mas a variável é do tipo char, que armazena um caractere Unicode.
f) (V) - a expressão "(4%2==0)" retorna verdadeiro (true) porque o resto da divisão de 4 por 2 é zero, indicando que o número é par.
g)(F) - a variável é do tipo char, que pode armazenar apenas um caractere. Para armazenar uma string de caracteres, é necessário usar o tipo String.
h) (V) - a variável é do tipo String e contém o valor "1".
i) (V) - o valor atribuído (2.7) é do tipo float, que pode ser armazenado em uma variável do tipo float.
j) (F) - a variável é do tipo inteiro (int), mas está sendo atribuído um valor booleano (false).


## Questão 04

long long1 = 100; int int1 = 200; int int2 = (int) (int1 + long1); // conversão explícita para int System.out.println(int2); // imprime 300 Com a conversão explícita para int, a expressão (int1 + long1) retorna o valor 300, que pode ser atribuído à variável int2 sem problemas. O resultado é impresso como esperado. ,

