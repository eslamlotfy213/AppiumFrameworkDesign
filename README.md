"# AppiumFrameworkDesign" 


steps
download jdk
open   enviroment variable 
JAVA_HOME
  C:\Program Files\Java\jdk-18.0.1.1
open path and add 
  C:\Program Files\Java\jdk-18.0.1.1
  C:\Program Files\Java\jdk-18.0.1.1\bin


java -version

download android studio
download from link

set enviroment variables
ANDRIOD_HOME    C:\Users\Eslam.Lotfy\AppData\Local\Android\Sdk

add  2 paths Path 
  C:\Users\Eslam.Lotfy\AppData\Local\Android\Sdk\platform-tools
  C:\Users\Eslam.Lotfy\AppData\Local\Android\Sdk\tools 
  C:\Users\Eslam.Lotfy\AppData\Local\Android\Sdk\tools\bin
  C:\Users\Eslam.Lotfy\AppData\Local\Android\Sdk\emulator


enter emulator -li
enter emulator -avd phone1

go to node.js 
downlaod node.js >  msi
node -v 
npm -v
 
npm install -g appium
appium -v 
appium driver list
appium driver install uiautomator2
npm install -g appium-doctor 
appium-doctor -android



write first testcase:

open cmd > appium
open cmd > emulator -avd phone1


{
  "platformName": "Android",
  "automationName": "UiAutomator2",
  "deviceName": "Phone1",
  "app": "D://Project//Appium2//src//test//java//resources//General-Store.apk"
}


    <dependency>
            <groupId>io.appium</groupId>
            <artifactId>java-client</artifactId>
            <version>8.6.0</version>
        </dependency>






npm i --location=global appium
npm install-g appium#next

npm install -g appium
appium driver install uiautomator2
