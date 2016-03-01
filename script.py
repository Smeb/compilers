import subprocess
subprocess.call("java -cp bin:lib/java-cup-11b-runtime.jar Main" +
        " show_lexing " +
        "input_file", shell=True)
