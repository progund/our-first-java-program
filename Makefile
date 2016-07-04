CLASSES=lib/Greeter.class

SOURCES=$(CLASSES:.class=.java)

TESTCLASS=lib/test/GreeterTester
SIMPLECLASS=Simple

%.class:%.java
	javac $<

simple:$(SIMPLECLASS).class
	java $(SIMPLECLASS)

test: $(TESTCLASS).class
	java $(TESTCLASS)

print:
	echo "$(CLASSES)"
	echo "$(SOURCES)"

clean:
	-find . -name "*~"  | xargs rm
	-find . -name "#*"  | xargs rm
	-find . -name "*.class"  | xargs rm

