********************************************
*                NOTAS GERAIS              *
********************************************

Para realização do programa foram criadas 4 classes distintas:

*Main: Classe com declarações de variáveis e instaciamento de objetos
*Coordenada: Método inicializador dos pontos, com métodos para sua construção e visualização.
*Robo: Classe utilizada para implementar ações, com métodos de mudança de direção e incremento de coordenadas.
*Verifica: Classe para informar erros de preenchimento, letras indevidas.



********************************************
*       Instruções de Inicialização        *
********************************************

Passos:

1.Em uma máquina com java e javac 9.0 ou superior instalados, abrir linha de comando;
2. Digitar "javac MarsRoversChallenge.java" nome do fonte onde estão aglutinadas as classes;
3.Após compilar o arquivo digitar "java Main", executando assim programa;


********************************************
*            Instruções de Execução        *
********************************************

Passos:

1. Os comandos de entrada são duas coordenadas e um cardinal na primeira linha, seguidos de comandos direcionais e incrementais na segunda.
Todos em caixa alta e espaçados. Na primeira linha o primeira valor corresponde a x, segundo a y e terceiro um dos 4 cardinais: N, S, W, E
(em inglês). Na segunda linha R significa virar a o cardinal apontado para o sentido direito, L para o esquerdo e M incrementa.
Sendo o ponto padrão situado no cardinal Norte (X, Y, N) e o incremento ocorrendo (X, Y+1, N), nesta situação.
Exemplos de incremento/decremento por cardinal:
N: (X, Y+1)
S: (X, Y-1)
E: (X+1, Y)
W: (X-1, Y)
Exemplos de entrada:

Entrada:
1 2 N                    // Ponto x, ponto y e cardinal
LMLMLMLMM               // Direcionais e incrementos
Saída Esperada:
1 3 N                  //Coordendas finais e cardinal para onde aponta

Entrada:
3 3 E                    // Ponto x, ponto y e cardinal
LMLMLMLMM               // Direcionais e incrementos
Saída Esperada:
5 1 E                  //Coordendas finais e cardinal para onde aponta



********************************************
*            Teste Automatizado            *
********************************************

O teste automatizado trata-se do arquivo MarsTeste.java, o arquivo não foi finalizado, porém sua lógica foi construída.
Basicamente aconteceriam N interações com valores randômicos dentro dos ranges de letras.
Primeira entre as letras "NSEW", para determinar cardinalidade;
Segundo para determinar a quantidade de movimentações;
Terceiro entre as letras "RLM" para determinar instruções de movimentação;

A ideia era justamente inserir estes dados dentro de um loop para verificar suas respectivas saídas.

O mesmo não foi terminado.
