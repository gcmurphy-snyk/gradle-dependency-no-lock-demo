### dependency-lock-demo

This repository shows how you can generate lockfiles at the root of the project
for each subproject. The task can be run as:

```
    # Creates a lockfile at the root for each subproject
    ./gradlew resolveAndLockAll --write-locks
```


