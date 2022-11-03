# 🎯 SpringBoot-Cassandra ?

<img src="https://github.com/rasitesdmr/SpringBoot-Cassandra/blob/master/image/cas7.jpg">

## 📌 docker-compose.yaml

```yaml
docker-compose up --build -d
```

```yaml
docker-compose down -v
```

## 📌 Maven Dependencies

```xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-cassandra</artifactId>
</dependency>
```

## 📌 Swagger Service

* http://localhost:5555/swagger-ui/index.html

# 🎯 Cassandra ?

<img src="https://github.com/rasitesdmr/SpringBoot-Cassandra/blob/master/image/cas3.png">
<img src="https://github.com/rasitesdmr/SpringBoot-Cassandra/blob/master/image/cas2.PNG">
<img src="https://github.com/rasitesdmr/SpringBoot-Cassandra/blob/master/image/cas1.png">

# 📌 Cassandra Create Keyspace ?

```shell
# cqlsh
Connected to Test Cluster at 127.0.0.1:9042
[cqlsh 6.0.0 | Cassandra 4.0.7 | CQL spec 3.4.5 | Native protocol v5]
Use HELP for help.
```

```shell
cqlsh> CREATE KEYSPACE studentkeyspace WITH replication = {'class':'SimpleStrategy','replication_factor':1};
```

```shell
cqlsh> describe keyspaces;

studentkeyspace  system_auth         system_schema  system_views
system           system_distributed  system_traces  system_virtual_schema
```

# 📌 Cassandra Create Table ?

```shell
cqlsh> use studentkeyspace;
```

```shell
cqlsh:studentkeyspace> CREATE TABLE student(studentnumber int PRIMARY KEY,firstname text,lastname text,email text);
```

## 📌 Steps

<img src="https://github.com/rasitesdmr/SpringBoot-Cassandra/blob/master/image/cas9.png">

<img src="https://github.com/rasitesdmr/SpringBoot-Cassandra/blob/master/image/cas10.png">



