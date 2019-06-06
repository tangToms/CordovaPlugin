# CordovaPlugin
學習Android Cordova:自定義Cordova 插件

## 項目結構
  toastPlugin:項目目錄；     
  項目目錄下：    
  node_modules目錄:Cordova使用到node.js的modules;      
  src目錄:Java代碼，插件提供的訪問Android的功能代碼，這裡提供ShowToast類，繼承CordovaPlugin類，重寫execute方法。    
  www目錄：toastPlugin.js:js中間件文件，js調用Java提供功能橋樑；     
  plugin.xml文件：插件配置文件，插件id,插件名，平台配置信息；     
  package.json文件：插件生成過程中，一些平台信息，依賴信息；     
  
  使用插件：cordova命令行工具：    
  cordova plugin add 插件所在路徑/插件項目目錄 
  
