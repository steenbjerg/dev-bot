# dev-bot

## Project Setup

Project created by this command:
```script
mvn io.quarkus:quarkus-maven-plugin:3.0.1.Final:create \
    -DplatformVersion=3.0.1.Final \
    -DprojectGroupId=dk.stonemountain.github \
    -DprojectArtifactId=dev-bot \
    -Dextensions="io.quarkiverse.githubapp:quarkus-github-app:2.0.0" \
    -DnoCode \
    -DbuildTool=gradle

```

Github app registration. 

webhook secret: 
```script
sudo apt install pwgen
pwgen -N 1 -s 40
```



## Related Guides

- GitHub App ([guide](https://quarkiverse.github.io/quarkiverse-docs/quarkus-github-app/dev/index.html)): Automate GitHub tasks with a GitHub App
