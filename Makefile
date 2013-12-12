JAVA=~mwolfson/bin/java
JAVAC=~mwolfson/bin/javac
JFLAGS=-cp .:lib/java/junit.jar:lib/java/hamcrest-core-1.3.jar
sources = $(wildcard com/gildedrose/*.java)
classes = $(sources:.java=.class)

.PHONY: clean utest

all: $(classes)

clean:
	rm -f $(classes)

utest: $(classes)
	$(JAVA) $(JFLAGS) org.junit.runner.JUnitCore com.gildedrose.GildedRoseTest

%.class: %.java
	$(JAVAC) $(JFLAGS) $(sources)
