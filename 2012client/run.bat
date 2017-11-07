@echo off
"C:\Program Files\Java\jdk1.8.0_112\bin\java.exe" -Xmx256m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC -cp bin;./clientlibs.jar; Loader
pause