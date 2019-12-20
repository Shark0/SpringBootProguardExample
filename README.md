#SpringBoot混淆重點
## Main Class跟Function要保留跟指定好
要不然打包成功也不能執行

##每個Bean都要命名好
要不然混淆的Bean Name會打架

##Controller Package要保留
要不然Swagger會找不到

##Get跟Set Function不要混淆
很多地方會用到Get跟Setter，像是Controller的API Function的Input物件參數、Mybatis
