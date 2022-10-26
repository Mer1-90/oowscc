from jpype import startJVM,getDefaultJVMPath,java,shutdownJVM
startJVM(getDefaultJVMPath(), "-ea")
java.lang.System.out.println("hello world")
shutdownJVM()