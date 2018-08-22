#!/usr/bin/env bash

# build Antlr4 parser from grammar
java -jar lib/antlr-4.7.1-complete.jar -Werror -package "confefe.grammar" -o tmp/ src/Confefe.g4

# compile generated code
javac -cp lib/antlr-4.7.1-complete.jar:lib/antlr-denter-1.1.jar -d classes/ tmp/src/ConfefeBaseListener.java tmp/src/ConfefeLexer.java tmp/src/ConfefeListener.java tmp/src/ConfefeParser.java

# remove the temporary files
rm -rf tmp/*