The simple cases implementation of Antlr4.

[ANTLR4](https://www.antlr.org/index.html) 

Antlr4 maven dependencies and plugins:
```xml
<dependencies>
    <dependency>
        <groupId>org.antlr</groupId>
        <artifactId>antlr4-runtime</artifactId>
        <version>${antlr.version}</version>
    </dependency>
</dependencies>

<build>
    <plugins>
        <plugin>
            <groupId>org.antlr</groupId>
            <artifactId>antlr4-maven-plugin</artifactId>
            <version>${antlr.version}</version>
            <executions>
                <execution>
                    <goals>
                        <goal>antlr4</goal>
                    </goals>
                </execution>
            </executions>
            <configuration>
                <visitor>true</visitor>
                <listener>true</listener>
                <sourceDirectory>./src/main/resources</sourceDirectory>
            </configuration>
        </plugin>
    </plugins>
</build>
```
