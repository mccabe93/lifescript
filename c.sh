echo "Removing all class files..."
rm *.class
echo "Running ANTLR tool..."
java org.antlr.Tool lifescript.g
echo "Compiling..."
javac lifescript.java
echo "Complete"
