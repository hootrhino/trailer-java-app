# trailer-java-app

一个简单的rulex trailer的java demo app，默认监听`7701`端口

## 1. grpc的java代码生成

rulex主体程序与trailer间使用grpc交互。

proto文件路径：`src/main/proto/trailer.proto`

在`pom.xml`中已经做了protoc生成java代码的配置

若需要重新生成代码的，需要自行执行`mvn protobuf:compile protobuf:compile-custom`

生成的代码在trailer包中。

## 2. 打包
1. 执行`mvn package`
2. `java -jar trailer-java-app-1.0-SNAPSHOT.jar`