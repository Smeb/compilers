import subprocess
fname = "input"
subprocess.call("java -cp bin:lib/java-cup-11b-runtime.jar SC" +
        " " + fname, shell=True)
