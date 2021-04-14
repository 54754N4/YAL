# Script arguments
param ($Target="-tokens")
# Options
$lang = "Yal"
$startRule = "script"

# Paths
$antlr = "D:\Desktop\Workspaces\Java\ANTLRv4\antlr-4.9.1-complete.jar"
$project = "D:\Desktop\Workspaces\Java\Eclipse Workspace 2020\YAL"
$javas = "$project\target\generated-sources\antlr4"
$script = "$project\scripts\test.yal"

Copy-Item "$project\*.g4" -Destination $javas
cd $javas

# All should be good now, do the usual
Write-Host "Adding to classpath temporarily.." -NoNewLine
$env:CLASSPATH = ".;$antlr;$env:CLASSPATH"
Write-Host " done."

Write-Host "Generating Java files from grammar.." -NoNewLine
java -cp ".;$antlr" org.antlr.v4.Tool "*.g4" -listener -visitor
Write-Host " done."

Write-Host "Compiling java files.." -NoNewLine
javac -cp ".;$antlr" *.java
Write-Host " done."

Write-Host "Running.."
java -Xmx500M -cp ".:$env:CLASSPATH" org.antlr.v4.gui.TestRig $lang $startRule $Target $script
del *.g4