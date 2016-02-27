import subprocess
subprocess.call("java -cp bin:lib/java-cup-11b-runtime.jar Lexer " +
        "input_file", shell=True)
