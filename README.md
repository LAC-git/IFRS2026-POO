## Atividade Avaliativa: Classe Estudante

### Como executar:

> Se tiver acesso a nix flakes da pra rodar `$ nix develop` pra ganhar um compilador java

Os comandos a seguir compilam o código, colocam os `.class` no diretório `out` e rodam:

`$ javac -d out src/*.java`

`$ java -cp out Main` -- Esse não faz nada pq a Main ta vazia
