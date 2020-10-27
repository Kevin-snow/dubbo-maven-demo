# dubbo-maven-demo
dubbo demo for maven

dubbo是一个RPC框架。

dubbo是一个典型的生产者、消费者的使用场景。
生产者提供给消费者所需要的接口。消费者进行接口调用。

生产者需要将接口抽象到接口服务中。接口服务启动时将接口信息注册到注册中心。
消费者需要在配置文件中，配置需要消费的接口。
生产者需要在配置文件中，配置需要暴露的接口，及实现类。

dubbo只是一个RPC框架。需要注册中心来支撑。注册中心分为很多种，
dubbo推荐使用zookeeper。
zookeeper是一个单独的服务，用于注册服务。

注意： dubbo2.6.0之前的版本中，需要依赖zkCli
      dubbo2.6.0之后的版本中，需要依赖curator
