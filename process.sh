#! /bin/bash

####
#  1,  拷贝文件夹及文件
#  2， 替换package
#  3， 替换rootPackage
#  4， 替换artifactId
#############

######## Template Variable begin ########
originPackage=tech.icoding.service.demo
originRootPackage=tech.icoding
originArtifactId=service-demo
######## Template Variable End ####3
read -p 'Root Package: ' rootPackage
read -p 'Package: ' package
read -p 'ArtifactId/Service Name: ' artifactId

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
