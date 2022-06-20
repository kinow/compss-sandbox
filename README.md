# COMPSs Sandbox

Sandbox to play with COMPSs.

Ref: https://github.com/bsc-wdc/apps

## Building

```bash
mvn clean package
cd target
```

`pom.xml` uses plug-ins to package the project dependencies in `target/lib`.

## Running

```bash
runcompss --tracing=true br.eti.kinoshita.compss.Simple 2
```
