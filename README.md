## Lampada
### Como executar:

> Se tiver acesso a nix flakes da pra rodar `$ nix develop` pra ganhar um compilador java

Os comandos a sequir compilam o código, colocam os `.class` no diretório `out` e rodam:

`$ javac -d out src/avaliacao/lampada/Lampada.java src/Main.java"`
`$ java -cp out Main`
