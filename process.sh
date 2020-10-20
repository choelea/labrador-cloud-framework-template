#! /bin/bash

####
#  1,  更改文件夹路径
#  2， 替换package
#  3， 替换rootPackage
#  4， 替换artifactId
#  5， 替换作者
#
#
#############

######## Template Variable begin ########
originPackage=com.tyymt.wxplatform.service.order.hotel
originRootPackage=com.tyymt.wxplatform
originArtifactId=service-order-hotel
originAuthor=肖晟鹏
originEmail=xiaocpa@digitalchina.com
######## Template Variable End ####3

rootPackage=tech.icoding
package=tech.icoding.service.demo
artifactId=service-demo
author='Joe Li'
email=joe.lea@foxmail.com

originSubFolder=${originPackage//\./\/}
subFolder=${package//\./\/}
### 1 复制文件
mkdir -p $artifactId/$artifactId-sdk/src/main/java/$subFolder
cp -r $originArtifactId/$originArtifactId-sdk/src/main/java/$originSubFolder/sdk $artifactId/$artifactId-sdk/src/main/java/$subFolder/
cp $originArtifactId/$originArtifactId-sdk/pom.xml $artifactId/$artifactId-sdk/

mkdir -p $artifactId/$artifactId-sdk-cloud/src/main/java/$subFolder 
cp -r $originArtifactId/$originArtifactId-sdk-cloud/src/main/java/$originSubFolder/sdk $artifactId/$artifactId-sdk-cloud/src/main/java/$subFolder/
cp -r $originArtifactId/$originArtifactId-sdk-cloud/src/main/resources $artifactId/$artifactId-sdk-cloud/src/main/
cp $originArtifactId/$originArtifactId-sdk-cloud/pom.xml $artifactId/$artifactId-sdk-cloud/

mkdir -p $artifactId/$artifactId-common/src/main/java/$subFolder
cp -r $originArtifactId/$originArtifactId-common/src/main/java/$originSubFolder/common $artifactId/$artifactId-common/src/main/java/$subFolder/
cp $originArtifactId/$originArtifactId-common/pom.xml $artifactId/$artifactId-common/

mkdir -p $artifactId/$artifactId-facade/src/main/java/$subFolder
cp -r $originArtifactId/$originArtifactId-facade/src/main/java/$originSubFolder/facade $artifactId/$artifactId-facade/src/main/java/$subFolder/
cp $originArtifactId/$originArtifactId-facade/pom.xml $artifactId/$artifactId-facade/

mkdir -p $artifactId/$artifactId-api/src/main/java/$subFolder
cp -r $originArtifactId/$originArtifactId-api/src/main/java/$originSubFolder/api $artifactId/$artifactId-api/src/main/java/$subFolder/
cp $originArtifactId/$originArtifactId-api/pom.xml $artifactId/$artifactId-api/
cp -r $originArtifactId/$originArtifactId-api/src/main/resources $artifactId/$artifactId-api/src/main/

cp $originArtifactId/pom.xml $artifactId/
### 2 替换 package
grep -rl "$originPackage" ./$artifactId/  | xargs sed -i "" "s/$originPackage/$package/g"

### 3 替换 rootPackage
grep -rl "$originRootPackage" ./$artifactId/  | xargs sed -i "" "s/$originRootPackage/$rootPackage/g"

### 4 替换artifactId
grep -rl "$originArtifactId" ./$artifactId/  | xargs sed -i "" "s/$originArtifactId/$artifactId/g"

### 4 替换artifactId
grep -rl "$originAuthor" ./$artifactId/  | xargs sed -i "" "s/$originAuthor/$author/g"
grep -rl "$originEmail" ./$artifactId/  | xargs sed -i "" "s/$originEmail/$email/g"
today=$(date +20%y-%m-%d)
grep -rl "2020-10-16" ./$artifactId/  | xargs sed -i "" "s/2020-10-16/$today/g"