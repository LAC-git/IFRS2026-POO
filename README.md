## Formula 1
### Como executar:

> Se tiver acesso a nix flakes da pra rodar `$ nix develop` pra ganhar um compilador java

Os comandos a sequir compilam o código, colocam os `.class` no diretório `out` e o rodam:

`$ javac -d out src/avaliacao/formula1/*.java`

`$ java -cp out avaliacao.formula1.Main`
