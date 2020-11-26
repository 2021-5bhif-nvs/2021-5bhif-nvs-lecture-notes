mvn io.quarkus:quarkus-maven-plugin:1.9.2.Final:create \
    -DprojectGroupId=at.htl \
    -DprojectArtifactId=quarkus-karate-demo \
    -DclassName="at.htl.karate.boundary.GreetingResource" \
    -Dpath="/hello"
