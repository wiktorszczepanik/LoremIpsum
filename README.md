## LoremIpsum

The **LoremIpsum** is a Java program that allows users to generate placeholders in text form, using Lorem Ipsum. This tool is ideal for creating dynamic and customizable text for various documentation or design needs.

### Build JAR

The following oneliner clones the repository, compiles the Java sources, copies the required resources, and creates the **.jar** file.

```Bash
git clone https://github.com/wiktorszczepanik/LoremIpsum.git && cd LoremIpsum/ && javac -d out/production/LoremIpsum $(find src -name "*.java") && cp -r src/Text out/production/LoremIpsum/ && jar cfm LoremIpsum.jar META-INF/MANIFEST.MF -C out/production/LoremIpsum .
```

After running this command, the `LoremIpsum.jar` file will be generated in the project directory.
You can copy and use this **.jar** independently of the rest of the project.

### Example usage

These examples demonstrate how to run `LoremIpsum.jar` with all text types and help.

```Bash
$ java -jar LoremIpsum.jar 5 paragraphs
$ java -jar LoremIpsum.jar 10 sentences
$ java -jar LoremIpsum.jar 15 words
$ java -jar LoremIpsum.jar help
```
