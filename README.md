## This git serves https://github.com/apache/shardingsphere/issues/22736

- In the jdk 17 environment, execute `./gradlew clean test` to verify the problem.
- Of course, you need to make sure the Docker CLI is available to use TestContainer.
```shell
git clone git@github.com:linghengqian/mybatis-stdout-shardingsphere-test.git
cd ./mybatis-stdout-shardingsphere-test/
sdk install java 22.3.r17-grl
sdk use java 22.3.r17-grl
./gradlew clean test
```