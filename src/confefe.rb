require "java"

$CLASSPATH << "classes"
$CLASSPATH << "lib/antlr-4.7.1-complete.jar"
$CLASSPATH << "lib/antlr-denter-1.1.jar"

java_import "confefe.grammar.ConfefeBaseListener"
java_import "confefe.grammar.ConfefeListener"
java_import "confefe.grammar.ConfefeLexer"
java_import "confefe.grammar.ConfefeParser"

class Confefe
  class << self
    include_package "org.antlr.v4.runtime"
    include_package "org.antlr.v4.runtime.tree"

    def parse_file(path)
      parse(File.read(path))
    end

    def parse(content_string)
      # create a CharStream that reads from standard input
      input = CharStreams.fromString(content_string)  # create a lexer that feeds off of input CharStream
      lexer = ConfefeLexer.new(input)                 # create a buffer of tokens pulled from the lexer
      tokens = CommonTokenStream.new(lexer)           # create a parser that feeds off the tokens buffer
      parser = ConfefeParser.new(tokens)
      tree = parser.file()                            # begin parsing at the start rule
      puts tree.toStringTree(parser)                  # print LISP-style tree
    end
  end
end

def main
  names = Confefe.parse_file("examples/names_list.cf")
  puts names.inspect
end

main